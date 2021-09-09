$(function(){
    function getHotelData(select, keyword){
        $(".hotel_search_list").html("");
        
        let url = "/api/search/"+select;
        if(keyword == undefined || keyword == null){
            keyword = "";
        }
        url += "?keyword="+keyword
        
        $.ajax({
            type:"get",
            url:url,
            success:function(r){
                // console.log(url);
                console.log(r);
                for(let i=0; i<r.list.length; i++){
                    let tag =
                    '<tr>'+
                        '<a href="/detail?h_seq='+r.list[i].h_seq+'">'+
                            '<td><img src="/image/'+r.list[i].h_img_uri+'"></td>'+
                            '<td>'+
                                '<a href="/detail?h_seq='+r.list[i].h_seq+'">'+
                                    r.list[i].h_shop+
                                "</a>"+
                            '</td>'+
                            '<td>'+r.list[i].h_address+'</td>'+
                            '<td>'+r.list[i].h_tel+'</td>'+
                            '<td>'+r.list[i].h_offer+'</td>'+
                            '<td>'+r.list[i].h_facilities+'</td>'+
                            '<td>'+r.list[i].h_tag+'</td>'+
                    '</tr>'
                    $(".hotel_search_list").append(tag);
                }
            }
        })
    }

    $("#search").click(function(){
        let select = $("#search_select option:selected").val();
        let keyword = $("#search_keyword").val();
        getHotelData(select, keyword);
    })
    


})