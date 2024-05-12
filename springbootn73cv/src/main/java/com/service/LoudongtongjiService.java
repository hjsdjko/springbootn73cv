package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LoudongtongjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LoudongtongjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LoudongtongjiView;


/**
 * 楼栋统计
 *
 * @author 
 * @email 
 * @date 2022-03-07 16:34:51
 */
public interface LoudongtongjiService extends IService<LoudongtongjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LoudongtongjiVO> selectListVO(Wrapper<LoudongtongjiEntity> wrapper);
   	
   	LoudongtongjiVO selectVO(@Param("ew") Wrapper<LoudongtongjiEntity> wrapper);
   	
   	List<LoudongtongjiView> selectListView(Wrapper<LoudongtongjiEntity> wrapper);
   	
   	LoudongtongjiView selectView(@Param("ew") Wrapper<LoudongtongjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LoudongtongjiEntity> wrapper);
   	

}

