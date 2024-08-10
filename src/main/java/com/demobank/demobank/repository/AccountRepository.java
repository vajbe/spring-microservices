package com.demobank.demobank.repository;
import com.demobank.demobank.entity.Account;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;


import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account,Long> {
    Optional<Account> findByCustomerId(Long customerId);
    @Transactional
    @Modifying
    void deleteByCustomerId(Long customerId);
}
