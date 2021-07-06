package com.sql;

import com.bean.Students;
import org.apache.ibatis.jdbc.SQL;

/**
 * @Program: MyJavaStudy
 * @ClassName: ReturnSql
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-07-06 14:03
 * @Version: V1.0
 */
public class ReturnSql {

    public String getSelectAll(){
        return new SQL(){
            {
                SELECT("*");
                FROM("students");
            }
        }.toString();
    }

    public String getInsert(Students stu){
        return new SQL(){
            {
                INSERT_INTO("student");
                INTO_VALUES("#{id},#{name},#{age} ");
            }
        }.toString();
    }


    public String getUpdate(Students stu){
        return new SQL(){
            {
                UPDATE("student");
                SET("id=#{id}","name=#{name}","age=#{age} ");
                WHERE("id=#{id}");
            }
        }.toString();
    }
    public String getDelete(Integer id){
        return new SQL(){
            {
                DELETE_FROM("student");
                WHERE("id=#{id}");
            }
        }.toString();
    }
}
