package com.study.service_aop.impl;

import com.study.dao1.AccountDao;
import com.study.service_aop.AccountServiceAop;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;

/**
 * @Program: MyJavaStudy
 * @ClassName: AccountServiceImpl
 * @Author: David_J
 * @Copyright David
 * @Date: 2022-04-14 16:13
 * @Version: V1.0
 */
public class AccountServiceImplAop implements AccountServiceAop {
    private AccountDao accountDao;
    public void setAccountDao(AccountDao accountdao){
        this.accountDao=accountdao;
    }

    public void transferaop(String outName, String toName, double money){
        accountDao.inMoney(outName,money);
        accountDao.outMoney(toName,money);
    }
}
