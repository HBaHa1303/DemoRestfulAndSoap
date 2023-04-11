package com.example.projectdemorestfulandsoap.DTOs;

import lombok.Data;
import java.util.Date;

@Data
public class StudentDTO {
    private Long id;
    private String name;
    private String address;
    private String email;
    private Date dateOfBirth;
    private String placeOfBirth;
    private Byte gender;
    private String classOfStudent;
    private String nationality;
    private String nationalId;
    private Date createTime;
    private String createBy;
    private Date updateTime;
    private String updateBy;
    private boolean isStatus;
    private boolean isDelete;
}
