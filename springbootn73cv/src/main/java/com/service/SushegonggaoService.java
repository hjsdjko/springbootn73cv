package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SushegonggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SushegonggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SushegonggaoView;


/**
 * 宿舍公告
 *
 * @author 
 * @email 
 * @date 2022-03-07 16:34:51
 */
public interface SushegonggaoService extends IService<SushegonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SushegonggaoVO> selectListVO(Wrapper<SushegonggaoEntity> wrapper);
   	
   	SushegonggaoVO selectVO(@Param("ew") Wrapper<SushegonggaoEntity> wrapper);
   	
   	List<SushegonggaoView> selectListView(Wrapper<SushegonggaoEntity> wrapper);
   	
   	SushegonggaoView selectView(@Param("ew") Wrapper<SushegonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SushegonggaoEntity> wrapper);
   	

}

