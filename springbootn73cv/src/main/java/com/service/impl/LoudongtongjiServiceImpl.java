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


import com.dao.LoudongtongjiDao;
import com.entity.LoudongtongjiEntity;
import com.service.LoudongtongjiService;
import com.entity.vo.LoudongtongjiVO;
import com.entity.view.LoudongtongjiView;

@Service("loudongtongjiService")
public class LoudongtongjiServiceImpl extends ServiceImpl<LoudongtongjiDao, LoudongtongjiEntity> implements LoudongtongjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LoudongtongjiEntity> page = this.selectPage(
                new Query<LoudongtongjiEntity>(params).getPage(),
                new EntityWrapper<LoudongtongjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LoudongtongjiEntity> wrapper) {
		  Page<LoudongtongjiView> page =new Query<LoudongtongjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LoudongtongjiVO> selectListVO(Wrapper<LoudongtongjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LoudongtongjiVO selectVO(Wrapper<LoudongtongjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LoudongtongjiView> selectListView(Wrapper<LoudongtongjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LoudongtongjiView selectView(Wrapper<LoudongtongjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
