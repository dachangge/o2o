package com.imooc.o2o.controller.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("file")
public class FileUploadController {
    private static Logger logger = LoggerFactory.getLogger(FileUploadController.class);

    @RequestMapping("fileUpload.api")
    @ResponseBody
    private String fileUpload(MultipartFile file, String path, HttpServletRequest req){
        logger.info("123");
        logger.info(path);
//        logger.info(file.getOriginalFilename());
//        logger.info(path);
        return "123";
    }

}
