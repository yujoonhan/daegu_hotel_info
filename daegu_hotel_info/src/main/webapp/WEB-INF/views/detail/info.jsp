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
    <link rel="stylesheet" href="/assets/css/detail.css">
    <script src="/assets/js/detail.js"></script>
    <script>
        let memberInfo = {
            seq:"${member.mi_seq}",
            id:"${member.mi_id}",
            name:"${member.mi_name}"
        }
    </script>
</head>
<body>
    <div class="container">
        <div class="detail_container" data-prod-seq="${product.h_seq}">
            <div class="img_area">
                <img src="/image/${product.h_img_uri}">
            </div>
            <div class="text_area">
                <table class="detail_info_table">
                    <tbody>
                        <tr>
                            <td>${product.h_shop}</td>
                        </tr>
                        <tr>
                            <td>주소</td>
                            <td>${product.h_address}</td>
                        </tr>
                        <tr>
                            <td>전화번호</td>
                            <td>${product.h_tel}</td>
                        </tr>
                        <tr>
                            <td>제공</td>
                            <td>${product.h_offer}</td>
                        </tr>
                        <tr>
                            <td>시설</td>
                            <td>${product.h_facilities}</td>
                        </tr>
                        <tr>
                            <td>태그</td>
                            <td>${product.h_tag}</td>
                        </tr>
                    </tbody>
                    <tbody  id="product_tbody">
                        
                    </tbody>
                </table>
                <button id="cart_bag">찜하기</button>
            </div>
            <div class="img_form_div">
                <span id="img_preview">
                </span>
                <form id="image_form">
                    <input type="file" accept="image/gif, image/jpeg, image/png" name="file" value="호텔이미지 선택">
                    <button type="button" id="img_save" data-seq=${product.h_seq}>사진 확인</button>
                    <button type="button" id="img_delete" disabled>삭제</button>
                    <button id="save">사진 등록하기</button>
                </form>
            </div>
        </div>
    </div>
</body>
</html>