$(function(){
    $("#product").addClass("current");
    getProductData();
    function getProductData(){
        $("#product_tbody").html("");
        let url = "/api/hotelName";
        $.ajax({
            type:"get",
            url:url,
            success:function(r){
                console.log(r);
                for(let i=0;i<r.data.length;i++){
                    let tag =
                    '<tr>'+
                        '<td class="preview"><img src="/image/'+r.data[i].h_img_uri+'"></td>'+
                        '<td>'+r.data[i].h_shop+'</td>'+
                        '<td>'+r.data[i].h_tel+'</td>'+
                        '<td>'+r.data[i].pi_stock+'</td>'+
                        '<td>'+r.data[i].h_address+'</td>'+
                        '<td>'+r.data[i].h_offer+'</td>'+
                        '<td>'+r.data[i].h_facilities+'</td>'+
                        '<td>'+r.data[i].h_tag+'</td>'+
                        '<td>'+
                            '<button class="product_modify" data-seq="'+r.data[i].h_seq+'">수정</button>'+
                        '</td>'+
                    '</tr>'
                    $("#product_tbody").append(tag);
                }
            }
        })
    }
})