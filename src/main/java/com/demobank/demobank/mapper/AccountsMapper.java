package com.demobank.demobank.mapper;

import com.demobank.demobank.dto.AccountDto;
import com.demobank.demobank.entity.Account;

public class AccountsMapper {
    public static AccountDto mapToAccountsDto(Account accounts, AccountDto accountsDto) {
        accountsDto.setAccountNumber(accounts.getAccountNumber());
        accountsDto.setAccountType(accounts.getAccountType());
        accountsDto.setBranchAddress(accounts.getBranchAddress());
        return accountsDto;
    }

    public static Account mapToAccounts(AccountDto accountsDto, Account accounts) {
        accounts.setAccountNumber(accountsDto.getAccountNumber());
        accounts.setAccountType(accountsDto.getAccountType());
        accounts.setBranchAddress(accountsDto.getBranchAddress());
        return accounts;
    }
}