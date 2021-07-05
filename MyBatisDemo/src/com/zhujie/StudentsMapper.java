package com.zhujie;

import com.bean.Person;
import com.bean.Students;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Program: MyJavaStudy
 * @ClassName: StudentMapper
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-07-02 16:56
 * @Version: V1.0
 */
public interface StudentsMapper {

    @Select("select * from students")
    public abstract List<Students> selectAll();

    @Insert("insert into students (id,name,age)values(#{id},#{name},#{age})")
    public abstract Integer insert (Students stu);

    @Update("update students set name = #{name} ,age=#{age} where id=#{id}")
    public abstract Integer update (Students stu);

    @Delete("delete from students where id=#{id}")
    public abstract Integer delete (Integer id);

}
