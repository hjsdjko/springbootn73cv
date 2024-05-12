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


import com.dao.LianxihouqinDao;
import com.entity.LianxihouqinEntity;
import com.service.LianxihouqinService;
import com.entity.vo.LianxihouqinVO;
import com.entity.view.LianxihouqinView;

@Service("lianxihouqinService")
public class LianxihouqinServiceImpl extends ServiceImpl<LianxihouqinDao, LianxihouqinEntity> implements LianxihouqinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LianxihouqinEntity> page = this.selectPage(
                new Query<LianxihouqinEntity>(params).getPage(),
                new EntityWrapper<LianxihouqinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LianxihouqinEntity> wrapper) {
		  Page<LianxihouqinView> page =new Query<LianxihouqinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LianxihouqinVO> selectListVO(Wrapper<LianxihouqinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LianxihouqinVO selectVO(Wrapper<LianxihouqinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LianxihouqinView> selectListView(Wrapper<LianxihouqinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LianxihouqinView selectView(Wrapper<LianxihouqinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
