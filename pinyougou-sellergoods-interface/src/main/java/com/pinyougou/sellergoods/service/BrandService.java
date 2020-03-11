package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbBrand;
import com.pinyougou.pojo.UserInfo;

import java.util.List;

public interface BrandService {

    /**
     * 返回全部列表
     * @return
     */
    public List<TbBrand> findAll();

//    /**
//     * 测试
//     * @return
//     */
//    List<UserInfo> queryUserInfoList();
}
