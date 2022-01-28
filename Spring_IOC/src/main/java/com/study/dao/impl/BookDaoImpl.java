package com.study.dao.impl;

import com.study.dao.BookDao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Properties;

/**
 * @Program: MyJavaStudy
 * @ClassName: BookDaoImpl
 * @Author: David_J
 * @Copyright David
 * @Date: 2022-01-25 14:57
 * @Version: V1.0
 */
public class BookDaoImpl implements BookDao {


    private ArrayList al;
    private Properties properties;
    private int[] arr;
    private HashSet hs;
    private HashMap hm;

    public void setAl(ArrayList al) {
        this.al = al;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public void setHs(HashSet hs) {
        this.hs = hs;
    }

    public void setHm(HashMap hm) {
        this.hm = hm;
    }
    @Override
    public void save(){
        System.out.println(al+","+properties+","+arr+","+hs+","+hm);
    }
}
