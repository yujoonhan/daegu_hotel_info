<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/WEB-INF/views/includes/menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>대구 호텔 정보 :: 관심 목록</title>
    <link rel="stylesheet" href="/assets/css/cart.css">
    <script src="/assets/js/cart.js"></script>
</head>
<body>
    <div class="container">
        <div class="hotel_list_area">
            <h1>나의 관심 호텔 목록</h1>
            <table>
                <thead>
                    <td></td>
                    <td>이미지</td>
                    <td>이름</td>
                    <td>주소</td>
                    <td>전화번호</td>
                    <td>제공</td>
                    <td>시설</td>
                    <td>태그</td>
                </thead>
                <tbody>
                    <c:if test="${list.size() == 0}">
                        <tr>
                            <td colspan="6" class="nodata">관심있는 호텔이 없습니다</td>
                        </tr>
                    </c:if>
                    <c:forEach items="${list}" var="item">
                        <tr class="cart_hotel" data-seq="${item.h_seq}" data-mi-seq="${member.mi_seq}">
                            <td>
                                <a href="/detail?h_seq=${item.h_seq}" class="hotel_item">
                                    <td><img src="/image/${item.h_img_uri}"></td>
                                    <td>${item.h_shop}</td>
                                    <td>${item.h_address}</td>
                                    <td>${item.h_tel}</td>
                                    <td>${item.h_offer}</td>
                                    <td>${item.h_facilities}</td>
                                    <td>${item.h_tag}</td>
                                    <td><button class="delete" data-seq="${item.h_seq}" data-user-seq="${member.mi_seq}">삭제</button></td>
                                </a>
                                
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>