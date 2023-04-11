package com.example.projectdemorestfulandsoap.services.servicesImpl;

import com.example.projectdemorestfulandsoap.DTOs.StudentDTO;
import com.example.projectdemorestfulandsoap.entites.StudentEntity;
import com.example.projectdemorestfulandsoap.exceptions.StudentNotFoundException;
import com.example.projectdemorestfulandsoap.repositories.StudentRepository;
import com.example.projectdemorestfulandsoap.services.StudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<StudentDTO> getAllStudents() {
        List<StudentEntity> listStudentEntity = studentRepository.findAll();
        List<StudentDTO> listStudentDTO = new ArrayList<>();
        BeanUtils.copyProperties(listStudentEntity, listStudentDTO);
        return listStudentDTO;
    }

    @Override
    public StudentDTO createStudent(StudentDTO student) {
        StudentEntity entity = new StudentEntity();
        BeanUtils.copyProperties(student, entity);
        entity = studentRepository.save(entity);
        BeanUtils.copyProperties(entity, student);
        return student;
    }

    @Override
    public StudentDTO getStudentById(Long id) {
        StudentEntity studentEntity = studentRepository.getById(id);

        if(studentEntity == null){
            String messageResponse = String.format("Student with Id: %d is not found", id);
            throw new StudentNotFoundException(messageResponse);
        }

        StudentDTO studentDTO = new StudentDTO();
        BeanUtils.copyProperties(studentEntity, studentDTO);
        return studentDTO;
    }

    @Override
    public StudentDTO updateStudent(StudentDTO student) {
        Optional<StudentEntity> findStudentById = studentRepository.findById(student.getId());

        if (!findStudentById.isPresent()){
            String messageResponse = String.format("Student with Id: %d is not found", student.getId());
            throw new StudentNotFoundException(messageResponse);
        }

        return createStudent(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        StudentEntity studentEntity = studentRepository.getReferenceById(id);

        if(studentEntity == null){
            String messageResponse = String.format("Student with Id: %d is not found", id);
            throw new StudentNotFoundException(messageResponse);
        }

        studentRepository.deleteById(id);
    }
}
