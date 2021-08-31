<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/includes/menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="/assets/js/search.js"></script>
    <link rel="stylesheet" href="/assets/css/search.css">
</head>
<body>
    <div class="container">
        <div class="search_area">
            <h2>내가 원하는 호텔을 찾아 보세요</h2>
            <p>시설이 좋은 곳</p>
            <button id="btn_dis">장애인을 위한 편의 시설</button>
            <button id="btn_bus">비즈니스를 위한 편의 시설</button>
            <button id="btn_ent">유흥 있는 시설</button>           
            <button id="btn_vid">좋은 영상 시청 시설</button>             
            <button id="btn_hea">건강을 위한 시설</button>       
            <p>서비스가 좋은 곳</p>
            <button id="btn_bre">조식을 제공</button>
            <button id="btn_mor">모닝콜을 제공</button>     
            <button id="btn_lau">세탁서비스를 제공</button>                  
            <p>주변 환경이 좋은 곳</p>
            <button id="btn_tra">교통 시설의 주변</button> 
            <button id="btn_str">유명 거리의 주변</button> 
            <button id="btn_fac">유명 시설의 주변</button> 
            <button id="btn_nat">자연 환경의 주변</button> 
        </div>
        <div class="prod_area">
            <table class="hotel_table">
                <thead>
                    <tr>
                        <td>이름</td>
                        <td>전화번호</td>
                        <td>주소</td>
                        <td>제공</td>
                        <td>시설</td>
                        <td>태그</td>
                    </tr>
                </thead>
            </table>
        </div>
    </div>
</body>
</html>