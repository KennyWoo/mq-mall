/*
 * Copyright©, 2013-2018, 大连隽城网络科技有限公司
 * Filename:    MemberController
 * Author:      Kenny Woo
 * Date:        18/7/19 下午4:55
 * Description: 会员管理
 * History:
 * <author>          <time>          <version>          <description>
 * ------------------------------------------------------------------
 * 作者姓名           修改时间         版本号              描述
 */
package com.kennywoo.mqmall.ucsvr.api;

import com.kennywoo.mqmall.ucsvr.model.ResponseModel;
import com.kennywoo.mqmall.ucsvr.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * 会员管理API
 *
 * @author Kenny Woo
 * @create 18/7/19
 * @since 1.0.0
 */
@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    /**
     * 会员列表
     *
     * @return
     */
    @GetMapping("/members")
    public ResponseEntity<ResponseModel> index() {
        return ResponseEntity.ok(new ResponseModel());
    }

    /**
     * 会员详情
     *
     * @param id
     * @return
     */
    @GetMapping("/members/{id}")
    public ResponseEntity<ResponseModel> show(@PathVariable String id) {
        return ResponseEntity.ok(new ResponseModel());
    }

    /**
     * 会员更新
     *
     * @param id
     * @param obj
     * @return
     */
    @PutMapping("/members/{id}")
    public ResponseEntity<ResponseModel> update(@PathVariable String id, @RequestBody Object obj) {
        return ResponseEntity.ok(new ResponseModel());
    }

    /**
     * 会员批量导入
     *
     * @param file
     * @return
     */
    @PostMapping("/members/load")
    public ResponseEntity<ResponseModel> load(MultipartFile file) {
        return ResponseEntity.ok(new ResponseModel());
    }

    /**
     * 会员批量导出
     *
     * @return
     */
    @GetMapping("/members/export")
    public ResponseEntity<ResponseModel> export() {
        return ResponseEntity.ok(new ResponseModel());
    }

    /**
     * 单个会员详细信息导出
     *
     * @param id
     * @return
     */
    @GetMapping("/members/{id}/export")
    public ResponseEntity<ResponseModel> export(@PathVariable String id) {
        return ResponseEntity.ok(new ResponseModel());
    }

}
