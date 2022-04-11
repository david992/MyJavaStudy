package com.study.service.Impl;

import com.study.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author David
 * @Title:
 * @Package
 * @Description:
 * @date 2022/3/2821:26
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    public void save(){
        //System.out.println("共性功能");
        System.out.println( "userService is runing");
//        int i = 1/0;


    }
    public void canshu(int i){
        System.out.println("canshu is runing...."+i);
    }

    @Override
    public int update() {
        System.out.println("update is runing ");
        return 100;
    }

    @Override
    public void delete() {
        System.out.println("delete is runing ");
        int i= 1/0;
    }
}
