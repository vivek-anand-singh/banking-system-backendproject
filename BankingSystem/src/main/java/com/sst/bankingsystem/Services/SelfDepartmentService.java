package com.sst.bankingsystem.Services;

import com.sst.bankingsystem.Models.Department;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SelfDepartmentService implements DepartmentService {
    @Override
    public List<Department> getAllDepartments() {
        return List.of();
    }

    @Override
    public Department getDepartmentById(Long departmentId) {
        return null;
    }

    @Override
    public Department createDepartment(Department department) {
        return null;
    }

    @Override
    public Department updateDepartment(Department department) {
        return null;
    }

    @Override
    public void deleteDepartment(Long departmentId) {

    }
}