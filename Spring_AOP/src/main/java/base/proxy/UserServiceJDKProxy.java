package base.proxy;

import com.study.service.UserService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Program: MyJavaStudy
 * @ClassName: UserServiceJDKProxy
 * @Author: David_J
 * @Copyright David
 * @Date: 2022-04-12 15:50
 * @Version: V1.0
 */
public class UserServiceJDKProxy {
    public static UserService creatUserServiceJDKProxy(final UserService userService){
        ClassLoader cl = userService.getClass().getClassLoader();
        Class[] classes = userService.getClass().getInterfaces();

        InvocationHandler ih = new InvocationHandler(){
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                Object rst = method.invoke(userService, objects);
                System.out.println("增加功能");
                return rst;
            }
        };
        UserService service = (UserService) Proxy.newProxyInstance(cl,classes,ih);
        return service;
    }
}
