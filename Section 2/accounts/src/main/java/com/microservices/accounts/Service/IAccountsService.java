package com.microservices.accounts.Service;

import com.microservices.accounts.Dto.CustomerDto;

public interface IAccountsService {

    void createAccount(CustomerDto customerDto);
}
