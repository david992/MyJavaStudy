package com.batis.mapper;

import com.batis.Entity.Goods;
import com.study.demo.Student;

import java.util.List;

/**
 * @Program: MyJavaStudy
 * @ClassName: GoodsMapper
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-08-07 11:29
 * @Version: V1.0
 */
public interface GoodsMapper {
    /*
     *持久层接口（dao层）
     * */
    public abstract List<Goods> selectAllGoods();
}
