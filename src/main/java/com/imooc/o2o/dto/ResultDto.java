package com.imooc.o2o.dto;

import com.imooc.o2o.enums.SystemCode;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
public class ResultDto<T> {
    private String code ;

    private String description;

    private T result;

    public static <T> ResultDto<T> buildReturnSuccess(T t){
        ResultDto<T> resultDto = new ResultDto<T>();
        resultDto.setCode(SystemCode.SUCCESS.getCode());
        resultDto.setDescription(SystemCode.SUCCESS.getDescription());
        resultDto.setResult(t);
        return  resultDto;
    }

    public static <T> ResultDto<T> buildReturnSuccess(){
        ResultDto<T> resultDto = new ResultDto<T>();
        resultDto.setCode(SystemCode.SUCCESS.getCode());
        resultDto.setDescription(SystemCode.SUCCESS.getDescription());
        return  resultDto;
    }



}
