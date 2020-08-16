package test;

import com.dxk.vehicle.cloud.user.UserServiceApplication;
import com.dxk.vehicle.cloud.user.dao.VehicleUserDao;
import com.dxk.vehicle.cloud.user.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @ClassName : UserTest
 * @Description : 用户CRUD单元测试
 * @Author : DingXK
 * @Date: 2020-08-15 22:14
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserServiceApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserTest {

    @Resource
    private VehicleUserDao vehicleUserDao;

    /**
     * @Description： 测试增加用户
     * @Author： DingXK
     * @Date： 2020/8/15 22:28
    */
    @Test
    public void insertUser() {
        User user = new User().toBuilder()
                .userId("123424234")
                .userName("客户")
                .userPassword("pwd")
                .sex(1)
                .build();
        int insert = vehicleUserDao.insert(user);
        System.out.println(insert);
    }

}
