package com.study.service;

import com.study.domain.Account;

import java.util.List;

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

    void delete(Integer id);

    void update(Account account);

    List<Account> findAll();

    Account findById(Integer id);
}
