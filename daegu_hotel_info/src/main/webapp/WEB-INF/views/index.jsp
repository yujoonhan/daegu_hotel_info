<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/includes/menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>대구 호텔 정보</title>
    <script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
    <!-- <link rel="stylesheet" href="/assets/css/index.css"> -->
    <script src="/assets/js/index.js"></script>
</head>
<body>
    <div class="container">
        <div class="prod_area">
            <div class="recommand_wrap">
                <c:forEach items="${hotel_list}" var="item">
                    <div class="img_area">
                    </div>
                    <a href="/detail?h_seq=${item.h_seq}" class="prod_item">
                        <div class="text_area">
                            <h2>${item.h_shop}</h2>
                        </div>
                    </a>
                </c:forEach>
            </div>
        </div>
    </div>
</body>
</html>