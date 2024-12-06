package com.microservices.accounts.Service.Impl;

import com.microservices.accounts.Dto.CustomerDto;
import com.microservices.accounts.Repository.AccountsRepository;
import com.microservices.accounts.Repository.CustomerRepository;
import com.microservices.accounts.Service.IAccountsService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
