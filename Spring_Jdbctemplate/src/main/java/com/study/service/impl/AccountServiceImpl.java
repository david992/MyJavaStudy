package com.study.service.impl;

import com.study.daojdbc.AccountDao;
import com.study.domain.Account;
import com.study.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Program: MyJavaStudy
 * @ClassName: AccountServiceImpl
 * @Author: David_J
 * @Copyright David
 * @Date: 2022-02-15 17:04
 * @Version: V1.0
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    @Override
    public void save(Account account) {
        accountDao.save(account);
    }
}
