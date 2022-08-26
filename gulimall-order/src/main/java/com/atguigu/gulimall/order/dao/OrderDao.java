package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author LY
 * @email 790095595@qq.com
 * @date 2022-08-26 15:01:47
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
