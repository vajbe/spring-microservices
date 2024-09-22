package com.demobank.accounts.Service;

import com.demobank.accounts.dto.CustomerDto;

public interface IAccountService {
    void createAccount(CustomerDto customerDto);
    CustomerDto fetchAccount(String mobileNumber);
    boolean updateAccount(CustomerDto customerDto);
    boolean deleteAccount(String mobileNumber);
}
