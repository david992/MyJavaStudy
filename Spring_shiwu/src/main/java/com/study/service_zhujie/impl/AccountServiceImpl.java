package com.study.service_zhujie.impl;

import com.study.dao1.AccountDao;
import com.study.service_zhujie.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Program: MyJavaStudy
 * @ClassName: AccountServiceImpl
 * @Author: David_J
 * @Copyright David
 * @Date: 2022-05-07 10:23
 * @Version: V1.0
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    public void transferaop(String outName, String toName, double money){
        accountDao.inMoney(outName,money);
//        int i = 1/0;
        accountDao.outMoney(toName,money);
    }
}
