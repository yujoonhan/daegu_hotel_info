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
    <!-- <script src="/assets/js/index.js"></script> -->
</head>
<body>
    <div class="container">
        <div class="prod_area">
            <!-- <table class="hotel_table">
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
            <div class="pager_area">
                <button id="page_prev">&lt;</button>
                <span class="current">1 </span>/ <span class="total">9</span>
                <button id="page_next">&gt;</button>
            </div> -->
            <div class="recommand_wrap">
                <a href="/detail?prod_seq=${item.h_seq}" class="recommand_item prod_item">
                    <!-- <div class="img_area">
                        <img src="/image/${item.pi_img_uri}">
                    </div> -->
                    <div class="text_area">
                        <h2>${item.h_shop}</h2>
                    </div>
                </a>
            </div>
        </div>
    </div>
</body>
</html>