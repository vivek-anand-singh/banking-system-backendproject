package com.sst.bankingsystem.Repositories;

import com.sst.bankingsystem.Models.Customer;
import com.sst.bankingsystem.Models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    @Override
    Department save(Department department);

    @Override
    Optional<Department> findById(Long aLong);

    @Override
    List<Department> findAll();

    @Override
    void deleteById(Long aLong);
}
