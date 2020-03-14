package com.pinyougou.mapper;

import com.pinyougou.pojo.TbUser;


public interface TbUserMapper {

    TbUser selectByUserName(String username);

}