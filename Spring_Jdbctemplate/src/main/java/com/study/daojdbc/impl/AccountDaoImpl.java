package com.study.daojdbc.impl;

import com.study.daojdbc.AccountDao;
import com.study.domain.Account;
import org.apache.ibatis.annotations.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @Program: MyJavaStudy
 * @ClassName: AccountDaoImpl
 * @Author: David_J
 * @Copyright David
 * @Date: 2022-05-12 15:26
 * @Version: V1.0
 */
//将dao注册为bean
@Component("accountDao")
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void save(Account account) {
        String sql = "insert into account (name,money) values(?,?)";
        System.out.println("sssssssssssssssssssssssssssssssssssss");
        jdbcTemplate.update(sql,account.getName(),account.getMoney());
    }
}
