package com.example.DemoCRUD.service;

import com.example.DemoCRUD.model.Student;

import java.util.List;

public interface IStudentService {
    public List<Student> findAll();
    public Student findById(long id);
    public void save(Student student);
    public void delete(long id);
    public List<Student> findByName(String name);
}
