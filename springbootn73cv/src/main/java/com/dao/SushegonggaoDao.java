package com.dao;

import com.entity.SushegonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SushegonggaoVO;
import com.entity.view.SushegonggaoView;


/**
 * 宿舍公告
 * 
 * @author 
 * @email 
 * @date 2022-03-07 16:34:51
 */
public interface SushegonggaoDao extends BaseMapper<SushegonggaoEntity> {
	
	List<SushegonggaoVO> selectListVO(@Param("ew") Wrapper<SushegonggaoEntity> wrapper);
	
	SushegonggaoVO selectVO(@Param("ew") Wrapper<SushegonggaoEntity> wrapper);
	
	List<SushegonggaoView> selectListView(@Param("ew") Wrapper<SushegonggaoEntity> wrapper);

	List<SushegonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<SushegonggaoEntity> wrapper);
	
	SushegonggaoView selectView(@Param("ew") Wrapper<SushegonggaoEntity> wrapper);
	

}
