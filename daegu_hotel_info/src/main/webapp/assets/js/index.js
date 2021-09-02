$(function(){
    $.ajax({
        type:"get",
        url:"/api/hotelName",
        success:function(r){
            console.log(r);

            // for(let i=0; i<r.hotelName.length; i++){
            //     let tag =
            //         '<a href="/">'+
            //             r.hotelName[i].h_shop+
            //         '</a>';
            //     $(".prod_area").append(tag);
            // }

            // for(let i=0; i<9; i++){
            //     let tag = "<tbody class='hotel-tbody'><tbody>";
            //     $(".hotel_table").append(tag);
            // }

            // for(let i=0; i<r.hotelName.length; i++){
            //     console.log(Math.floor(i/8));
            //     let page = Math.floor(i/8);
            //     let tag =
            //         '<tr>'+
            //             '<td>'+r.hotelName[i].h_shop+'</td>'+
            //             '<td>'+r.hotelName[i].h_tel+'</td>'+
            //             '<td>'+r.hotelName[i].h_address+'</td>'+
            //             '<td>'+r.hotelName[i].h_offer+'</td>'+
            //             '<td>'+r.hotelName[i].h_facilities+'</td>'+
            //             '<td>'+r.hotelName[i].h_tag+'</td>'+
            //         "</tr>";
            //     $(".hotel-tbody").eq(page).append(tag);
            // }
            // $(".hotel-tbody").eq(0).addClass("active");

            // $("#page_next").click(function(){
            //     let currentPage = Number($(".current").html());
            //     currentPage++;
            //     if(currentPage > 9) currentPage = 9;
            //     $(".current").html(currentPage);
            //     $(".hotel-tbody").removeClass("active");
            //     $(".hotel-tbody").eq(currentPage-1).addClass("active");
            // })
            // $("#page_prev").click(function(){
            //     let currentPage = Number($(".current").html());
            //     currentPage--;
            //     if(currentPage < 1) currentPage = 1;
            //     $(".current").html(currentPage);
            //     $(".hotel-tbody").removeClass("active");
            //     $(".hotel-tbody").eq(currentPage-1).addClass("active");
            // })
        }
    })

})