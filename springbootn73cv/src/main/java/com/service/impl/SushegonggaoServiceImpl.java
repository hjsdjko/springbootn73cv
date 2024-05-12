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


import com.dao.SushegonggaoDao;
import com.entity.SushegonggaoEntity;
import com.service.SushegonggaoService;
import com.entity.vo.SushegonggaoVO;
import com.entity.view.SushegonggaoView;

@Service("sushegonggaoService")
public class SushegonggaoServiceImpl extends ServiceImpl<SushegonggaoDao, SushegonggaoEntity> implements SushegonggaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SushegonggaoEntity> page = this.selectPage(
                new Query<SushegonggaoEntity>(params).getPage(),
                new EntityWrapper<SushegonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SushegonggaoEntity> wrapper) {
		  Page<SushegonggaoView> page =new Query<SushegonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SushegonggaoVO> selectListVO(Wrapper<SushegonggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SushegonggaoVO selectVO(Wrapper<SushegonggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SushegonggaoView> selectListView(Wrapper<SushegonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SushegonggaoView selectView(Wrapper<SushegonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
