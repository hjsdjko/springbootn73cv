package com.dao;

import com.entity.ShenqingtijiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShenqingtijiaoVO;
import com.entity.view.ShenqingtijiaoView;


/**
 * 申请提交
 * 
 * @author 
 * @email 
 * @date 2022-03-07 16:34:51
 */
public interface ShenqingtijiaoDao extends BaseMapper<ShenqingtijiaoEntity> {
	
	List<ShenqingtijiaoVO> selectListVO(@Param("ew") Wrapper<ShenqingtijiaoEntity> wrapper);
	
	ShenqingtijiaoVO selectVO(@Param("ew") Wrapper<ShenqingtijiaoEntity> wrapper);
	
	List<ShenqingtijiaoView> selectListView(@Param("ew") Wrapper<ShenqingtijiaoEntity> wrapper);

	List<ShenqingtijiaoView> selectListView(Pagination page,@Param("ew") Wrapper<ShenqingtijiaoEntity> wrapper);
	
	ShenqingtijiaoView selectView(@Param("ew") Wrapper<ShenqingtijiaoEntity> wrapper);
	

}
