package com.dxk.vehicle.cloud.user.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName : User
 * @Description : 用户表实体
 * @Author : DingXK
 * @Date: 2020-08-15 19:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@TableName(value = "vehicle_user")
public class User implements Serializable {
    private static final long serialVersionUID = 5087347406006284367L;

    /**
     * 用户ID
     */
    @TableId
    @TableField(value = "user_id")
    private String userId;

    /**
     * 用户名
     */
    @TableField(value = "user_name")
    private String userName;

    /**
     * 密码
     */
    @TableField(value = "user_pwd")
    private String userPassword;

    /**
     * 性别
     */
    @TableField(value = "user_sex")
    private Integer sex;
}
