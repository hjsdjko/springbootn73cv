package com.dao;

import com.entity.WeiguiqinshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WeiguiqinshiVO;
import com.entity.view.WeiguiqinshiView;


/**
 * 未归寝室
 * 
 * @author 
 * @email 
 * @date 2022-03-07 16:34:51
 */
public interface WeiguiqinshiDao extends BaseMapper<WeiguiqinshiEntity> {
	
	List<WeiguiqinshiVO> selectListVO(@Param("ew") Wrapper<WeiguiqinshiEntity> wrapper);
	
	WeiguiqinshiVO selectVO(@Param("ew") Wrapper<WeiguiqinshiEntity> wrapper);
	
	List<WeiguiqinshiView> selectListView(@Param("ew") Wrapper<WeiguiqinshiEntity> wrapper);

	List<WeiguiqinshiView> selectListView(Pagination page,@Param("ew") Wrapper<WeiguiqinshiEntity> wrapper);
	
	WeiguiqinshiView selectView(@Param("ew") Wrapper<WeiguiqinshiEntity> wrapper);
	

}
