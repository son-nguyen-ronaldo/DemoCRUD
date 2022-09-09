package com.example.DemoCRUD.service;

import com.example.DemoCRUD.model.Student;
import com.example.DemoCRUD.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService{
    @Autowired
    StudentRepo studentRepo;
    @Override
    public List<Student> findAll() {
        return (List<Student>) studentRepo.findAll();
    }

    @Override
    public Student findById(long id) {
        return studentRepo.findById(id).get();
    }

    @Override
    public void save(Student student) {
        studentRepo.save(student);
    }

    @Override
    public void delete(long id) {
        studentRepo.deleteById(id);
    }

    @Override
    public List<Student> findByName(String name) {
        return studentRepo.findAllByUserName(name);
    }
}
