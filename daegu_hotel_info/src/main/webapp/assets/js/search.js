$(function(){
    $("#search_select").change(function(){
        let select = $("#search_select").find("option:selected").val();
        getHotelSelect(select);
    })
    
    // $("#search").click(function(){  
    //     let select = $("#search_select").find("option:selected").val();
    //     let keyword = $("#search_keyword").val();
    //     getHotelSelect(keyword, select);
    // })

    $("#product").addClass("current");
    getHotelSelect();

    function getHotelSelect(select){
        $(".all_hotel_list").html("");

        let url = "/api/search/"+select;
        // if(keyword != undefined || keyword != null) {
        //     url = url+"?keyword="+keyword;
        // }
        $.ajax({
            type:"get",
            url:url,
            success:function(r){
                console.log(url);
                for(let i=0; i<r.data.length; i++){
                    let tag =
                        '<tr>'+
                            '<td><img src="/image/'+r.data[i].h_img_uri+'"></td>'+
                            '<td>'+r.data[i].h_shop+'</td>'+
                            '<td>'+r.data[i].h_address+'</td>'+
                            '<td>'+r.data[i].h_tel+'</td>'+
                            '<td>'+r.data[i].h_offer+'</td>'+
                            '<td>'+r.data[i].h_facilities+'</td>'+
                            '<td>'+r.data[i].h_tag+'</td>'+
                        '</tr>'
                    $(".all_hotel_list").append(tag);
                }
            }
        })
    }

})