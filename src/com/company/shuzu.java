package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class shuzu {
    public static void main(String[] args){
        int sum  =add(10,20);

//        int max = getMax(array());
//        System.out.print("数组中最大值："+max);
       // insertArr(array(),2,999);
        deleteArr(array(),2);
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static int getMax(int[] arry){
        int max = arry[0];
        for (int i=0;i<arry.length;i++){
            if (arry[i]>max){
                max = arry[i];
            };
        }

        return max;
    }
    public static int[] array(){
        //数组初始化
        int arr2[] = new int[] {1,2};
        String array[] = new String[]{"黄渤","张艺兴"};
        String array2[] = new String[5];
        array[0]= "1";
        int [] arr5 = {1,2,3};//静态初始化
        int [] arr3 = new int[]{1,2};
        String[] arr4= new String[3];
        arr4[0] = "10";
        arr4[1] = "10";
        arr4[2] = "10";
        int array3[] = {1,2,3};
        //申明
        int [] arr;
        String [] arr1;
        //创建
        arr = new int[10];
        //赋值
        Scanner sc = new Scanner(System.in);
        for (int i =0;i<10;i++){
            System.out.print("请输入第"+(i+1)+"个学生的成绩：");
            arr[i] = sc.nextInt();
        }
        System.out.print(Arrays.toString(arr));
        for (int num:arr){
            System.out.print(num+",");
        }
        return arr;
    }
    public static void insertArr(int[] arr,int index,int num){
        System.out.println("\n原数组为:"+Arrays.toString(arr));
        for(int i =arr.length-1;i>index;i--){
            arr[i] = arr[i-1];
        }
        arr[index]=num;
        System.out.println("\n添加后组为:"+Arrays.toString(arr));

    }
    public static void deleteArr(int[] arr,int index){
        for (int i=index;i<=arr.length-2;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
        System.out.println("\n删除后组为:"+Arrays.toString(arr));

    }
}
