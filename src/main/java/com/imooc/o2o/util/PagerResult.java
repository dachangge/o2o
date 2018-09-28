package com.imooc.o2o.util;

import com.github.pagehelper.PageInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class PagerResult<T> {
    private long count;
    private T list;

    public static <T> PagerResult<List<T>> toPageData(List<T> list){
        PagerResult<List<T>> pagerResult = new PagerResult<>();
        PageInfo<T> pageInfo= new PageInfo<T>(list);
        pagerResult.setCount(pageInfo.getTotal());
        pagerResult.setList(list);
        return  pagerResult;
    }

}
