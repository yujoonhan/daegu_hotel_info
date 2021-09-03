<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/WEB-INF/views/includes/menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <link rel="stylesheet" href="/assets/css/cart.css">
    <script src="/assets/js/cart.js"></script>
</head>
<body>
    <div class="container">
        <div class="prod_area">
            <h1>관심 목록</h1>
            <table>
                <tbody>
                    <c:if test="${list.size() == 0}">
                        <tr>
                            <td colspan="6" class="nodata">관심있는 호텔이 없습니다</td>
                        </tr>
                    </c:if>
                    <c:forEach items="${list}" var="item">
                        <tr class="cart_prod" data-seq="${item.h_seq}" data-mi-seq="${member.mi_seq}">
                            <td>
                                <h2>이미지 자리</h2>
                            </td>
                            <td>
                                <a href="/detail?h_seq=${item.h_seq}" class="prod_item">
                                    <div class="text_area">
                                        <h2>${item.h_shop}</h2>
                                    </div>
                                </a>
                            </td>
                            <td>
                                <button class="delete" data-seq="${item.h_seq}" data-user-seq="${member.mi_seq}">&times;</button>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>