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
    <!-- <script src="/assets/js/detail.js"></script> -->
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
        <div class="prod_area">
            
        </div>
    </div>
</body>
</html>