/*
 * Copyright©, 2013-2018, 大连隽城网络科技有限公司
 * Filename:    ResponseModel
 * Author:      Kenny Woo
 * Date:        18/7/19 下午4:53
 * Description: 统一返回对象
 * History:
 * <author>          <time>          <version>          <description>
 * ------------------------------------------------------------------
 * 作者姓名           修改时间         版本号              描述
 */
package com.kennywoo.mqmall.ucsvr.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 统一返回对象
 *
 * @author Kenny Woo
 * @create 18/7/19
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseModel {

    /* 状态码 */
    private Integer code;

    /* 消息 */
    private String message;

    /* 返回数据结果 */
    private Object data;

}
