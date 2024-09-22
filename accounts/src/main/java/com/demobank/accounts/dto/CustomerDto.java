package com.demobank.accounts.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CustomerDto {
    @NotEmpty(message = "Name cannot be null or empty")
    @Size(min = 5, max = 30, message = "Length of customer name should between 5 and 30")
    private String name;

    @NotEmpty(message = "Name cannot be null or empty")
    @Email(message = "Invalid email  address")
    private String email;

    @Pattern(regexp = "(^$|[0-9]{10})", message = "Invalid mobile number")
    private String mobileNumber;

    private AccountDto accountDto;
}
