package com.greenart.vo;

import java.util.Date;

import lombok.Data;

@Data
public class HotelImageVO {
    private Integer himg_seq;
    private String himg_file_name;
    private String himg_uri;
    private Date himg_reg_dt;
    private Integer himg_size;
}
