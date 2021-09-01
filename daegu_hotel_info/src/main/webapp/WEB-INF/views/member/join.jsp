<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/includes/menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <script src="/assets/js/member_join.js"></script>
    <link rel="stylesheet" href="/assets/css/member_join.css">
</head>
<body>
    <div class="prod_area">
        <h1 class="title">회원가입</h1>
        <table class="table">
            <tbody>
                <tr>
                    <td>아이디</td>
                    <td colspan="3">
                        <input type="text" id="user_id">
                    </td>
                    <td >
                        <button id="chk_id">중복확인</button>
                    </td>
                </tr>
                <tr>
                    <td>비밀번호</td>
                    <td colspan="3">
                        <input type="password" id="user_pwd">
                    </td>
                </tr>
                <tr>
                    <td>비밀번호 확인</td>
                    <td colspan="3">
                        <input type="password" id="user_pwd_confirm">
                    </td>
                </tr>
                <tr>
                    <td>이름</td>
                    <td colspan="3">
                        <input type="text" id="user_name">
                    </td>
                </tr>
                <tr>
                    <td>이메일</td>
                    <td colspan="3">
                        <input type="text" id="user_email">
                    </td>
                    <td>
                        <button id="chk_email">중복확인</button>
                    </td>
                </tr>
                <tr>
                    <td>주소</td>
                    <td colspan="3">
                        <input type="text" id="user_address">
                    </td>
                </tr>
                <tr>
                    <td>전화번호</td>
                    <td colspan="3">
                        <input type="text" id="user_phone">
                    </td>
                </tr>
                <tr>
                    <td colspan="4">
                        <button id="join">회원가입</button>
                    </td>
                </tr>
            </tbody>
        </table>
    </div>
</body>
</html>