package com.example.DemoCRUD.repository;

import com.example.DemoCRUD.model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepo extends PagingAndSortingRepository<Student, Long> {
    @Query(nativeQuery = true, value = "select * from student where name like concat('%',:name,'%')")
    public List<Student> findAllByUserName(@Param("name") String name);
}
