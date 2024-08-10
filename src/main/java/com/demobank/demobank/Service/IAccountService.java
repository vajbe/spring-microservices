package com.demobank.demobank.Service;

import com.demobank.demobank.dto.CustomerDto;

public interface IAccountService {
    void createAccount(CustomerDto customerDto);
    CustomerDto fetchAccount(String mobileNumber);
}
