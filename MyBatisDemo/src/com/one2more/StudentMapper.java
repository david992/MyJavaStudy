package com.one2more;

import com.bean.Students;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Program: MyJavaStudy
 * @ClassName: StudentMapper
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-07-05 15:18
 * @Version: V1.0
 */
public interface StudentMapper {
    //根据cid查询学生表
    @Select("select * from students where cid=#{cid}")
    public abstract List<Students> selectById(Integer cid);
}
