package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.LoudongtongjiEntity;
import com.entity.view.LoudongtongjiView;

import com.service.LoudongtongjiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 楼栋统计
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-07 16:34:51
 */
@RestController
@RequestMapping("/loudongtongji")
public class LoudongtongjiController {
    @Autowired
    private LoudongtongjiService loudongtongjiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,LoudongtongjiEntity loudongtongji,
		HttpServletRequest request){
        EntityWrapper<LoudongtongjiEntity> ew = new EntityWrapper<LoudongtongjiEntity>();
		PageUtils page = loudongtongjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, loudongtongji), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,LoudongtongjiEntity loudongtongji, 
		HttpServletRequest request){
        EntityWrapper<LoudongtongjiEntity> ew = new EntityWrapper<LoudongtongjiEntity>();
		PageUtils page = loudongtongjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, loudongtongji), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( LoudongtongjiEntity loudongtongji){
       	EntityWrapper<LoudongtongjiEntity> ew = new EntityWrapper<LoudongtongjiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( loudongtongji, "loudongtongji")); 
        return R.ok().put("data", loudongtongjiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(LoudongtongjiEntity loudongtongji){
        EntityWrapper< LoudongtongjiEntity> ew = new EntityWrapper< LoudongtongjiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( loudongtongji, "loudongtongji")); 
		LoudongtongjiView loudongtongjiView =  loudongtongjiService.selectView(ew);
		return R.ok("查询楼栋统计成功").put("data", loudongtongjiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        LoudongtongjiEntity loudongtongji = loudongtongjiService.selectById(id);
        return R.ok().put("data", loudongtongji);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        LoudongtongjiEntity loudongtongji = loudongtongjiService.selectById(id);
        return R.ok().put("data", loudongtongji);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody LoudongtongjiEntity loudongtongji, HttpServletRequest request){
    	loudongtongji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(loudongtongji);
        loudongtongjiService.insert(loudongtongji);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody LoudongtongjiEntity loudongtongji, HttpServletRequest request){
    	loudongtongji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(loudongtongji);
    	loudongtongji.setUserid((Long)request.getSession().getAttribute("userId"));
        loudongtongjiService.insert(loudongtongji);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody LoudongtongjiEntity loudongtongji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(loudongtongji);
        loudongtongjiService.updateById(loudongtongji);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        loudongtongjiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<LoudongtongjiEntity> wrapper = new EntityWrapper<LoudongtongjiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = loudongtongjiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
