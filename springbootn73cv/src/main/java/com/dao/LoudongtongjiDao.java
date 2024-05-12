package com.dao;

import com.entity.LoudongtongjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LoudongtongjiVO;
import com.entity.view.LoudongtongjiView;


/**
 * 楼栋统计
 * 
 * @author 
 * @email 
 * @date 2022-03-07 16:34:51
 */
public interface LoudongtongjiDao extends BaseMapper<LoudongtongjiEntity> {
	
	List<LoudongtongjiVO> selectListVO(@Param("ew") Wrapper<LoudongtongjiEntity> wrapper);
	
	LoudongtongjiVO selectVO(@Param("ew") Wrapper<LoudongtongjiEntity> wrapper);
	
	List<LoudongtongjiView> selectListView(@Param("ew") Wrapper<LoudongtongjiEntity> wrapper);

	List<LoudongtongjiView> selectListView(Pagination page,@Param("ew") Wrapper<LoudongtongjiEntity> wrapper);
	
	LoudongtongjiView selectView(@Param("ew") Wrapper<LoudongtongjiEntity> wrapper);
	

}
