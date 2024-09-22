package com.demobank.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Account extends BaseEntity{
    @Column(name = "customer_id")
    private Long customerId;

    @Column(name="account_number")
    @Id
    private Long accountNumber;

    private String accountType;

    private  String branchAddress;

}
