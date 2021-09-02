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
            <h1>찜 목록</h1>
            <table>
                <thead>
                    <tr>
                        <td>
                            <input type="checkbox" id="check_all">
                            <label for="check_all">
                                <span>전체선택</span>
                            </label>
                            <span class="count">
                                (<span class="sel">0</span>/<span class="total">${list.size()}</span>)
                            </span>
                        </td>
                        <td>
                            <button class="delete_selected">선택삭제</button>
                        </td>
                    </tr>
                </thead>
                <tbody>
                    <c:if test="${list.size() == 0}">
                        <tr>
                            <td colspan="6" class="nodata">찜한 호텔이 없습니다</td>
                        </tr>
                    </c:if>
                    <c:forEach items="${list}" var="item">
                        <tr class="cart_prod" data-seq="${item.h_seq}" data-mi-seq="${member.mi_seq}">
                            <td>
                                <input type="checkbox" data-seq="${item.pi_seq}" id="sel${item.pi_seq}">
                                <label for="sel${item.pi_seq}">선택</label>
                            </td>
                            <td>
                                <!-- <img src="/image/${item.pi_img_uri}"> -->
                            </td>
                            <td>
                                <p>${item.h_shop}</p>
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