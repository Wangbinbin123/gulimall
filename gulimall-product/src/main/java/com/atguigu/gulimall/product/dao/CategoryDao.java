package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wangbin
 * @email wbqc1221926@gmail.com
 * @date 2022-01-18 22:06:54
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
