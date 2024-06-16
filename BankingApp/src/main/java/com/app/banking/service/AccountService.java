package com.app.banking.service;

import java.util.List;

import com.app.banking.dto.AccountDto;

public interface AccountService {
	AccountDto createAccount(AccountDto accountDto);

	List<AccountDto> getAllAccounts();

	AccountDto getAccountById(Long id);

	AccountDto deposit(Long id, double amount);

	AccountDto withdraw(Long id, Double amount);

	void deleteAccountById(Long id);
}
