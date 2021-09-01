package com.greenart.vo;

import lombok.Data;

@Data
public class MemberInfoVO {
    private Integer mi_seq;
    private String mi_id;
    private String mi_pwd;
    private String mi_name;
    private String mi_email;
    private String mi_address;
    private String mi_phone;
}
