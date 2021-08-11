package com.batis.controller;

import com.batis.Entity.Goods;
import com.batis.services.impl.GoodsServiceImpl;
import com.study.service.StudentService;
import com.study.service.impl.StudentServiceImpl;
import org.junit.Test;

import java.util.List;

/**
 * @Program: MyJavaStudy
 * @ClassName: demo
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-08-07 11:08
 * @Version: V1.0
 */
public class demo {
    /*
     * 控制层测试类
     * */

    //创建业务层对象
    private GoodsServiceImpl service = new GoodsServiceImpl();
    @Test
    public void selectAll() {
        service.selectAll();

    }
}
