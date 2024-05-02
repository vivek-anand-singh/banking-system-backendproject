package com.sst.bankingsystem.Services;
import com.sst.bankingsystem.Exceptions.CustomerNotFoundException;
import com.sst.bankingsystem.Exceptions.EmployeeNotFoundException;
import com.sst.bankingsystem.Exceptions.NoEmployeesFoundException;
import com.sst.bankingsystem.Models.Department;
import com.sst.bankingsystem.Models.Employee;
import com.sst.bankingsystem.Models.Role;
import com.sst.bankingsystem.Repositories.DepartmentRepository;
import com.sst.bankingsystem.Repositories.EmployeeRepository;
import com.sst.bankingsystem.Repositories.RoleRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Primary
public class SelfEmployeeService implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final RoleRepository roleRepository;
    private final DepartmentRepository departmentRepository;
    public SelfEmployeeService(EmployeeRepository employeeRepository, RoleRepository roleRepository, DepartmentRepository departmentRepository) {
        this.employeeRepository = employeeRepository;
        this.roleRepository = roleRepository;
        this.departmentRepository = departmentRepository;
    }
    private final Map<Long, Employee> employees = new HashMap<>();

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        if(employees.isEmpty()){
            throw new NoEmployeesFoundException("No Employees Found");
        }
        return employees;
    }

    @Override
    public Employee getEmployeeById(Long employeeId) {
        Optional<Employee> employee = employeeRepository.findById(employeeId);
        if(employee.isEmpty()){
            throw new CustomerNotFoundException("Wrong employee ID passed",employeeId);
        }
        return employee.get();
    }

    @Override
    public Employee createEmployee(Employee employee) {
        Department department = employee.getDepartment();
        Role role = employee.getRole();
        if (department.getDepartmentId() == null) {
            department = departmentRepository.save(department);
        }
        if (role.getRoleId() == null) {
            role = roleRepository.save(role);
        }
        employee.setDepartment(department);
        employee.setRole(role);
        return employeeRepository.save(employee);
    }


    @Override
public Employee updateEmployee(Long id, Employee employee) {
    return employeeRepository.save(employee);
}

@Override
public void deleteEmployee(Long employeeId) {
    List<Employee> employees = employeeRepository.findAll();
    if (employees.isEmpty()){
        throw new EmployeeNotFoundException("Employees Not Found Exception", employeeId);
    }
    employeeRepository.deleteById(employeeId);
}
}