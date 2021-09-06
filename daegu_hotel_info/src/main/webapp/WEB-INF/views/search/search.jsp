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
            <select id="search_select">
                <option value="nam_list">호텔 이름</option>
                <option value="add_list">주소</option>
                <option value="off_list">제공</option>
                <option value="fac_list">시설</option>
                <option value="tag_list">태그</option>
            </select>
            <input type="text" id="search_hotel" placeholder="태그 검색">
            <button id="search">찾기</button>
        </div>
        <div class="all_hotel_list">
            <table>
                <tbody>

                </tbody>
            </table>
        </div>
    </div>
</body>
</html>