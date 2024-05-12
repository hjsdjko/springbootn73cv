package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengbaoxiuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengbaoxiuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengbaoxiuView;


/**
 * 学生报修
 *
 * @author 
 * @email 
 * @date 2022-03-07 16:34:51
 */
public interface XueshengbaoxiuService extends IService<XueshengbaoxiuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengbaoxiuVO> selectListVO(Wrapper<XueshengbaoxiuEntity> wrapper);
   	
   	XueshengbaoxiuVO selectVO(@Param("ew") Wrapper<XueshengbaoxiuEntity> wrapper);
   	
   	List<XueshengbaoxiuView> selectListView(Wrapper<XueshengbaoxiuEntity> wrapper);
   	
   	XueshengbaoxiuView selectView(@Param("ew") Wrapper<XueshengbaoxiuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengbaoxiuEntity> wrapper);
   	

}

