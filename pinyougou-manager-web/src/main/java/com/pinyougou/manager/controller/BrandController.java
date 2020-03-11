package com.pinyougou.manager.controller;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellergoods.service.BrandService;
import com.alibaba.dubbo.config.annotation.Reference;


/**
 * 品牌controller
 * @author Administrator
 */
@RestController
@RequestMapping("/brand")
public class BrandController {

    @Reference
    private BrandService brandService;
    /**
     * 返回全部列表
     * @return
     */
    @RequestMapping("/findAll")
    public List<TbBrand> findAll(){
        return brandService.findAll();
    }

//    /**
//     * 测试
//     * @return
//     */
//    @RequestMapping("/find")
//    public List<UserInfo> find(){
//         return brandService.queryUserInfoList();
//    }
}

