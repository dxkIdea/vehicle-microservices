package com.dxk.vehicle.cloud.common.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName : ResponseDTO
 * @Description : 响应实体类
 * @Author : DingXK
 * @Date: 2020-08-16 14:51
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResultDTO<T> {
    /**
     * 是否成功
     */
    private boolean success;

    /**
     * 响应编码
     */
    private Integer resultCode;

    /**
     * 响应提示语
     */
    private String resultMsg;

    /**
     * 响应数据
     */
    private T resultData;
}
