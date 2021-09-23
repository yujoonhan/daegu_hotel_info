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

    // 호텔 지역(구 기준)과 같은 관광 지역 찾고 표시
    $("#tour_btn").click(function(){
        $("#tour_btn").hide();
        let tour =
        '<p>주변 관광지 정보</p>'+
        '<table class="tour_table">'+
            '<thead class="tour_head">'+
                '<td id="tu_name">관광지 이름</td>'+
                '<td id="tu_adr">주소</td>'+
                '<td id="tu_tel">전화전호</td>'+
                '<td id="tu_cont">설명</td>'+
            '</thead>'+
        '</table>'+
        '<div class="pager_area">'+
            '<button id="page_prev">&lt;</button>'+
            '<span class="current">1</span>'+
            '<button id="page_next">&gt;</button>'+
        '</div>'
        $(".tour_info").append(tour);

        let url = "/api/tour?h_seq="+hotelInfo.h_seq
        let region = hotelInfo.h_address
        let region_s = region.substr(0, 2)
        url += "&region="+region_s
        $.ajax({
            type:"get",
            url:url,
            success:function(r){
                // console.log(r);
                let cnt = Math.ceil(r.list.length / 5);
                // console.log(cnt);

                for(let i=0; i<cnt; i++){
                    let tag = "<tbody class='tour_tbody'></tbody>";
                    $(".tour_table").append(tag);
                }

                for(let i=0; i<r.list.length; i++) {
                    if(r.list[i].t_tel == null){
                        r.list[i].t_tel = "없음";
                    }
                    console.log(Math.floor(i/5));
                    let page = Math.floor(i/5);
                    let tag =
                    '<tr>'+
                        '<td>'+r.list[i].t_name+'</td>'+
                        '<td>'+r.list[i].t_address+'</td>'+
                        '<td>'+r.list[i].t_tel+'</td>'+
                        '<td>'+r.list[i].t_contents+'</td>'+
                    '</tr>';
                    $(".tour_tbody").eq(page).append(tag);
                }
                $(".tour_tbody").eq(0).addClass("active");

                $("#page_next").click(function(){
                    let currentPage = Number($(".current").html());
                    currentPage++;
                    if(currentPage > cnt) currentPage = cnt;
                    $(".current").html(currentPage);
                    $(".tour_tbody").removeClass("active");
                    $(".tour_tbody").eq(currentPage-1).addClass("active");
                })
                $("#page_prev").click(function(){
                    let currentPage = Number($(".current").html());
                    currentPage--;
                    if(currentPage < 1) currentPage = 1;
                    $(".current").html(currentPage);
                    $(".tour_tbody").removeClass("active");
                    $(".tour_tbody").eq(currentPage-1).addClass("active");
                })
            }
        })
    })
})

