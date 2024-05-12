package com.dao;

import com.entity.LianxihouqinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LianxihouqinVO;
import com.entity.view.LianxihouqinView;


/**
 * 联系后勤
 * 
 * @author 
 * @email 
 * @date 2022-03-07 16:34:51
 */
public interface LianxihouqinDao extends BaseMapper<LianxihouqinEntity> {
	
	List<LianxihouqinVO> selectListVO(@Param("ew") Wrapper<LianxihouqinEntity> wrapper);
	
	LianxihouqinVO selectVO(@Param("ew") Wrapper<LianxihouqinEntity> wrapper);
	
	List<LianxihouqinView> selectListView(@Param("ew") Wrapper<LianxihouqinEntity> wrapper);

	List<LianxihouqinView> selectListView(Pagination page,@Param("ew") Wrapper<LianxihouqinEntity> wrapper);
	
	LianxihouqinView selectView(@Param("ew") Wrapper<LianxihouqinEntity> wrapper);
	

}
