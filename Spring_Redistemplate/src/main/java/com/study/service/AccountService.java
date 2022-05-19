package com.study.service;

import com.study.domain.Account;

/**
 * @Program: MyJavaStudy
 * @ClassName: AccountService
 * @Author: David_J
 * @Copyright David
 * @Date: 2022-02-15 17:04
 * @Version: V1.0
 */
public interface AccountService {
    void save(Account account);
    void changeMoney(Integer id,Double money);
    Double findMoney(Integer id );
}
