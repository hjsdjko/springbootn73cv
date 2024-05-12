package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LianxihouqinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LianxihouqinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LianxihouqinView;


/**
 * 联系后勤
 *
 * @author 
 * @email 
 * @date 2022-03-07 16:34:51
 */
public interface LianxihouqinService extends IService<LianxihouqinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LianxihouqinVO> selectListVO(Wrapper<LianxihouqinEntity> wrapper);
   	
   	LianxihouqinVO selectVO(@Param("ew") Wrapper<LianxihouqinEntity> wrapper);
   	
   	List<LianxihouqinView> selectListView(Wrapper<LianxihouqinEntity> wrapper);
   	
   	LianxihouqinView selectView(@Param("ew") Wrapper<LianxihouqinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LianxihouqinEntity> wrapper);
   	

}

