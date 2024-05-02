package com.sst.bankingsystem.Repositories;

import com.sst.bankingsystem.Models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    // Find branches by manager ID
    @Override
    Role save(Role role);
    @Override
    List<Role> findAll();
    @Override
    Optional<Role> findById(Long aLong);
    @Override
    void deleteById(Long aLong);
}