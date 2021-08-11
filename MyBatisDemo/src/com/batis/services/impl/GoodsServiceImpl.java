package com.batis.services.impl;

import com.batis.Entity.Goods;
import com.batis.mapper.GoodsMapper;
import com.study.mapper.StudentMapper;
import myjdbc.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @Program: MyJavaStudy
 * @ClassName: GoodsServiceImpl
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-08-07 11:39
 * @Version: V1.0
 */
public class GoodsServiceImpl {

    public void  selectAll()  {
        SqlSession session = null;
        try {
            session = MyBatisUtil.openSession();
            List<Goods> goods = session.selectList("selectAllGoods");
            for (Goods g:goods) {
                System.out.println("ok "+g.getTitle());
            }
        } catch (Exception e) {
            throw e;
        } finally {
            MyBatisUtil.closeSession(session);
        }
    }


}


