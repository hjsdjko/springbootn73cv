package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WeiguiqinshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WeiguiqinshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WeiguiqinshiView;


/**
 * 未归寝室
 *
 * @author 
 * @email 
 * @date 2022-03-07 16:34:51
 */
public interface WeiguiqinshiService extends IService<WeiguiqinshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WeiguiqinshiVO> selectListVO(Wrapper<WeiguiqinshiEntity> wrapper);
   	
   	WeiguiqinshiVO selectVO(@Param("ew") Wrapper<WeiguiqinshiEntity> wrapper);
   	
   	List<WeiguiqinshiView> selectListView(Wrapper<WeiguiqinshiEntity> wrapper);
   	
   	WeiguiqinshiView selectView(@Param("ew") Wrapper<WeiguiqinshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WeiguiqinshiEntity> wrapper);
   	

}

