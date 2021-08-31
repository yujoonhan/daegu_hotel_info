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
    <link rel="stylesheet" href="/assets/css/reset.css">
    <link rel="stylesheet" href="/assets/css/index.css">
    <script src="/assets/js/index.js"></script>
</head>
<body>
    <div class="container">
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
            <div class="pager_area">
                <button id="page_prev">&lt;</button>
                <span class="current">1 </span>/ <span class="total">9</span>
                <button id="page_next">&gt;</button>
            </div>
        </div>
    </div>
</body>
</html>