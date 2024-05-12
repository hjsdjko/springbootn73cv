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


import com.dao.ShenqingtijiaoDao;
import com.entity.ShenqingtijiaoEntity;
import com.service.ShenqingtijiaoService;
import com.entity.vo.ShenqingtijiaoVO;
import com.entity.view.ShenqingtijiaoView;

@Service("shenqingtijiaoService")
public class ShenqingtijiaoServiceImpl extends ServiceImpl<ShenqingtijiaoDao, ShenqingtijiaoEntity> implements ShenqingtijiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenqingtijiaoEntity> page = this.selectPage(
                new Query<ShenqingtijiaoEntity>(params).getPage(),
                new EntityWrapper<ShenqingtijiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenqingtijiaoEntity> wrapper) {
		  Page<ShenqingtijiaoView> page =new Query<ShenqingtijiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShenqingtijiaoVO> selectListVO(Wrapper<ShenqingtijiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShenqingtijiaoVO selectVO(Wrapper<ShenqingtijiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShenqingtijiaoView> selectListView(Wrapper<ShenqingtijiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenqingtijiaoView selectView(Wrapper<ShenqingtijiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
