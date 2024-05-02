package com.sst.bankingsystem.Exceptions;

public class BranchNotFoundException extends  RuntimeException{
    private Long id;
    public BranchNotFoundException(String message, Long id){
        super(message);
        this.id = null;
    }
}