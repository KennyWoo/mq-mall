/*
 * Copyright©, 2013-2018, 大连隽城网络科技有限公司
 * Filename:    MemberWalletController
 * Author:      Kenny Woo
 * Date:        18/7/19 下午5:08
 * Description: 会员钱包管理API
 * History:
 * <author>          <time>          <version>          <description>
 * ------------------------------------------------------------------
 * 作者姓名           修改时间         版本号              描述
 */
package com.kennywoo.mqmall.ucsvr.api;

import com.kennywoo.mqmall.ucsvr.model.ResponseModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 会员通知管理API
 *
 * @author Kenny Woo
 * @create 18/7/19
 * @since 1.0.0
 */
@RestController
public class MemberNoticeController {

    /**
     * 会员通知列表
     *
     * @param id
     * @return
     */
    @GetMapping("/members/{id}/notices")
    public ResponseEntity<ResponseModel> index(@PathVariable String id) {
        return ResponseEntity.ok(new ResponseModel());
    }

    /**
     * 会员通知详情
     *
     * @param id
     * @param noticeId
     * @return
     */
    @GetMapping("/members/{id}/notices/{noticeId}")
    public ResponseEntity<ResponseModel> show(@PathVariable String id, @PathVariable String noticeId) {
        return ResponseEntity.ok(new ResponseModel());
    }

}
