package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LoudongxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LoudongxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LoudongxinxiView;


/**
 * 楼栋信息
 *
 * @author 
 * @email 
 * @date 2022-03-07 16:34:51
 */
public interface LoudongxinxiService extends IService<LoudongxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LoudongxinxiVO> selectListVO(Wrapper<LoudongxinxiEntity> wrapper);
   	
   	LoudongxinxiVO selectVO(@Param("ew") Wrapper<LoudongxinxiEntity> wrapper);
   	
   	List<LoudongxinxiView> selectListView(Wrapper<LoudongxinxiEntity> wrapper);
   	
   	LoudongxinxiView selectView(@Param("ew") Wrapper<LoudongxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LoudongxinxiEntity> wrapper);
   	

}

