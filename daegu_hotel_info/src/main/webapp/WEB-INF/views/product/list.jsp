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
        <p class="nodata">등록된 제품이 없습니다</p>
    </c:if>
    <div class="prod_area">
        <c:forEach items="${list}" var="item">
            <a href="/detail?prod_seq=${item.pi_seq}">
                <!-- <span class="img_box">
                    <img src="/image/${item.pi_img_uri}">
                </span> -->
                <span class="name">[${item.seller_name}] ${item.pi_name}</span>
            </a>
        </c:forEach>
    </div>
</body>
</html>