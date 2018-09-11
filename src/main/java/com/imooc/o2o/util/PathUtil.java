package com.imooc.o2o.util;

import java.io.File;

public class PathUtil {
    /**
    * @Description: 項目圖片存放的根路径
    */
    public static String getImgBasePath(){
        String os =System.getProperty("os.name");
        if(os.toLowerCase().startsWith("win")){
            return "D:" + File.separator + "java-o2o"+ File.separator + "image" + File.separator;
        }else{
            return File.separator + "home" + File.separator + "dcg" + File.separator + "image" + File.separator;
        }
    }

    /**
    * @Description: 店铺图片的子路径
    * @param [shopId] 店铺id
    */
    public static String getShopImagePath(long shopId){
        return  "upload" + File.separator + "item" + File.separator + "shop" + File.separator + shopId + File.separator;
    }
}
