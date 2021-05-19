package com.china315net7;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Program: test
 * @ClassName: Login
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-05-14 14:02
 * @Version: V1.0
 */
public class Login {
    public Login() {
    }
    public void login(){
        String username="admin";
        String password="123456";
        Scanner sc = new Scanner(System.in);
        for(int i = 1;i<=3;i++){
            System.out.println("请输入账号：");
            String user = sc.nextLine();
            System.out.println("请输入密码：");
            String pwd = sc.nextLine();
            if (username.equals(user) && password.equals(pwd)) {
                System.out.println("登陆成功");
                break;
            }else{
                if(i==3){
                    System.out.println("今日登陆失败次数已达上限，请24小时候重试！");
                    break;
                }
                System.out.println("登陆失败，你还剩"+(3-i)+"次机会");

            }
        }
    }

    public void charArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }

    public void charCount(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");
        String str = sc.nextLine();
        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if(aChar >='A' && aChar <= 'Z'){
                bigCount++;
            }else if (aChar >='a' && aChar <= 'z'){
                smallCount++;
            }else if (aChar >= '0' && aChar <= '9'){
                numCount++;
            }

        }
        System.out.println("大写字母次数："+bigCount+",小写字母次数："+smallCount+",数字次数："+numCount);

    }
    
    public void phone(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入手机号：");
        String phone = sc.nextLine();
        String startphone = phone.substring(0,3);
        String endphone = phone.substring(7);
        String nowphone = startphone+"****"+endphone;
        System.out.println(nowphone);
    }

    public void mingan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输字符串：");
        String s = sc.nextLine();
        int shuzu[] ;//申明
        shuzu = new int[10];//开辟
        //数组的申明和开辟
        char[] str1 = new char[10];
        String[] str = {"TMD", "sb","nmd"};
        ArrayList<String> stringArrayList = new ArrayList<String>(Arrays.asList(str));
        System.out.println(stringArrayList);
        String res = s.replace("TMD", "***");
        System.out.println(res);


//        for (int i = 0; i < str.length; i++) {
//            String s1 = str[i];
//            int num = s1.length();
//            String s2 = "*";
//            String res = s.replace(s1,s2);
//
//        }

//        for (String ss:str){
//            System.out.println(ss);
//        }


    }
    public static void main(String[] args) {
        Login login = new Login();
//        login.login();
//        login.charArray();
//        login.charCount();
//        login.phone();
        login.mingan();

    }



}
