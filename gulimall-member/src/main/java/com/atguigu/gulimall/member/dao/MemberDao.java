package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wangbin
 * @email wbqc1221926@gmail.com
 * @date 2022-01-19 16:10:25
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
