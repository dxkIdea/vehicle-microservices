package com.dxk.vehicle.cloud.user.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dxk.vehicle.cloud.user.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName : VehicleUserDao
 * @Description : 用户持久层接口
 * @Author : DingXK
 * @Date: 2020-08-15 20:09
 */
@Mapper
public interface VehicleUserDao extends BaseMapper<User> {
}
