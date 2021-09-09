$(function(){
    $.ajax({
        type:"get",
        url:"api/hotelName",
        success:function(r){
            console.log(r);
            for(let i=0; i<8; i++) {
                let tag = "<tbody class='hotel-tbody'></tbody>";
                $(".all_hotel_list").append(tag);
            }

            for(let i=0; i<r.data.length; i++) {
                console.log(Math.floor(i/9));
                let page = Math.floor(i/9);
                let tag =
                '<tr>'+
                    '<td>'+
                        '<a href="/detail?h_seq='+r.data[i].h_seq+'">'+
                            '<img src="/image/'+r.data[i].h_img_uri+'">'+   
                            r.data[i].h_shop+
                        '</a>'+
                    '</td>'+
                '</tr>';
                $(".hotel-tbody").eq(page).append(tag);
            }
            $(".hotel-tbody").eq(0).addClass("active");

            $("#page_next").click(function(){
                let currentPage = Number($(".current").html());
                currentPage++;
                if(currentPage > 8) currentPage = 8;
                $(".current").html(currentPage);
                $(".hotel-tbody").removeClass("active");
                $(".hotel-tbody").eq(currentPage-1).addClass("active");
            })
            $("#page_prev").click(function(){
                let currentPage = Number($(".current").html());
                currentPage--;
                if(currentPage < 1) currentPage = 1;
                $(".current").html(currentPage);
                $(".hotel-tbody").removeClass("active");
                $(".hotel-tbody").eq(currentPage-1).addClass("active");
            })
        }
    })
})