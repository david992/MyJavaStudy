package com.study.service.impl;

import com.study.daoredis.AccountDao;
import com.study.domain.Account;
import com.study.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
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
    private RedisTemplate redisTemplate;

    @Override
    public void changeMoney(Integer id, Double money) {
        redisTemplate.opsForValue().set("account:id:"+id,money);

    }

    @Override
    public Double findMoney(Integer id) {
        Object money = redisTemplate.opsForValue().get("account:id:" + id);
        return new Double(money.toString() );

    }

    @Override
    public void save(Account account) {

    }
}
