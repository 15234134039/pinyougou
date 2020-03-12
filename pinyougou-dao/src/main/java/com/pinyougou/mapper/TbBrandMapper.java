package com.pinyougou.mapper;

import com.pinyougou.pojo.TbBrand;
import com.pinyougou.pojo.TbBrandExample;
import com.pinyougou.pojo.UserInfo;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;


import java.util.List;

public interface TbBrandMapper {

//    @Select("select id, name, first_char from tb_brand")
//    @Results({
//        @Result(id=true, property = "id", column = "id"),
//        @Result(property = "name", column = "name"),
//        @Result(property = "firstChar", column = "first_char"),
//    })
    List<TbBrand> selectByExample(TbBrandExample example);

    int insert(TbBrand record);

    int updateByPrimaryKey(TbBrand record);

    TbBrand selectByPrimaryKey(Long id);

    int deleteByPrimaryKey(Long id);





//    /**
//     * 测试
//     * @return
//     */
//    @Select("select * from t_userInfo")
//    public List<UserInfo> queryUserInfoList();

}