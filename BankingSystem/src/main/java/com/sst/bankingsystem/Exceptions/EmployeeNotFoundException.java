package com.sst.bankingsystem.Exceptions;

public class EmployeeNotFoundException extends  RuntimeException{
    private Long id;
    public EmployeeNotFoundException(String message, Long id){
        super(message);
        this.id = null;
    }
}
