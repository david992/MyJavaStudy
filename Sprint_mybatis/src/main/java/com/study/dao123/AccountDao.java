package com.study.dao123;

import com.study.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Program: MyJavaStudy
 * @ClassName: AccountDao
 * @Author: David_J
 * @Copyright David
 * @Date: 2022-02-15 16:56
 * @Version: V1.0
 */
public interface AccountDao {
    @Insert("insert into account(name,money) values(#{name},#{money})")
    void save(Account account);
    @Delete(" delete from account where id = #{id}")
    void delete(Integer id);
    @Update("update account set name =#{name},money=#{money} where id =#{id}")
    void update(Account account);
    @Select("select * from account ")
    List<Account> findAll();
    @Select("select * from account where id = #{id}")
    Account findById(Integer id);
}
