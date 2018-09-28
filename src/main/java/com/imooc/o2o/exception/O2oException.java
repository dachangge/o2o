package com.imooc.o2o.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class O2oException extends  RuntimeException{
    static final long serialVersionUID = 1L;
    private String errCode;
    private String errMsg;
}
