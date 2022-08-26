package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author LY
 * @email 790095595@qq.com
 * @date 2022-08-26 14:13:33
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
