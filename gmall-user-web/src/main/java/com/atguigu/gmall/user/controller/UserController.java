package com.atguigu.gmall.user.controller;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.bean.UserInfo;
import com.atguigu.gmall.service.UserService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Reference
    UserService userService;

    @RequestMapping("getAllUserInfo")
    public ResponseEntity<List<UserInfo>> getAllUserInfo(HttpRequest request){
        List<UserInfo> userInfos = userService.getAllUserInfo();
        return ResponseEntity.ok(userInfos);
    }

    @RequestMapping("getAddressesByUserId")
    public ResponseEntity<List<UserAddress>> getAddressesByUserId(String userId){
        List<UserAddress> addresses = userService.getUserAddressesById(userId);
        return  ResponseEntity.ok(addresses);
    }
}
