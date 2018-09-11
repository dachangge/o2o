package com.imooc.o2o.util;

import net.coobird.thumbnailator.Thumbnailator;
import net.coobird.thumbnailator.Thumbnails;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class ImageUtil {
    public static final SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    public static final Random rd = new Random();
    public static String generateTunmbnail(CommonsMultipartFile multipartFile,String targetAddr){
        String realFileName = getRandomFileName();
        String extension = getFileExtension(multipartFile.getOriginalFilename());
        makeDirPath(targetAddr);
        String realFileAddr =  targetAddr + realFileName + extension;
        File file = new File(PathUtil.getImgBasePath() + realFileAddr);

        Thumbnails.of(multipartFile.getInputStream()).size(200,200).mark
        return realFileAddr;
    }

    /**
    * @Description: 路径不存在 设置路径
    */
    private static void makeDirPath(String targetAddr) {
        String realFilePath = PathUtil.getImgBasePath() + targetAddr;
        File file = new File(realFilePath);
        if(!file.exists()){
            file.mkdirs();
        }
    }


    /**
    * @Description: 获取文件扩展名
    */
    private static String getFileExtension(String fileName) {

        return fileName.substring(fileName.lastIndexOf("."));
    }

    /**
    * @Description: 获得随机文件名 当前时间+ 随机五位数确保唯一性
    */
    private static String getRandomFileName() {

        return sDateFormat.format(new Date()) + (rd.nextInt(89999) + 10000);
    }
}
