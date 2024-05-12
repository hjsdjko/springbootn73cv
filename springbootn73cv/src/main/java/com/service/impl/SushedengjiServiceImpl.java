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


import com.dao.SushedengjiDao;
import com.entity.SushedengjiEntity;
import com.service.SushedengjiService;
import com.entity.vo.SushedengjiVO;
import com.entity.view.SushedengjiView;

@Service("sushedengjiService")
public class SushedengjiServiceImpl extends ServiceImpl<SushedengjiDao, SushedengjiEntity> implements SushedengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SushedengjiEntity> page = this.selectPage(
                new Query<SushedengjiEntity>(params).getPage(),
                new EntityWrapper<SushedengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SushedengjiEntity> wrapper) {
		  Page<SushedengjiView> page =new Query<SushedengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SushedengjiVO> selectListVO(Wrapper<SushedengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SushedengjiVO selectVO(Wrapper<SushedengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SushedengjiView> selectListView(Wrapper<SushedengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SushedengjiView selectView(Wrapper<SushedengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
