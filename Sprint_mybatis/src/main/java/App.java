import com.study.config.SpringConfig;
import com.study.domain.Account;
import com.study.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

/**
 * @Program: MyJavaStudy
 * @ClassName: App
 * @Author: David_J
 * @Copyright David
 * @Date: 2022-02-23 14:00
 * @Version: V1.0
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = (AccountService) ctx.getBean("accountService");
        Account ac = accountService.findById(1);
        System.out.println(ac);

//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
//        AccountService accountService = (AccountService) ctx.getBean("accountService");
//        Account ac = accountService.findById(1);
//        System.out.println(ac);
    }
}
