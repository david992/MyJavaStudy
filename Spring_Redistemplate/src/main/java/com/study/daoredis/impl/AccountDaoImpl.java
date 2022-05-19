package com.study.daoredis.impl;

import com.study.daoredis.AccountDao;
import com.study.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

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

}
