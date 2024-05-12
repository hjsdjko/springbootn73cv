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


import com.dao.LoudongxinxiDao;
import com.entity.LoudongxinxiEntity;
import com.service.LoudongxinxiService;
import com.entity.vo.LoudongxinxiVO;
import com.entity.view.LoudongxinxiView;

@Service("loudongxinxiService")
public class LoudongxinxiServiceImpl extends ServiceImpl<LoudongxinxiDao, LoudongxinxiEntity> implements LoudongxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LoudongxinxiEntity> page = this.selectPage(
                new Query<LoudongxinxiEntity>(params).getPage(),
                new EntityWrapper<LoudongxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LoudongxinxiEntity> wrapper) {
		  Page<LoudongxinxiView> page =new Query<LoudongxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LoudongxinxiVO> selectListVO(Wrapper<LoudongxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LoudongxinxiVO selectVO(Wrapper<LoudongxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LoudongxinxiView> selectListView(Wrapper<LoudongxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LoudongxinxiView selectView(Wrapper<LoudongxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
