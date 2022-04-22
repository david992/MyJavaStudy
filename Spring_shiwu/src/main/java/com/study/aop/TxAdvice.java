package com.study.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;

/**
 * @Program: MyJavaStudy
 * @ClassName: TxAdvice
 * @Author: David_J
 * @Copyright David
 * @Date: 2022-04-22 17:26
 * @Version: V1.0
 */
public class TxAdvice {

    private DataSource dataSource;
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Object transferManager(ProceedingJoinPoint pjp) throws Throwable {
        //开启事务
        DataSourceTransactionManager ptm = new DataSourceTransactionManager(dataSource);
        //定义实务
        DefaultTransactionDefinition td = new DefaultTransactionDefinition();
        //创建事务状态
        TransactionStatus ts = ptm.getTransaction(td);

        Object ret = pjp.proceed(pjp.getArgs());

        //提交
        ptm.commit(ts);

        return ret;
    }
}
