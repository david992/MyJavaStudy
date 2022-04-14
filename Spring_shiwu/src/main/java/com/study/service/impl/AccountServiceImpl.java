package com.study.service.impl;

import com.study.dao.AccountDao;

/**
 * @Program: MyJavaStudy
 * @ClassName: AccountServiceImpl
 * @Author: David_J
 * @Copyright David
 * @Date: 2022-04-14 16:13
 * @Version: V1.0
 */
public class AccountServiceImpl {
    private AccountDao accountDao;
    public void setAccountDao(AccountDao accountdao){
        this.accountDao=accountdao;
    }

    public void transfer(String outName,String toName,double money){
        accountDao.inMoney(outName,money);
        accountDao.outMoney(toName,money);
    }
}
