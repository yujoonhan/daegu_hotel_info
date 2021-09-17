<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/includes/menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>대구 호텔 정보</title>
    <script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
    <link rel="stylesheet" href="/assets/css/index.css">
    <script src="/assets/js/index.js"></script>
</head>
<body>
    <div class="container">
        <div class="all_hotel_list"></div>
            <!-- 호텔 목록 표시 -> js에서 테이블을 이용한 표시로 변경 -->
            <!-- <c:forEach items="${hotel_list}" var="item">
                <a href="/detail?h_seq=${item.h_seq}" class="prod_item">
                    <div class="img_area">
                        <img src="/image/${item.h_img_uri}">
                    </div>
                    <div class="text_area">
                        <h2>${item.h_shop}</h2>
                    </div>
                </a>
            </c:forEach> -->
        <div class="pager_area">
            <button id="page_prev">&lt;</button>
            <span class="current">1</span> / <span class="total">8</span>
            <button id="page_next">&gt;</button>
        </div>
    </div>
</body>
</html>