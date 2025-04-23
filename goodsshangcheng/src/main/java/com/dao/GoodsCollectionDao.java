package com.dao;

import com.entity.GoodsCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GoodsCollectionView;

/**
 * 商品关注 Dao 接口
 *
 * @author 
 */
public interface GoodsCollectionDao extends BaseMapper<GoodsCollectionEntity> {

   List<GoodsCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
