package com.dxk.vehicle.cloud.user.service.Impl;

import com.dxk.vehicle.cloud.common.dto.ResultDTO;
import com.dxk.vehicle.cloud.user.dao.VehicleUserDao;
import com.dxk.vehicle.cloud.user.entity.User;
import com.dxk.vehicle.cloud.user.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName : UserServiceImpl
 * @Description : 用户基本操作服务
 * @Author : DingXK
 * @Date: 2020-08-15 18:59
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private VehicleUserDao vehicleUserDao;

    @Override
    public ResultDTO<User> insertUser(User user) {
        ResultDTO<User> result = new ResultDTO<User>(true,200,"新增成功",user);
        int insert = vehicleUserDao.insert(user);
        if (1 == insert) {
            return result;
        }else {
            return null;
        }
    }
}
