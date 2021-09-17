<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/WEB-INF/views/includes/menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>대구 호텔 정보 :: 관심 목록</title>
    <link rel="stylesheet" href="/assets/css/cart.css">
    <script src="/assets/js/cart.js"></script>
</head>
<body>
    <div class="container">
        <div class="hotel_list_area">
            <h1>나의 관심 호텔 목록</h1>
            <c:if test="${list.size() == 0}">
                <h1>관심있는 호텔이 없습니다</h1>
            </c:if>
            <c:forEach items="${list}" var="item">
                <div class="cart_hotel" data-seq="${item.h_seq}" data-mi-seq="${member.mi_seq}">
                    <a href="/detail?h_seq=${item.h_seq}" class="hotel_item">
                        <div class="img_area">
                            <img src="/image/${item.h_img_uri}">
                        </div>
                        <div class="text_area">
                            <h2>${item.h_shop}</h2>
                        </div>
                    </a>
                        <div class="button_area">
                            <button class="delete" data-seq="${item.h_seq}" data-user-seq="${member.mi_seq}">삭제</button>
                        </div>
                </div>
            </c:forEach>
        </div>
    </div>
</body>
</html>