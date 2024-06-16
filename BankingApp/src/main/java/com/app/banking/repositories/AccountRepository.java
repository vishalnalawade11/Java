package com.app.banking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.banking.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
