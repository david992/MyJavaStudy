package com.study.dao1;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @Program: MyJavaStudy
 * @ClassName: AccountDao
 * @Author: David_J
 * @Copyright David
 * @Date: 2022-04-14 16:39
 * @Version: V1.0
 */
public interface AccountDao {

//    @Update("update account set money = money + #{money} where name = #{name}")
    void inMoney(@Param("name") String name, @Param("money") Double money);

//    @Update("update account set money = money - #{money} where name = #{name}")
    void outMoney(@Param("name") String name,@Param("money") Double money);
}
