package com.dao;

import com.entity.ZaisuqingkuangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZaisuqingkuangVO;
import com.entity.view.ZaisuqingkuangView;


/**
 * 在宿情况
 * 
 * @author 
 * @email 
 * @date 2022-03-07 16:34:51
 */
public interface ZaisuqingkuangDao extends BaseMapper<ZaisuqingkuangEntity> {
	
	List<ZaisuqingkuangVO> selectListVO(@Param("ew") Wrapper<ZaisuqingkuangEntity> wrapper);
	
	ZaisuqingkuangVO selectVO(@Param("ew") Wrapper<ZaisuqingkuangEntity> wrapper);
	
	List<ZaisuqingkuangView> selectListView(@Param("ew") Wrapper<ZaisuqingkuangEntity> wrapper);

	List<ZaisuqingkuangView> selectListView(Pagination page,@Param("ew") Wrapper<ZaisuqingkuangEntity> wrapper);
	
	ZaisuqingkuangView selectView(@Param("ew") Wrapper<ZaisuqingkuangEntity> wrapper);
	

}
