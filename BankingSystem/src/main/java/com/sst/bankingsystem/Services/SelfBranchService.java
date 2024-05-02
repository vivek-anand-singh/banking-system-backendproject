package com.sst.bankingsystem.Services;

import com.sst.bankingsystem.Exceptions.BranchNotFoundException;
import com.sst.bankingsystem.Exceptions.NoCustomersFoundException;
import com.sst.bankingsystem.Models.Branch;
import com.sst.bankingsystem.Models.Employee;
import com.sst.bankingsystem.Repositories.BranchRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Primary
public class SelfBranchService implements BranchService {
    private final BranchRepository branchRepository;
    public SelfBranchService(BranchRepository branchRepository) {
        this.branchRepository = branchRepository;
    }
    private final Map<Long, Branch> branches = new HashMap<>();
    @Override
    public List<Branch> getAllBranches() {
        List<Branch> branches = branchRepository.findAll();
        if (branches.isEmpty()) {
            throw new NoCustomersFoundException("No customers found");
        }
        return branches;
    }

    @Override
    public Branch getBranchById(Long branchId) {
        Optional<Branch> branch = branchRepository.findById(branchId);
        if(branch.isEmpty()) {
            throw new BranchNotFoundException("Wrong Branch ID passed",branchId);
        }
        return branch.get();
    }

    @Override
    public Branch createBranch(Branch branch) {
        return branchRepository.save(branch);
    }

    @Override
    public Branch updateBranch(Long id,Branch branch) {
        return branchRepository.save(branch);
    }

    @Override
    public void deleteBranch(Long branchId) {
        List<Branch> branchesToDelete = branchRepository.findAll();
        if(branchesToDelete.isEmpty()){
            throw new BranchNotFoundException("Wrong branch passed",branchId);
        }
        branchRepository.deleteById(branchId);
    }

    @Override
    public List<Employee> getEmployeesByBranchId(Long branchId) {
        return List.of();
    }
}