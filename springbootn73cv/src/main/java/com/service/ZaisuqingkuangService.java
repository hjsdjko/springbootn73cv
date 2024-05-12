package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZaisuqingkuangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZaisuqingkuangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZaisuqingkuangView;


/**
 * 在宿情况
 *
 * @author 
 * @email 
 * @date 2022-03-07 16:34:51
 */
public interface ZaisuqingkuangService extends IService<ZaisuqingkuangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZaisuqingkuangVO> selectListVO(Wrapper<ZaisuqingkuangEntity> wrapper);
   	
   	ZaisuqingkuangVO selectVO(@Param("ew") Wrapper<ZaisuqingkuangEntity> wrapper);
   	
   	List<ZaisuqingkuangView> selectListView(Wrapper<ZaisuqingkuangEntity> wrapper);
   	
   	ZaisuqingkuangView selectView(@Param("ew") Wrapper<ZaisuqingkuangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZaisuqingkuangEntity> wrapper);
   	

}

