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


import com.dao.ZaisuqingkuangDao;
import com.entity.ZaisuqingkuangEntity;
import com.service.ZaisuqingkuangService;
import com.entity.vo.ZaisuqingkuangVO;
import com.entity.view.ZaisuqingkuangView;

@Service("zaisuqingkuangService")
public class ZaisuqingkuangServiceImpl extends ServiceImpl<ZaisuqingkuangDao, ZaisuqingkuangEntity> implements ZaisuqingkuangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZaisuqingkuangEntity> page = this.selectPage(
                new Query<ZaisuqingkuangEntity>(params).getPage(),
                new EntityWrapper<ZaisuqingkuangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZaisuqingkuangEntity> wrapper) {
		  Page<ZaisuqingkuangView> page =new Query<ZaisuqingkuangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZaisuqingkuangVO> selectListVO(Wrapper<ZaisuqingkuangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZaisuqingkuangVO selectVO(Wrapper<ZaisuqingkuangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZaisuqingkuangView> selectListView(Wrapper<ZaisuqingkuangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZaisuqingkuangView selectView(Wrapper<ZaisuqingkuangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
