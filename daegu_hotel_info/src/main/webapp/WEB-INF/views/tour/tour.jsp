<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/includes/menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>주변 관광 정보</title>
    <script src="http://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="/assets/js/tour.js"></script>
</head>
<body>
    <div class="container">
        <select id="region_select">
            <option value="남구">남구</option>
            <option value="달서구">달서구</option>
            <option value="달성군">달성군</option>
            <option value="동구">동구</option>
            <option value="북구">북구</option>
            <option value="서구">서구</option>
            <option value="수성구">수성구</option>
            <option value="중구">중구</option>
        </select>
        <div class="tour_list">
            <table>
                <tbody class="tour_region_list">

                </tbody>
            </table>
        </div>
    </div>
</body>
</html>