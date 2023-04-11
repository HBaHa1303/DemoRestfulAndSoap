package com.example.projectdemorestfulandsoap.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "STUDENTS")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "DATE_OF_BIRTH")
    private Date dateOfBirth;

    @Column(name = "PLACE_OF_BIRTH")
    private String placeOfBirth;

    @Column(name = "GENDER")
    private Byte gender;

    @Column(name = "CLASS_OF_STUDENT")
    private String classOfStudent;

    @Column(name = "NATIONALITY")
    private String nationality;

    @Column(name = "NATIONAL_ID")
    private String nationalId;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "CREATE_BY")
    private String createBy;

    @Column(name = "UPDATE_TIME")
    private Date updateTime;

    @Column(name = "UPDATE_BY")
    private String updateBy;

    @Column(name = "IS_DELETE")
    private boolean isDelete;

    @Column(name = "IS_STATUS")
    private boolean isStatus;
}
