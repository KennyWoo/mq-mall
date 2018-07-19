/*
 * Copyright©, 2013-2018, 大连隽城网络科技有限公司
 * Filename:    DemoController
 * Author:      Kenny Woo
 * Date:        18/7/19 下午4:39
 * Description: 
 * History:
 * <author>          <time>          <version>          <description>
 * ------------------------------------------------------------------
 * 作者姓名           修改时间         版本号              描述
 */
package com.kennywoo.mqmall.ucsvr.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kenny Woo
 * @create 18/7/19
 * @since 1.0.0
 */
@RestController
public class DemoController {

    @Value("${nickname}")
    private String nickname;

    @GetMapping("/hi")
    public String demo() {
        return "Hi, " + nickname;
    }

}
