package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShenqingtijiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShenqingtijiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShenqingtijiaoView;


/**
 * 申请提交
 *
 * @author 
 * @email 
 * @date 2022-03-07 16:34:51
 */
public interface ShenqingtijiaoService extends IService<ShenqingtijiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShenqingtijiaoVO> selectListVO(Wrapper<ShenqingtijiaoEntity> wrapper);
   	
   	ShenqingtijiaoVO selectVO(@Param("ew") Wrapper<ShenqingtijiaoEntity> wrapper);
   	
   	List<ShenqingtijiaoView> selectListView(Wrapper<ShenqingtijiaoEntity> wrapper);
   	
   	ShenqingtijiaoView selectView(@Param("ew") Wrapper<ShenqingtijiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShenqingtijiaoEntity> wrapper);
   	

}

