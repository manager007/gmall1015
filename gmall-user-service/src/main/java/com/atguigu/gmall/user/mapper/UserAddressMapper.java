package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.bean.UserAddress;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.atguigu.gmall.user.mapper.UserAddressMapper")
public interface UserAddressMapper extends Mapper<UserAddress> {
}
