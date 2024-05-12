package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.WeiguiqinshiDao;
import com.entity.WeiguiqinshiEntity;
import com.service.WeiguiqinshiService;
import com.entity.vo.WeiguiqinshiVO;
import com.entity.view.WeiguiqinshiView;

@Service("weiguiqinshiService")
public class WeiguiqinshiServiceImpl extends ServiceImpl<WeiguiqinshiDao, WeiguiqinshiEntity> implements WeiguiqinshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeiguiqinshiEntity> page = this.selectPage(
                new Query<WeiguiqinshiEntity>(params).getPage(),
                new EntityWrapper<WeiguiqinshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeiguiqinshiEntity> wrapper) {
		  Page<WeiguiqinshiView> page =new Query<WeiguiqinshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WeiguiqinshiVO> selectListVO(Wrapper<WeiguiqinshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeiguiqinshiVO selectVO(Wrapper<WeiguiqinshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeiguiqinshiView> selectListView(Wrapper<WeiguiqinshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeiguiqinshiView selectView(Wrapper<WeiguiqinshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
