$(function(){
    $("#cart_bag").click(function(){
        if(memberInfo.seq == "" || memberInfo.seq == null || memberInfo.seq == undefined){
            alert("로그인 후 사용사실 수 있습니다");
            return;
        }
        let data = {
            sc_mi_seq:memberInfo.seq,
            sc_pi_seq:$(".detail_container").attr("data-prod-seq"),
            sc_count:$("#count").html()
        }
        $.ajax({
            type:"post",
            url:"/cart/add",
            data:JSON.stringify(data),
            contentType:"application/json",
            success:function(r){
                alert(r.message);
                location.reload();
            }
        })
    })
})