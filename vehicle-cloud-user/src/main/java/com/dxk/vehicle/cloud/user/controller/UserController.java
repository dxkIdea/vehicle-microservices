package com.dxk.vehicle.cloud.user.controller;

import com.dxk.vehicle.cloud.common.dto.ResultDTO;
import com.dxk.vehicle.cloud.user.entity.User;
import com.dxk.vehicle.cloud.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : UserController
 * @Description : 客户操作控制层
 * @Author : DingXK
 * @Date: 2020-08-15 20:22
 */
@RestController
@Api(tags = "用户添加、注销、更新控制层")
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * @Description：新增一个用户
     * @Duthor： DingXK
     * @Date： 2020/8/15 20:33
    */
    @PostMapping(value = "/addUser")
    @ApiOperation(value = "客户微服务，新增用户", httpMethod = "POST")
    public ResultDTO<User> insertUser(@RequestBody User user) {
        return userService.insertUser(user);
    }

}
