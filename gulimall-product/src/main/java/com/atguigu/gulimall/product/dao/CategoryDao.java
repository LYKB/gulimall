package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author LY
 * @email 790095595@qq.com
 * @date 2022-08-26 10:22:55
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
