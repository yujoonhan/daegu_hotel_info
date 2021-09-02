$(function(){
    $(".delete").click(function(){
        if(!confirm("삭제하시겠습니까?")) return;
        
        let pi_seq = $(this).attr("data-seq");
        let mi_seq = $(this).attr("data-user-seq");

        $.ajax({
            type:"delete",
            url:"/cart/remove?pi_seq="+pi_seq+"&mi_seq="+mi_seq,
            success:function(r){
                alert(r.message);
                location.reload();
            }
        })
    });
})