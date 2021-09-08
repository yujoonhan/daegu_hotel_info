$(function(){
    $("#region_select").change(function(){
        let region = $("#region_select").find("option:selected").val();
        getRegionInfo(region);
    })

    function getRegionInfo(region){
        let url = "/api/tour?region="+region
        $.ajax({
            type:"get",
            url:url,
            success:function(r){
                console.log(r);
                console.log(region);
                $("#tour_region_list").html("");
                for(let i=0; i<r.list.length; i++){
                    let tag =
                    '<tr>'+
                            '<td>'+r.list[i].h_shop+'</td>'+
                            '<td>'+r.list[i].t_name+'</td>'+
                            '<td>'+r.list[i].h_address+'</td>'+
                            '<td>'+r.list[i].t_address+'</td>'+
                    '</tr>'
                    $(".tour_region_list").append(tag);
                }
            }
        })
    }

})