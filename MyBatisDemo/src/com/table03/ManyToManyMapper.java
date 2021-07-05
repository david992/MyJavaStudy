package com.table03;

import com.bean.Students;

import java.util.List;

/**
 * @Program: MyJavaStudy
 * @ClassName: ManyToManyMapper
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-07-02 10:59
 * @Version: V1.0
 */
public interface ManyToManyMapper {
    public abstract List<Students> selectAll();
}
