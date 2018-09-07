package com.imooc.o2o.entity;

import java.util.Date;

public class PersonInfo {
    private Long userId;
    private String name;
    private String profileImg;
    private String email;
    private String gender;
    private Integer enableStatus;
    //1.顾客2店家3 超级管理员
    private Integer userType;
    private Date createTime;
    private Date lastEditTime;
}
