package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.mapper.TbUserMapper;
import com.pinyougou.pojo.TbUser;
import com.pinyougou.sellergoods.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 服务实现层
 * @author
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private TbUserMapper userMapper;

	/**
	 * 根据username获取实体
	 * @param username
	 * @return
	 */
	@Override
	public TbUser findOne(String username){
		return userMapper.selectByUserName(username);
	}
}
