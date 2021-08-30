$(function(){
    $.ajax({
        type:"get",
        url:"/api/hotelName",
        success:function(r){
            console.log(r);
            $(".each_hotel_area").html("");
            // '<img src="/image/${item.pi_img_uri}">'+
            for(let i=0; i<r.hotelName.length; i++){
                let tag =
                    '<div class="each_hotel_area">'+
                        '<a href="#" class="prod_item">'+
                            '<div class="img_area">'+
                            '</div>'+
                            '<div class="text_area">'+
                                '<h2>'+r.hotelName[i].h_shop+'</h2>'+
                            '</div>'+
                        '</a>'+
                    "</div>";
                $(".prod_area").append(tag);
            }
        }
    })

    // $("#search_region").change(function(){
    //     let region = $("#search_region").find("option:selected").val();
    //     getSearchRegion(region);
    // });

    // getSearchRegion("중구")

    // function getSearchRegion(region){
    //     $.ajax({
    //         type:"get",
    //         url:"/api/searchRegion/"+region,
    //         success:function(r){
    //             console.log(r);
    //             $(".each_hotel_area").html("");
    //             for(let i=0; i<r.searchRegion.length; i++){
    //                 let tag =
    //                     '<div class="each_hotel_area">'+
    //                         '<a href="#" class="prod_item">'+
    //                             '<div class="img_area">'+
    //                             '</div>'+
    //                             '<div class="text_area">'+
    //                                 '<h2>'+r.searchRegion[i].h_shop+'</h2>'+
    //                             '</div>'+
    //                         '</a>'+
    //                     "</div>";
    //                 $(".prod_area").append(tag);
    //             }
    //         }
    //     })
    // }
})