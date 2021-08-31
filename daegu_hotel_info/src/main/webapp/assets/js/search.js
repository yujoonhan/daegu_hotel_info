$(function(){
    $("#btn_dis").one("click", function(){
        $.ajax({
            type:"get",
            url:"/api/searchDis",
            success:function(r){
                console.log(r);
                for(let i=0; i<9; i++){
                    let tag = "<tbody class='hotel-tbody'><tbody>";
                    $(".hotel_table").append(tag);
                }
                for(let i=0; i<r.searchDis.length; i++){
                    let tag =
                        '<tr>'+
                            '<td>'+r.searchDis[i].h_shop+'</td>'+
                            '<td>'+r.searchDis[i].h_tel+'</td>'+
                            '<td>'+r.searchDis[i].h_address+'</td>'+
                            '<td>'+r.searchDis[i].h_offer+'</td>'+
                            '<td>'+r.searchDis[i].h_facilities+'</td>'+
                            '<td>'+r.searchDis[i].h_tag+'</td>'+
                        "</tr>";
                    $(".hotel_table").append(tag);
                }

                $("#btn_bus").hide('click');
                $("#btn_ent").hide('click');
                $("#btn_vid").hide('click');
                $("#btn_hea").hide('click');
                $("#btn_bre").hide('click');
                $("#btn_mor").hide('click');
                $("#btn_lau").hide('click');
            }
        })
    })

    $("#btn_bus").one("click", function(){
        $.ajax({
            type:"get",
            url:"/api/searchBus",
            success:function(r){
                console.log(r);
                for(let i=0; i<9; i++){
                    let tag = "<tbody class='hotel-tbody'><tbody>";
                    $(".hotel_table").append(tag);
                }
                for(let i=0; i<r.searchBus.length; i++){
                    let tag =
                        '<tr>'+
                            '<td>'+r.searchBus[i].h_shop+'</td>'+
                            '<td>'+r.searchBus[i].h_tel+'</td>'+
                            '<td>'+r.searchBus[i].h_address+'</td>'+
                            '<td>'+r.searchBus[i].h_offer+'</td>'+
                            '<td>'+r.searchBus[i].h_facilities+'</td>'+
                            '<td>'+r.searchBus[i].h_tag+'</td>'+
                        "</tr>";
                    $(".hotel_table").append(tag);
                }
                $("#btn_dis").hide('click');
                $("#btn_ent").hide('click');
                $("#btn_vid").hide('click');
                $("#btn_hea").hide('click');
                $("#btn_bre").hide('click');
                $("#btn_mor").hide('click');
                $("#btn_lau").hide('click');
            }
        })
    })

    $("#btn_ent").one("click", function(){
        $.ajax({
            type:"get",
            url:"/api/searchEnt",
            success:function(r){
                console.log(r);
                for(let i=0; i<9; i++){
                    let tag = "<tbody class='hotel-tbody'><tbody>";
                    $(".hotel_table").append(tag);
                }
                for(let i=0; i<r.searchEnt.length; i++){
                    let tag =
                        '<tr>'+
                            '<td>'+r.searchEnt[i].h_shop+'</td>'+
                            '<td>'+r.searchEnt[i].h_tel+'</td>'+
                            '<td>'+r.searchEnt[i].h_address+'</td>'+
                            '<td>'+r.searchEnt[i].h_offer+'</td>'+
                            '<td>'+r.searchEnt[i].h_facilities+'</td>'+
                            '<td>'+r.searchEnt[i].h_tag+'</td>'+
                        "</tr>";
                    $(".hotel_table").append(tag);
                }
                $("#btn_dis").hide('click');
                $("#btn_bus").hide('click');
                $("#btn_vid").hide('click');
                $("#btn_hea").hide('click');
                $("#btn_bre").hide('click');
                $("#btn_mor").hide('click');
                $("#btn_lau").hide('click');
            }
        })
    })

    $("#btn_vid").one("click", function(){
        $.ajax({
            type:"get",
            url:"/api/searchVid",
            success:function(r){
                console.log(r);
                for(let i=0; i<9; i++){
                    let tag = "<tbody class='hotel-tbody'><tbody>";
                    $(".hotel_table").append(tag);
                }
                for(let i=0; i<r.searchVid.length; i++){
                    let tag =
                        '<tr>'+
                            '<td>'+r.searchVid[i].h_shop+'</td>'+
                            '<td>'+r.searchVid[i].h_tel+'</td>'+
                            '<td>'+r.searchVid[i].h_address+'</td>'+
                            '<td>'+r.searchVid[i].h_offer+'</td>'+
                            '<td>'+r.searchVid[i].h_facilities+'</td>'+
                            '<td>'+r.searchVid[i].h_tag+'</td>'+
                        "</tr>";
                    $(".hotel_table").append(tag);
                }
                $("#btn_dis").hide('click');
                $("#btn_bus").hide('click');
                $("#btn_ent").hide('click');
                $("#btn_hea").hide('click');
                $("#btn_bre").hide('click');
                $("#btn_mor").hide('click');
                $("#btn_lau").hide('click');
            }
        })
    })

    $("#btn_hea").one("click", function(){
        $.ajax({
            type:"get",
            url:"/api/searchHea",
            success:function(r){
                console.log(r);
                for(let i=0; i<9; i++){
                    let tag = "<tbody class='hotel-tbody'><tbody>";
                    $(".hotel_table").append(tag);
                }
                for(let i=0; i<r.searchHea.length; i++){
                    let tag =
                        '<tr>'+
                            '<td>'+r.searchHea[i].h_shop+'</td>'+
                            '<td>'+r.searchHea[i].h_tel+'</td>'+
                            '<td>'+r.searchHea[i].h_address+'</td>'+
                            '<td>'+r.searchHea[i].h_offer+'</td>'+
                            '<td>'+r.searchHea[i].h_facilities+'</td>'+
                            '<td>'+r.searchHea[i].h_tag+'</td>'+
                        "</tr>";
                    $(".hotel_table").append(tag);
                }
                $("#btn_dis").hide('click');
                $("#btn_bus").hide('click');
                $("#btn_ent").hide('click');
                $("#btn_vid").hide('click');
                $("#btn_bre").hide('click');
                $("#btn_mor").hide('click');
                $("#btn_lau").hide('click');
            }
        })
    })


    $("#btn_bre").one("click", function(){
        $.ajax({
            type:"get",
            url:"/api/searchBre",
            success:function(r){
                console.log(r);
                for(let i=0; i<9; i++){
                    let tag = "<tbody class='hotel-tbody'><tbody>";
                    $(".hotel_table").append(tag);
                }
                for(let i=0; i<r.searchBre.length; i++){
                    let tag =
                        '<tr>'+
                            '<td>'+r.searchBre[i].h_shop+'</td>'+
                            '<td>'+r.searchBre[i].h_tel+'</td>'+
                            '<td>'+r.searchBre[i].h_address+'</td>'+
                            '<td>'+r.searchBre[i].h_offer+'</td>'+
                            '<td>'+r.searchBre[i].h_facilities+'</td>'+
                            '<td>'+r.searchBre[i].h_tag+'</td>'+
                        "</tr>";
                    $(".hotel_table").append(tag);
                }
                $("#btn_dis").hide('click');
                $("#btn_bus").hide('click');
                $("#btn_ent").hide('click');
                $("#btn_vid").hide('click');
                $("#btn_hea").hide('click');
                $("#btn_mor").hide('click');
                $("#btn_lau").hide('click');
            }
        })
    })

    $("#btn_mor").one("click", function(){
        $.ajax({
            type:"get",
            url:"/api/searchMor",
            success:function(r){
                console.log(r);
                for(let i=0; i<9; i++){
                    let tag = "<tbody class='hotel-tbody'><tbody>";
                    $(".hotel_table").append(tag);
                }
                for(let i=0; i<r.searchMor.length; i++){
                    let tag =
                        '<tr>'+
                            '<td>'+r.searchMor[i].h_shop+'</td>'+
                            '<td>'+r.searchMor[i].h_tel+'</td>'+
                            '<td>'+r.searchMor[i].h_address+'</td>'+
                            '<td>'+r.searchMor[i].h_offer+'</td>'+
                            '<td>'+r.searchMor[i].h_facilities+'</td>'+
                            '<td>'+r.searchMor[i].h_tag+'</td>'+
                        "</tr>";
                    $(".hotel_table").append(tag);
                }
                $("#btn_dis").hide('click');
                $("#btn_bus").hide('click');
                $("#btn_ent").hide('click');
                $("#btn_vid").hide('click');
                $("#btn_hea").hide('click');
                $("#btn_bre").hide('click');
                $("#btn_lau").hide('click');
            }
        })
    })

    $("#btn_lau").one("click", function(){
        $.ajax({
            type:"get",
            url:"/api/searchLau",
            success:function(r){
                console.log(r);
                for(let i=0; i<9; i++){
                    let tag = "<tbody class='hotel-tbody'><tbody>";
                    $(".hotel_table").append(tag);
                }
                for(let i=0; i<r.searchLau.length; i++){
                    let tag =
                        '<tr>'+
                            '<td>'+r.searchLau[i].h_shop+'</td>'+
                            '<td>'+r.searchLau[i].h_tel+'</td>'+
                            '<td>'+r.searchLau[i].h_address+'</td>'+
                            '<td>'+r.searchLau[i].h_offer+'</td>'+
                            '<td>'+r.searchLau[i].h_facilities+'</td>'+
                            '<td>'+r.searchLau[i].h_tag+'</td>'+
                        "</tr>";
                    $(".hotel_table").append(tag);
                }
                $("#btn_dis").hide('click');
                $("#btn_bus").hide('click');
                $("#btn_ent").hide('click');
                $("#btn_vid").hide('click');
                $("#btn_hea").hide('click');
                $("#btn_bre").hide('click');
                $("#btn_mor").hide('click');
            }
        })
    })

    
    $("#btn_tra").one("click", function(){
        $.ajax({
            type:"get",
            url:"/api/searchTra",
            success:function(r){
                console.log(r);
                for(let i=0; i<9; i++){
                    let tag = "<tbody class='hotel-tbody'><tbody>";
                    $(".hotel_table").append(tag);
                }
                for(let i=0; i<r.searchTra.length; i++){
                    let tag =
                        '<tr>'+
                            '<td>'+r.searchTra[i].h_shop+'</td>'+
                            '<td>'+r.searchTra[i].h_tel+'</td>'+
                            '<td>'+r.searchTra[i].h_address+'</td>'+
                            '<td>'+r.searchTra[i].h_offer+'</td>'+
                            '<td>'+r.searchTra[i].h_facilities+'</td>'+
                            '<td>'+r.searchTra[i].h_tag+'</td>'+
                        "</tr>";
                    $(".hotel_table").append(tag);
                }
                $("#btn_dis").hide('click');
                $("#btn_bus").hide('click');
                $("#btn_ent").hide('click');
                $("#btn_vid").hide('click');
                $("#btn_hea").hide('click');
                $("#btn_bre").hide('click');
                $("#btn_mor").hide('click');
                $("#btn_lau").hide('click');
                $("#btn_str").hide('click');
                $("#btn_fac").hide('click');
                $("#btn_nat").hide('click');
            }
        })
    })

    $("#btn_str").one("click", function(){
        $.ajax({
            type:"get",
            url:"/api/searchStr",
            success:function(r){
                console.log(r);
                for(let i=0; i<9; i++){
                    let tag = "<tbody class='hotel-tbody'><tbody>";
                    $(".hotel_table").append(tag);
                }
                for(let i=0; i<r.searchStr.length; i++){
                    let tag =
                        '<tr>'+
                            '<td>'+r.searchStr[i].h_shop+'</td>'+
                            '<td>'+r.searchStr[i].h_tel+'</td>'+
                            '<td>'+r.searchStr[i].h_address+'</td>'+
                            '<td>'+r.searchStr[i].h_offer+'</td>'+
                            '<td>'+r.searchStr[i].h_facilities+'</td>'+
                            '<td>'+r.searchStr[i].h_tag+'</td>'+
                        "</tr>";
                    $(".hotel_table").append(tag);
                }
                $("#btn_dis").hide('click');
                $("#btn_bus").hide('click');
                $("#btn_ent").hide('click');
                $("#btn_vid").hide('click');
                $("#btn_hea").hide('click');
                $("#btn_bre").hide('click');
                $("#btn_mor").hide('click');
                $("#btn_lau").hide('click');
                $("#btn_tra").hide('click');
                $("#btn_fac").hide('click');
                $("#btn_nat").hide('click');
            }
        })
    })

    $("#btn_fac").one("click", function(){
        $.ajax({
            type:"get",
            url:"/api/searchFac",
            success:function(r){
                console.log(r);
                for(let i=0; i<9; i++){
                    let tag = "<tbody class='hotel-tbody'><tbody>";
                    $(".hotel_table").append(tag);
                }
                for(let i=0; i<r.searchFac.length; i++){
                    let tag =
                        '<tr>'+
                            '<td>'+r.searchFac[i].h_shop+'</td>'+
                            '<td>'+r.searchFac[i].h_tel+'</td>'+
                            '<td>'+r.searchFac[i].h_address+'</td>'+
                            '<td>'+r.searchFac[i].h_offer+'</td>'+
                            '<td>'+r.searchFac[i].h_facilities+'</td>'+
                            '<td>'+r.searchFac[i].h_tag+'</td>'+
                        "</tr>";
                    $(".hotel_table").append(tag);
                }
                $("#btn_dis").hide('click');
                $("#btn_bus").hide('click');
                $("#btn_ent").hide('click');
                $("#btn_vid").hide('click');
                $("#btn_hea").hide('click');
                $("#btn_bre").hide('click');
                $("#btn_mor").hide('click');
                $("#btn_lau").hide('click');
                $("#btn_tra").hide('click');
                $("#btn_str").hide('click');
                $("#btn_nat").hide('click');
            }
        })
    })

    $("#btn_nat").one("click", function(){
        $.ajax({
            type:"get",
            url:"/api/searchNat",
            success:function(r){
                console.log(r);
                for(let i=0; i<9; i++){
                    let tag = "<tbody class='hotel-tbody'><tbody>";
                    $(".hotel_table").append(tag);
                }
                for(let i=0; i<r.searchNat.length; i++){
                    let tag =
                        '<tr>'+
                            '<td>'+r.searchNat[i].h_shop+'</td>'+
                            '<td>'+r.searchNat[i].h_tel+'</td>'+
                            '<td>'+r.searchNat[i].h_address+'</td>'+
                            '<td>'+r.searchNat[i].h_offer+'</td>'+
                            '<td>'+r.searchNat[i].h_facilities+'</td>'+
                            '<td>'+r.searchNat[i].h_tag+'</td>'+
                        "</tr>";
                    $(".hotel_table").append(tag);
                }
                $("#btn_dis").hide('click');
                $("#btn_bus").hide('click');
                $("#btn_ent").hide('click');
                $("#btn_vid").hide('click');
                $("#btn_hea").hide('click');
                $("#btn_bre").hide('click');
                $("#btn_mor").hide('click');
                $("#btn_lau").hide('click');
                $("#btn_tra").hide('click');
                $("#btn_str").hide('click');
                $("#btn_fac").hide('click');
            }
        })
    })
})