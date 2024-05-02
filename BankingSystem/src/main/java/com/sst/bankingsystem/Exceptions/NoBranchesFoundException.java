package com.sst.bankingsystem.Exceptions;

public class NoBranchesFoundException extends RuntimeException {
    public NoBranchesFoundException(String message) {
        super(message);
    }
}
