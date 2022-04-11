package base.decorator;

import com.study.service.UserService;

/**
 * @Program: MyJavaStudy
 * @ClassName: UserServiceImplDecorator
 * @Author: David_J
 * @Copyright David
 * @Date: 2022-04-06 17:18
 * @Version: V1.0
 */
public class UserServiceImplDecorator implements UserService {

    private  UserService userService;

    public UserServiceImplDecorator(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void canshu(int i) {

    }

    @Override
    public int update() {
        return 0;
    }

    @Override
    public void delete() {

    }

    @Override
    public void save() {
        userService.save();
        System.out.println("add ~~~~~~~~~~");
    }
}
