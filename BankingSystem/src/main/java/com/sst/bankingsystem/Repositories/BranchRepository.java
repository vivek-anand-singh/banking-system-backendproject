package com.sst.bankingsystem.Repositories;

import com.sst.bankingsystem.Models.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface BranchRepository extends JpaRepository<Branch, Long> {
    // Find branches by manager ID
    @Override
    Branch save(Branch branch);

    @Override
    List<Branch> findAll();

    @Override
    Optional<Branch> findById(Long aLong);

    @Override
    void deleteById(Long aLong);
}