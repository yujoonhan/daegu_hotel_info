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
    <script src="https://cdn.jsdelivr.net/npm/chart.js@3.5.0/dist/chart.min.js"></script>
</head>
<body>
    <div class="main_menu">
        <select id="search_region">
            <option value="남구">남구</option>
            <option value="달서구">달서구</option>
            <option value="달성군">달성군</option>
            <option value="동구">동구</option>
            <option value="북구">북구</option>
            <option value="서구">서구</option>
            <option value="수성구">수성구</option>
            <option value="중구">중구</option>
        </select>
        <select id="search_offer">
            <option value="morning_call">모닝콜</option>
            <option value="bbq">바베큐</option>
            <option value="laundry">세탁서비스</option>
            <option value="breakfast">조식제공</option>
            <option value="storage">짐보관</option>
            <option value="coffee">커피제공</option>
        </select>
        <select id="search_fas">
            <option value="internet">무료인터넷</option>
            <option value="parking">무료주차</option>
            <option value="pet">반려동물 동반가능</option>
            <option value="business">비지니스 편의시설</option>
            <option value="disabled">장애인 편의시설</option>
            <option value="cof_pub">카페/펍</option>
        </select>
    </div>
</body>
</html>