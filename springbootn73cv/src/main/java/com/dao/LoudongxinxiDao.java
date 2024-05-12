package com.dao;

import com.entity.LoudongxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LoudongxinxiVO;
import com.entity.view.LoudongxinxiView;


/**
 * 楼栋信息
 * 
 * @author 
 * @email 
 * @date 2022-03-07 16:34:51
 */
public interface LoudongxinxiDao extends BaseMapper<LoudongxinxiEntity> {
	
	List<LoudongxinxiVO> selectListVO(@Param("ew") Wrapper<LoudongxinxiEntity> wrapper);
	
	LoudongxinxiVO selectVO(@Param("ew") Wrapper<LoudongxinxiEntity> wrapper);
	
	List<LoudongxinxiView> selectListView(@Param("ew") Wrapper<LoudongxinxiEntity> wrapper);

	List<LoudongxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<LoudongxinxiEntity> wrapper);
	
	LoudongxinxiView selectView(@Param("ew") Wrapper<LoudongxinxiEntity> wrapper);
	

}
