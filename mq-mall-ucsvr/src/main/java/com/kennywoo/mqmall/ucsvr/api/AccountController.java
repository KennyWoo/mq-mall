/*
 * Copyright©, 2013-2018, 大连隽城网络科技有限公司
 * Filename:    AccountController
 * Author:      Kenny Woo
 * Date:        18/7/19 下午5:15
 * Description: 用户API
 * History:
 * <author>          <time>          <version>          <description>
 * ------------------------------------------------------------------
 * 作者姓名           修改时间         版本号              描述
 */
package com.kennywoo.mqmall.ucsvr.api;

import com.kennywoo.mqmall.ucsvr.model.ResponseModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 用户API
 *
 * @author Kenny Woo
 * @create 18/7/19
 * @since 1.0.0
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    /**
     * 个人信息
     *
     * @return
     */
    @GetMapping("/info")
    public ResponseEntity<ResponseModel> info() {
        return ResponseEntity.ok(new ResponseModel());
    }

    /**
     * 地址
     *
     * @return
     */
    @GetMapping("/addresses")
    public ResponseEntity<ResponseModel> addresses() {
        return ResponseEntity.ok(new ResponseModel());
    }

    /**
     * 发票
     *
     * @return
     */
    @GetMapping("/invoices")
    public ResponseEntity<ResponseModel> invoices() {
        return ResponseEntity.ok(new ResponseModel());
    }

    /**
     * 订单
     *
     * @return
     */
    @GetMapping("/orders")
    public ResponseEntity<ResponseModel> orders() {
        return ResponseEntity.ok(new ResponseModel());
    }

    /**
     * 钱包
     *
     * @return
     */
    @GetMapping("/wallet")
    public ResponseEntity<ResponseModel> wallet() {
        return ResponseEntity.ok(new ResponseModel());
    }

    /**
     * 积分
     *
     * @return
     */
    @GetMapping("/points")
    public ResponseEntity<ResponseModel> points() {
        return ResponseEntity.ok(new ResponseModel());
    }

    /**
     * 获取设置信息
     *
     * @return
     */
    @GetMapping("/settings")
    public ResponseEntity<ResponseModel> settings() {
        return ResponseEntity.ok(new ResponseModel());
    }

    /**
     * 更改电话号码
     *
     * @return
     */
    @PutMapping("/settings/mobile")
    public ResponseEntity<ResponseModel> updateAccountMobile() {
        return ResponseEntity.ok(new ResponseModel());
    }

    /**
     * 更改密码
     *
     * @return
     */
    @PostMapping("/settings/resetpwd")
    public ResponseEntity<ResponseModel> updateAccountPassword() {
        return ResponseEntity.ok(new ResponseModel());
    }

    /**
     * 更改支付密码
     *
     * @return
     */
    @GetMapping("/settings/resetpaypwd")
    public ResponseEntity<ResponseModel> updateAccountPayPassword() {
        return ResponseEntity.ok(new ResponseModel());
    }

}
