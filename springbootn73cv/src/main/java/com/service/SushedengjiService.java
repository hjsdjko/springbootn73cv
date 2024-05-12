package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SushedengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SushedengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SushedengjiView;


/**
 * 宿舍登记
 *
 * @author 
 * @email 
 * @date 2022-03-07 16:34:51
 */
public interface SushedengjiService extends IService<SushedengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SushedengjiVO> selectListVO(Wrapper<SushedengjiEntity> wrapper);
   	
   	SushedengjiVO selectVO(@Param("ew") Wrapper<SushedengjiEntity> wrapper);
   	
   	List<SushedengjiView> selectListView(Wrapper<SushedengjiEntity> wrapper);
   	
   	SushedengjiView selectView(@Param("ew") Wrapper<SushedengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SushedengjiEntity> wrapper);
   	

}

