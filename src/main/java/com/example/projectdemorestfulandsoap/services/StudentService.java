package com.example.projectdemorestfulandsoap.services;

import com.example.projectdemorestfulandsoap.DTOs.StudentDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<StudentDTO> getAllStudents();

    StudentDTO createStudent(StudentDTO student);

    StudentDTO getStudentById(Long id);

    StudentDTO updateStudent(StudentDTO student);

    void deleteStudentById(Long id);
}
