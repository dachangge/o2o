package com.imooc.o2o.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SystemCode {
    SUCCESS("0000","SUCCESS"),SYSTEM_ERROR("9999","系统异常");
    private String code;
    private String description;


}
