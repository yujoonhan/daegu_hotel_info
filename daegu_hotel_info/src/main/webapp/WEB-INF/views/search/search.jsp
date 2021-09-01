<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/includes/menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="/assets/js/search.js"></script>
    <link rel="stylesheet" href="/assets/css/search.css">
</head>
<body>
    <div class="prod_area">
        <div class="search_area">
            <h2>내가 원하는 호텔을 찾다</h2>
            <h2>나는 시설 원한다</h2>
            <button id="btn_dis">장애인 위한 편의 시설</button>
            <button id="btn_bus">비즈니스 위한 편의 시설</button>
            <button id="btn_ent">유흥 위한 시설</button>           
            <button id="btn_vid">영상 시청 위한 시설</button>             
            <button id="btn_hea">건강 위한 시설</button>  
            <h2>있다</h2>     
            <h2>나는 서비스 원한다</h2>
            <button id="btn_bre">아침 꼭 먹어야 한다</button>
            <button id="btn_mor">아침에 깨워야 한다</button>     
            <button id="btn_lau">깨끗한 의류 원한다</button>  
            <h2>있다</h2>                 
            <h2>나는 자연 환경 원한다</h2>
            <button id="btn_tra">주변에 교통 시설</button> 
            <button id="btn_str">주변에 유명 거리</button> 
            <button id="btn_fac">주변에 유명 시설</button> 
            <button id="btn_nat">주변에 자연 환경</button> 
            <h2>있다</h2>  
        </div>
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

</body>
</html>