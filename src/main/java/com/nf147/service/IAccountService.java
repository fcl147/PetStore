package com.nf147.service;

import com.nf147.model.Account;

public interface IAccountService {
	Account selectByAccount_name_pwd(Account account);
	int insert(Account record);
}
