package com.example.demo.service;

import com.example.demo.entity.Department;
import com.example.demo.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

   public  Department fetchDepartmentByName(String departmentName);

    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;
}
