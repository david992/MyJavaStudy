package com.study.service.impl;

import com.study.dao1.AccountDao;
import com.study.service.AccountService;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.DefaultTransactionStatus;

import javax.sql.DataSource;

/**
 * @Program: MyJavaStudy
 * @ClassName: AccountServiceImpl
 * @Author: David_J
 * @Copyright David
 * @Date: 2022-04-14 16:13
 * @Version: V1.0
 */
public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;
    public void setAccountDao(AccountDao accountdao){
        this.accountDao=accountdao;
    }

    private DataSource dataSource;
    public AccountServiceImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void transfer(String outName, String toName, double money){
        //开启事务
        DataSourceTransactionManager ptm = new DataSourceTransactionManager(dataSource);
        //定义实务
        DefaultTransactionDefinition td = new DefaultTransactionDefinition();
        //创建事务状态
        TransactionStatus ts = ptm.getTransaction(td);
        accountDao.inMoney(outName,money);
        accountDao.outMoney(toName,money);
        //提交
        ptm.commit(ts);

    }
}
