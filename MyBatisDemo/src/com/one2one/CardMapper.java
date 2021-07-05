package com.one2one;

import com.bean.Card;
import com.bean.Person;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Program: MyJavaStudy
 * @ClassName: CardMapper
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-07-05 11:43
 * @Version: V1.0
 */
public interface CardMapper {
    @Select("select * from card")
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "number",property = "number"),
            @Result(
                    property = "p",             //被包含对象变量名
                    javaType = Person.class,    //被包含对象的实际数据类型
                    column = "pid",             //根绝查询出来的结果中的pid查询person表
                    /*
                    * one = @One 一对一固定写法
                    * select 指定调用哪个接口中的哪个方法
                    * */
                    one = @One(select =  "com.one2one.PersonMapper.selectById")
            )
    })
    public abstract List<Card> selectAll();

}
