package com.imooc.o2o.util;

import net.coobird.thumbnailator.Thumbnailator;
import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.filters.Watermark;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class ImageUtil {

    private static Logger logger = LoggerFactory.getLogger(ImageUtil.class);
    public static final SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    public static final Random rd = new Random();
    public static String generateTunmbnail(File multipartFile,String targetAddr){
        String realFileName = getRandomFileName();
        String extension = getFileExtension(multipartFile);
        makeDirPath(targetAddr);
        String realFileAddr =  targetAddr + realFileName + extension;
        logger.debug("relativeAddr is :" + realFileAddr);
        File file = new File(PathUtil.getImgBasePath() + realFileAddr);
        logger.debug("fullpath is :" + PathUtil.getImgBasePath() + realFileAddr);

        logger.debug("basePath is :" + PathUtil.getImgBasePath());


        try {
            Thumbnails.of(multipartFile).size(200,200).toFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return PathUtil.getImgBasePath() + realFileAddr;
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
    private static String getFileExtension(File file) {

        return file.getName().substring(file.getName().lastIndexOf("."));
    }

    /**
    * @Description: 获得随机文件名 当前时间+ 随机五位数确保唯一性
    */
    private static String getRandomFileName() {

        return sDateFormat.format(new Date()) + (rd.nextInt(89999) + 10000);
    }
}
