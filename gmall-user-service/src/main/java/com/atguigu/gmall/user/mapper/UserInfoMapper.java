package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.bean.UserInfo;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.atguigu.gmall.user.mapper.UserInfoMapper")
public interface UserInfoMapper extends Mapper<UserInfo> {

}
