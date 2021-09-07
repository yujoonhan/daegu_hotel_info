<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/includes/menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <script src="/assets/js/login.js"></script>
    <link rel="stylesheet" href="/assets/css/member_join.css">
    <script>
        <c:if test="${member != null}">
            location.href = "/";
        </c:if>
    </script>
</head>
<body>
    <div class="hotel_list_area">
        <h1 class="title">로그인</h1>
        <table class="table">
            <tbody>
                <tr>
                    <td>아이디</td>
                    <td colspan="3">
                        <input type="text" id="user_id">
                    </td>
                </tr>
                <tr>
                    <td>비밀번호</td>
                    <td colspan="3">
                        <input type="password" id="user_pwd">
                    </td>
                </tr>
                <tr>
                    <td colspan="4">
                        <button id="login_btn">로그인</button>
                    </td>
                    <td colspan="4">
                        <button id="chk_email">
                            <a href="/join">회원가입</a>
                        </button>
                    </td>
                </tr>
            </tbody>
        </div>
    </div>
</body>
</html>