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
    <div class="container">
        <div class="search_area">
            <select id="search_select">
                <option value="nam">호텔 이름</option>
                <option value="adr">주소</option>
                <option value="ofr">제공</option>
                <option value="fac">시설</option>
                <option value="tag">태그</option>
            </select>
            <input type="text" id="search_keyword" placeholder="검색">
            <button id="search">찾기</button>
        </div>
        <div class="search_result">
            <table>
                <thead>
                    <td id="td_img">이미지</td>
                    <td id="td_name">이름</td>
                    <td id="td_adr">주소</td>
                    <td id="td_tel">전화번호</td>
                    <td id="td_off">제공</td>
                    <td id="td_fac">시설</td>
                    <td id="td_tag">태그</td>
                </thead>
                <tbody class="hotel_search_list">

                </tbody>
            </table>
        </div>
    </div>
</body>
</html>