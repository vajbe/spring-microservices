package com.demobank.demobank.Service;

import com.demobank.demobank.dto.CustomerDto;
import com.demobank.demobank.entity.Customer;

public interface IAccountService {
    void createAccount(CustomerDto customerDto);
    CustomerDto fetchAccount(String mobileNumber);
    boolean updateAccount(CustomerDto customerDto);
    boolean deleteAccount(String mobileNumber);
}
