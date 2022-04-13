package base.cglib;

import com.study.service.UserService;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Program: MyJavaStudy
 * @ClassName: UserServiceCglibProxy
 * @Author: David_J
 * @Copyright David
 * @Date: 2022-04-13 11:37
 * @Version: V1.0
 */
public class UserServiceCglibProxy {
    public static UserService creatUserServiceCglibProxy(Class clazz){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                Object ret = methodProxy.invokeSuper(o,objects);
                if (method.getName().equals("save")){
                    System.out.println("add new one");
                }
                return ret;
            }
        });
        return  (UserService) enhancer.create();
    }
}
