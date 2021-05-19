package com.china315net;

import java.util.Objects;

/**
 * @Program: test
 * @ClassName: Student
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-04-28 15:41
 * @Version: V1.0
 */

//继承 is-a
public class Student extends Human {//子类继承自Human类
    private int sno;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public void Study(){
        System.out.println("study****************");
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno=" + sno +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sno == student.sno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sno);
    }
}
