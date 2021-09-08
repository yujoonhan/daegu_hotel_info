$(function(){

    // 찜하기
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

    // db의 daegu_hotel_info 테이블에 저장
    $("#save").click(function(){
        let data = {
            h_seq:hotelInfo.h_seq,
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
    
    // 선택한 이미지를 확인, db의 hotel_image 테이블에 저장
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
    
    // 선택한 이미지 삭제
    $("#img_delete").click(function(){
        let uri = $("#img_preview").attr("img_uri");
        $("#img_preview").html("");

        $("#image_form > input").val("");
        $(this).prop("disabled", true);
        $("#image_form > input").prop("disabled", false);
        $("#img_save").prop("disabled", false);

        alert("삭제되었습니다");
    })

    // 호텔 지역(구 기준)과 같은 관광 지역 찾기
    let url = "/api/tour?h_seq="+hotelInfo.h_seq
    let region = hotelInfo.h_address
    let region_s = region.substr(0, 2)
    url += "&region="+region_s
    $.ajax({
        url:url,
        type:"get",
        success:function(r){
            console.log(r);
            console.log(region_s);
        }
    })

})
