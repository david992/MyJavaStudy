package com.table01;

import com.bean.Card;

import java.util.List;

/**
 * @Program: MyJavaStudy
 * @ClassName: OneTwoOneMapper
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-07-01 11:48
 * @Version: V1.0
 */
public interface OneToOneMapper {

    public abstract List<Card> selectAll();
}
