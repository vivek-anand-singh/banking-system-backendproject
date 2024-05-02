package com.sst.bankingsystem.Services;

import com.sst.bankingsystem.Models.Account;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SelfAccountService implements AccountService {
    @Override
    public List<Account> getAllAccounts() {
        return List.of();
    }

    @Override
    public Account getAccountByNumber(Long accountNumber) {
        return null;
    }

    @Override
    public Account createAccount(Account account) {
        return null;
    }

    @Override
    public Account updateAccount(Account account) {
        return null;
    }

    @Override
    public void deleteAccount(Long accountNumber) {

    }

}