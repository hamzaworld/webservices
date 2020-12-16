package com.demo.classes.my_demosb.simple.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.classes.my_demosb.simple.model.Employee;

@Repository
public interface HomeRepository extends JpaRepository<Employee, Integer> {

}
