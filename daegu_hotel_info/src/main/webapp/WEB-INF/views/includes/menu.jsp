<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    response.setHeader("Cache-Control", "no-store");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", 0);
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>대구 호텔 정보</title>
    <script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
    <link rel="stylesheet" href="/assets/css/reset.css">
    <link rel="stylesheet" href="/assets/css/menu.css">
    <script src="/assets/js/menu.js"></script>
</head>
<body>
    <div class="container">
        <div class="banner_area">
            <a href="/">
                <img src="/assets/images/hotel_logo_256.png">
            </a>
        </div>
        <div class="main_menu">
            <a href="/tour">주변 관광 정보</a>
            <a href="/search">호텔 찾기</a>
            <a href="/cart/${member.mi_id}?hGp3lVn=${member.mi_seq}" id="hotel_cart">
                내 관심 호텔
            </a>
            <c:if test="${member == null}">
                <a href="/login">로그인</a>
                <a href="/join">회원가입</a>
            </c:if>
            <c:if test="${member != null}">
                <p>${member.mi_name}님</p>
                <a href="#" id="logout">로그아웃</a>
            </c:if>
        </div>
    </div>
</body>
</html>