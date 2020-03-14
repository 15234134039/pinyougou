package com.pinyougou.manager.service;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbUser;
import com.pinyougou.sellergoods.service.UserService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * 认证类
 * @author
 *
 */
public class UserDetailsServiceImpl implements UserDetailsService {

    private UserService userService;
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<GrantedAuthority> grantedAuths = new ArrayList<GrantedAuthority>();
        grantedAuths.add(new SimpleGrantedAuthority("ROLE_USER"));
        TbUser user = userService.findOne(username);
        if(user != null){
            if(user.getStatus().equals("1")){
                return new User(username,user.getPassword(), grantedAuths);
            }else {
                return null;
            }
        }else {
            return null;
        }


    }



}

