package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author wangbin
 * @email wbqc1221926@gmail.com
 * @date 2022-01-19 15:55:18
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
