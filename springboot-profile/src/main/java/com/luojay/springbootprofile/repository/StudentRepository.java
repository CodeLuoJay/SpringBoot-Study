package com.luojay.springbootprofile.repository;

import com.luojay.springbootprofile.pojo.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {
}
