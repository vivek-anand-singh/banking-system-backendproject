package com.sst.bankingsystem.Controllers;

import com.sst.bankingsystem.Models.Branch;
import com.sst.bankingsystem.Services.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/branches")
public class BranchController {
    private final BranchService branchService;

    public BranchController(BranchService branchService) {
        this.branchService = branchService;
    }

    @GetMapping("/")
    public List<Branch> getAllBranches() {
        return branchService.getAllBranches();
    }

    @GetMapping("/{branchId}")
    public Branch getBranchById(@PathVariable("branchId") Long branchId) {
        return branchService.getBranchById(branchId);
    }

    @PostMapping("/")
    public Branch createBranch(@RequestBody Branch branch) {
        return branchService.createBranch(branch);
    }

    @PutMapping("/{id}")
    public Branch updateBranch(Long id, @RequestBody Branch branch) {
        return branchService.updateBranch(id,branch);
    }

    @DeleteMapping("/{branchId}")
    public void deleteBranch(@PathVariable("branchId") Long branchId) {
        branchService.deleteBranch(branchId);
    }
}