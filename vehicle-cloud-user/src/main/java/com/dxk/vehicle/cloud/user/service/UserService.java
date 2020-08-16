package com.dxk.vehicle.cloud.user.service;

import com.dxk.vehicle.cloud.common.dto.ResultDTO;
import com.dxk.vehicle.cloud.user.entity.User;

public interface UserService {

    /**
     * 新增一个用户
     * @param user
     * @return
     */
    ResultDTO<User> insertUser(User user);
}
