package com.table02;

import com.bean.Classes;
import com.bean.Students;

import java.util.List;

/**
 * @Program: MyJavaStudy
 * @ClassName: OneToMoreMapper
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-07-01 15:24
 * @Version: V1.0
 */
public interface OneToMoreMapper {
    public abstract List<Classes> selectAll();

}
