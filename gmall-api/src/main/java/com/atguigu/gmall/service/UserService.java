package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.bean.UserInfo;

import java.util.List;

public interface UserService {

    List<UserInfo> getAllUserInfo();

    List<UserAddress> getUserAddressesById(String userId);

}
