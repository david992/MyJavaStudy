package com.study.dao1;

import org.apache.ibatis.annotations.Param;

/**
 * @Program: MyJavaStudy
 * @ClassName: AccountDao
 * @Author: David_J
 * @Copyright David
 * @Date: 2022-04-14 16:39
 * @Version: V1.0
 */
public interface AccountDao {


    void inMoney(@Param("name") String name, @Param("money") Double money);


    void outMoney(@Param("name") String name,@Param("money") Double money);
}
