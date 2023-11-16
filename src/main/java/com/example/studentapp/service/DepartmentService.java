package com.example.studentapp.service;

import com.example.studentapp.model.Department;

import java.util.List;

public interface DepartmentService {
     Department createDepartment(Department department);
     List<Department> getDepartments();

}
