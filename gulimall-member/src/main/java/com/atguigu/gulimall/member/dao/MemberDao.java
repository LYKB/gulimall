package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author LY
 * @email 790095595@qq.com
 * @date 2022-08-26 14:29:54
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
