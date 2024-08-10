package com.demobank.demobank.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor
public class Account extends BaseEntity{
    @Column(name = "customer_id")
    @Id
    private Long customerId;

    private Long accountNumber;

    private String accountType;

    private  String branchAddress;

}
