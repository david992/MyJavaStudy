package com.one2one;

import com.bean.Person;
import org.apache.ibatis.annotations.Select;

/**
 * @Program: MyJavaStudy
 * @ClassName: PersonMapper
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-07-05 11:45
 * @Version: V1.0
 */
public interface PersonMapper {

    @Select("select * from students where id=#{id}")
    public abstract Person selectById (Integer id);
}
