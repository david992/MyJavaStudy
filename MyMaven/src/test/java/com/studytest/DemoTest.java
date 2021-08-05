package com.studytest;

import com.study.Demo;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Program: MyJavaStudy
 * @ClassName: DemoTest
 * @Author: David_J
 * @Copyright David
 * @Date: 2021-08-05 16:49
 * @Version: V1.0
 */
public class DemoTest {
    @Test
    public void testSay(){
        Demo d = new Demo();
        String world = d.say("world");
        Assert.assertEquals("hello world",world);
    }
}
