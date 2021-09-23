<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/includes/menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="/assets/js/detail.js"></script>
    <link rel="stylesheet" href="/assets/css/detail.css">
    <script>
        let memberInfo = {
            seq:"${member.mi_seq}",
            id:"${member.mi_id}",
            name:"${member.mi_name}"
        }
        let hotelInfo = {
            h_seq:"${product.h_seq}",
            h_address:"${product.h_address}"
        }
    </script>
</head>
<body>
    <div class="container">
        <div class="detail_container" data-prod-seq="${product.h_seq}">
            <div class="img_area">
                <img src="/image/${product.h_img_uri}">
            </div>
            <div class="text_area">
                <div class="product_list list">
                    <table id="product_table">
                        <thead>
                            <tr>
                                <td>${product.h_shop}</td>
                            </tr>
                            <tr>
                                <td>${product.h_address}</td>
                            </tr>
                            <tr>
                                <td>${product.h_tel}</td>
                            </tr>
                            <tr>
                                <td>${product.h_offer}</td>
                            </tr>
                            <tr>
                                <td>${product.h_facilities}</td>
                            </tr>
                            <tr>
                                <td>${product.h_tag}</td>
                            </tr>
                        </thead>
                        <tbody id="product_tbody">
                            
                        </tbody>
                    </table>
                </div>
                <button id="cart_bag">관심 목록에 추가</button>
            </div>
            <div class="img_form_div">
                <span id="img_preview">
                </span>
                <form id="image_form">
                    <input type="file" accept="image/gif, image/jpeg, image/png" name="file" value="호텔이미지 선택">
                    <button type="button" id="img_save" data-seq=${product.h_seq}>사진 확인</button>
                    <button type="button" id="img_delete" disabled>삭제</button>
                    <button id="save">사진 등록하기</button>
                </form>
            </div>
            <div id="map" style="width:500px;height:400px;"></div>
            <script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=9690c185cffddbedc14fd293bb5bc1b6&libraries=services"></script>
            <script>
                var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
                mapOption = {
                center: new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표
                level: 3 // 지도의 확대 레벨
                };  
                
                // 지도를 생성합니다    
                var map = new kakao.maps.Map(mapContainer, mapOption); 

                // 주소-좌표 변환 객체를 생성합니다
                var geocoder = new kakao.maps.services.Geocoder();

                // 주소로 좌표를 검색합니다
                geocoder.addressSearch("대구광역시 ${product.h_address}", function(result, status) {
                
                    // 정상적으로 검색이 완료됐으면 
                    if (status === kakao.maps.services.Status.OK) {
                
                        var coords = new kakao.maps.LatLng(result[0].y, result[0].x);
                        
                        // 결과값으로 받은 위치를 마커로 표시합니다
                        var marker = new kakao.maps.Marker({
                            map: map,
                            position: coords
                        });
                    
                        // 인포윈도우로 장소에 대한 설명을 표시합니다
                        var infowindow = new kakao.maps.InfoWindow({
                            content: '<div style="width:150px;text-align:center;padding:6px 0;">호텔</div>'
                        });
                        infowindow.open(map, marker);
                    
                        // 지도의 중심을 결과값으로 받은 위치로 이동시킵니다
                        map.setCenter(coords);
                    }
                })
            </script>
            <div class="tour_info">
                <button id="tour_btn">주변 광광지 정보 보기</button>
            </div>
        </div>
    </div>
</body>
</html>