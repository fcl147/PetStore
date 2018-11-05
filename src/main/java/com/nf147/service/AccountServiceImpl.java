package com.nf147.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nf147.dao.AccountMapper;
import com.nf147.dao.ProfileMapper;
import com.nf147.model.Account;
import com.nf147.model.Profile;
@Service
public class AccountServiceImpl implements IAccountService {
	private AccountMapper dao;
	private ProfileMapper pdao;
	
	public ProfileMapper getPdao() {
		return pdao;
	}
	@Autowired
	public void setPdao(ProfileMapper pdao) {
		this.pdao = pdao;
	}
	
	public AccountMapper getDao() {
		return dao;
	}
	@Autowired
	public void setDao(AccountMapper dao) {
		this.dao = dao;
	}
	@Override
	public Account selectByAccount_name_pwd(Account account) {
		// TODO Auto-generated method stub
		return dao.selectByAccount_name_pwd(account);
	}
	@Override
	public int insert(Account record) {
		// TODO Auto-generated method stub
		Profile profile = record.getProfile();
		if(dao.insert(record) > 0){
			profile.setUsername(record.getUsername());
			profile.setCategory(record.getProfile().getCategory());
		}
		return pdao.insert(profile);
	}
}
