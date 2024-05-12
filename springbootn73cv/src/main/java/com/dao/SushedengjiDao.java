package com.dao;

import com.entity.SushedengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SushedengjiVO;
import com.entity.view.SushedengjiView;


/**
 * 宿舍登记
 * 
 * @author 
 * @email 
 * @date 2022-03-07 16:34:51
 */
public interface SushedengjiDao extends BaseMapper<SushedengjiEntity> {
	
	List<SushedengjiVO> selectListVO(@Param("ew") Wrapper<SushedengjiEntity> wrapper);
	
	SushedengjiVO selectVO(@Param("ew") Wrapper<SushedengjiEntity> wrapper);
	
	List<SushedengjiView> selectListView(@Param("ew") Wrapper<SushedengjiEntity> wrapper);

	List<SushedengjiView> selectListView(Pagination page,@Param("ew") Wrapper<SushedengjiEntity> wrapper);
	
	SushedengjiView selectView(@Param("ew") Wrapper<SushedengjiEntity> wrapper);
	

}
