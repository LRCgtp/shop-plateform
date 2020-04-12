package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 *
 * @author lrc
 * @email lrc18295071494@sina.com
 * @date 2020-04-11 19:24:46
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {

}
