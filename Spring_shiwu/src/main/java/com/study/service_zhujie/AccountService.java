package com.study.service_zhujie;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Program: MyJavaStudy
 * @ClassName: AccountService
 * @Author: David_J
 * @Copyright David
 * @Date: 2022-05-07 10:24
 * @Version: V1.0
 */

public interface AccountService {
    @Transactional(
            readOnly = false,
            timeout = -1,
            isolation = Isolation.DEFAULT,
            rollbackFor = {java.lang.ArithmeticException.class,},
            noRollbackFor = {},
            propagation = Propagation.REQUIRED
    )
    public void transferaop(String outName,String toName,double money);
}
