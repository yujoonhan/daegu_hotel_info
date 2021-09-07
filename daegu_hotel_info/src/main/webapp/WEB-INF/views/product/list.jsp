<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/includes/menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <!-- <link rel="stylesheet" href="/assets/css/product_list.css"> -->
</head>
<body>
    <h1>${category}</h1>
    <c:if test="${list.size() == 0}">
        <p class="nodata">등록된 호텔이 없습니다</p>
    </c:if>
    <div class="hotel_list_area">
        <c:forEach items="${list}" var="item">
            <a href="/detail?hotel_seq=${item.h_seq}">
                <span class="name">${item.h_shop}</span>
            </a>
        </c:forEach>
    </div>
</body>
</html>