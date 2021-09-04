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
        <div class="product_list list">
            <table id="product_table">
                <thead>
                    <tr>
                        <td>호텔 이미지</td>
                        <td>호텔이름</td>
                        <td>전화번호</td>
                        <td>주소</td>
                        <td>제공</td>
                        <td>시설</td>
                        <td>태그</td>
                    </tr>
                </thead>
                <tbody id="product_tbody">
                    
                </tbody>
            </table>
        </div>
    </div>
            <!-- <div class="recommand_wrap">
                <c:forEach items="${hotel_list}" var="item">
                    <div class="img_area">
                    </div>
                    <a href="/detail?h_seq=${item.h_seq}" class="prod_item">
                        <div class="text_area">
                            <h2>${item.h_shop}</h2>
                        </div>
                    </a>
                </c:forEach>
            </div> -->

</body>
</html>