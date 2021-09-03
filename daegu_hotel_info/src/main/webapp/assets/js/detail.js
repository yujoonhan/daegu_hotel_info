$(function(){
    $("#cart_bag").click(function(){
        if(memberInfo.seq == "" || memberInfo.seq == null || memberInfo.seq == undefined){
            alert("로그인 후 사용사실 수 있습니다");
            return;
        }
        let data = {
            hc_mi_seq:memberInfo.seq,
            hc_h_seq:$(".detail_container").attr("data-prod-seq"),
        }
        $.ajax({
            type:"post",
            url:"/cart/add",
            data:JSON.stringify(data),
            contentType:"application/json",
            success:function(r){
                alert(r.message);
                location.reload();
            }
        })
    })


    $("#product_tbody").html("");
    $.ajax({
        type:"get",
        url:"/api/hotelName",
        success:function(r){
            let tag =
            '<td>'+
                '<button class="product_modify" data-seq="'+r.data.h_seq+'">확인</button>'+
            '</td>';
            $("#product_tbody").append(tag);
            $(".product_modify").click(function(){
                let seq = $(this).attr("data-seq");
                $.ajax({
                    type:"get",
                    url:"/detail?h_seq="+seq,
                    success:function(r){
                        console.log(r)
                    }
                })
            })
        }
    })


        $("#save").click(function(){
            let data = {
                h_seq:$(this).attr("save-seq"),
                h_img_uri:$("#img_preview").attr("img-uri")
            };
            $.ajax({
                type:"patch",
                url:"/hotel/api/update",
                data:JSON.stringify(data),
                contentType:"application/json",
                success:function(r){
                    console.log(r);
                    alert(r.message);
                    location.reload();
                }
            })
        })
    
        $("#img_save").click(function(){
            let form = $("#image_form");
            let formData = new FormData(form[0]);
            $.ajax({
                url:"/upload",
                type:"post",
                data:formData,
                contentType:false,
                processData:false,
                success:function(r){
                    console.log(r);
                    if(r.status){
                        $("#img_save").prop("disabled", true);
                        $("#img_delete").prop("disabled", false);
                        $("#image_form > input").prop("disabled", true);
                        $("#img_preview").append('<img src="/image/'+r.image_uri+'">');
                        $("#img_preview").attr("img-uri",r.image_uri);
                    }
                    alert(r.message);
                }
            })
        })
    
        $("#img_delete").click(function(){
            let uri = $("#img_preview").attr("img_uri");
            $("#img_preview").html("");
    
            $("#image_form > input").val("");
            $(this).prop("disabled", true);
            $("#image_form > input").prop("disabled", false);
            $("#img_save").prop("disabled", false);
    
            alert("삭제되었습니다");
        })


})