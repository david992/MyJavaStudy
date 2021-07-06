package com.sql;

import com.bean.Students;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Program: MyJavaStudy
 * @ClassName: StudentMapper
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-07-06 14:06
 * @Version: V1.0
 */
public interface StudentMapper {
    @SelectProvider(type = ReturnSql.class,method="getSelectAll")
    public  abstract List<Students> selectAll();


    @InsertProvider(type = ReturnSql.class,method="getInsert")
    public abstract Integer insert (Students stu);

    @UpdateProvider(type = ReturnSql.class,method="getUpdate")
    public abstract Integer update (Students stu);

    @DeleteProvider(type = ReturnSql.class,method="getDelete")
    public abstract Integer delete (Integer id);
}
