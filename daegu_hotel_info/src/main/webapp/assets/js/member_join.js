$(function(){
    let idCheck = false;
    let emailCheck = false;

    $("#join").click(function(){
        if(idCheck == false){
            alert("아이디 중복여부를 확인해주세요")
            return;
        }
        if(emailCheck == false){
            alert("이메일 중복여부를 확인해주세요")
            return;
        }
        const pattern = /\s/g;  // 공백체크
        let user_id = $("#user_id").val();
        if(user_id == "" || user_id == null || user_id == undefined){
            alert("아이디를 입력해주세요");
            return;
        }
        if(user_id.match(pattern)){
            alert("아이디에는 공백문자가 들어갈 수 없습니다");
            return;
        }

        let user_pwd = $("#user_pwd").val();
        if(user_pwd == "" || user_pwd == null || user_pwd == undefined){
            alert("비밀번호를 입력해주세요");
            return;
        }
        if(user_pwd.match(pattern)){
            alert("비밀번호에는 공백문자가 들어갈 수 없습니다");
            return;
        }

        let user_pwd_confirm = $("#user_pwd_confirm").val();
        if(user_pwd != user_pwd_confirm){
            alert("비밀번호와 비밀번호 확인이 일치하지 않습니다");
            return;
        }
        
        let user_name = $("#user_name").val();
        if(user_name == "" || user_name == null || user_name == undefined){
            alert("이름을 입력해주세요");
            return;
        }
        if(user_name.match(pattern)){
            alert("이름에는 공백문자가 들어갈 수 없습니다");
            return;
        }
        // 이메일 표현식
        const patternEmail =/^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i;
        let user_email = $("#user_email").val();
        if(user_email == "" || user_email == null || user_email == undefined){
            alert("이메일을 입력해주세요");
            return;
        }
        if(user_email.match(pattern)){
            alert("이메일에는 공백문자가 들어갈 수 없습니다");
            return;
        }
        if(!user_email.match(patternEmail)){
            alert("올바른 형식의 이메일을 입력하세요\n예시)aaa@service.com");
            return;
        }

        let user_address = $("#user_address").val();
        let user_phone = $("#user_phone").val();

        if(!inputValidation(user_address, "주소")) {return;}
        if(!inputValidation(user_phone, "전화번호")) {return;}

        let data = {
            mi_id:user_id,
            mi_name:user_name,
            mi_email:user_email,
            mi_address:user_address,
            mi_pwd:user_pwd,
            mi_phone:user_phone
        }
        $.ajax({
            type:"post",
            url:"/member/join",
            data:JSON.stringify(data),
            contentType:"application/json",
            success:function(r){
                alert(r.message);
                // 회원가입하면 메인으로감
                if(r.status){
                    location.href="/";
                }
            },
            error:function(e) {
                alert(e.massage);
            }
        })
    });

    $("#chk_id").click(function(){
        const pattern = /\s/g;  // 공백체크 정규표현식
        let user_id = $("#user_id").val();
        if(user_id == "" || user_id == null || user_id == undefined){
            alert("아이디를 입력해주세요");
            return;
        }
        if(user_id.match(pattern)){
            alert("아이디에는 공백문자가 들어갈 수 없습니다");
            return;
        }
        $.ajax({
            type:"get",
            url:"/member/id_check?id="+user_id,
            success:function(r){
                alert(r.message);
                idCheck = r.status;
            }
        })
    });
    $("#chk_email").click(function(){
        const pattern = /\s/g;
        const patternEmail =/^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i;
        let user_email = $("#user_email").val();
        if(user_email == "" || user_email == null || user_email == undefined){
            alert("이메일을 입력해주세요");
            return;
        }
        if(user_email.match(pattern)){
            alert("이메일에는 공백문자가 들어갈 수 없습니다");
            return;
        }
        if(!user_email.match(patternEmail)){
            alert("올바른 형식의 이메일을 입력하세요\n예시)aaa@service.com");
            return;
        }

        $.ajax({
            type:"get",
            url:"/member/email_check?email="+user_email,
            success:function(r){
                alert(r.message);
                emailCheck = r.status;
            }
        })
    });

    $("#user_id").change(function(){
        idCheck = false;
    });
    $("#user_email").change(function(){
        emailCheck = false;
    });
});

function leadingZero(n){
    // 입력된 데이터를 숫자 형태로 변환
    let num = Number(n);
    // 10미만의 숫자이면 앞에 0붙인 문자열로 보내고 10이상이면 문자열행태로 보낸다
    return num<10?"0"+num:""+num
}

function inputValidation(input, type){
    if(input == "" || input == null || input == undefined){
        alert(type+"을/를 입력해주세요");
        return false;
    }
    return true;
}