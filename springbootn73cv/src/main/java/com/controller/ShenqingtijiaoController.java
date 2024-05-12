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

import com.entity.ShenqingtijiaoEntity;
import com.entity.view.ShenqingtijiaoView;

import com.service.ShenqingtijiaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 申请提交
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-07 16:34:51
 */
@RestController
@RequestMapping("/shenqingtijiao")
public class ShenqingtijiaoController {
    @Autowired
    private ShenqingtijiaoService shenqingtijiaoService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShenqingtijiaoEntity shenqingtijiao,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			shenqingtijiao.setXuehao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("suguan")) {
			shenqingtijiao.setSuguanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShenqingtijiaoEntity> ew = new EntityWrapper<ShenqingtijiaoEntity>();
		PageUtils page = shenqingtijiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shenqingtijiao), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShenqingtijiaoEntity shenqingtijiao, 
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			shenqingtijiao.setXuehao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("suguan")) {
			shenqingtijiao.setSuguanzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShenqingtijiaoEntity> ew = new EntityWrapper<ShenqingtijiaoEntity>();
		PageUtils page = shenqingtijiaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shenqingtijiao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShenqingtijiaoEntity shenqingtijiao){
       	EntityWrapper<ShenqingtijiaoEntity> ew = new EntityWrapper<ShenqingtijiaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shenqingtijiao, "shenqingtijiao")); 
        return R.ok().put("data", shenqingtijiaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShenqingtijiaoEntity shenqingtijiao){
        EntityWrapper< ShenqingtijiaoEntity> ew = new EntityWrapper< ShenqingtijiaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shenqingtijiao, "shenqingtijiao")); 
		ShenqingtijiaoView shenqingtijiaoView =  shenqingtijiaoService.selectView(ew);
		return R.ok("查询申请提交成功").put("data", shenqingtijiaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShenqingtijiaoEntity shenqingtijiao = shenqingtijiaoService.selectById(id);
        return R.ok().put("data", shenqingtijiao);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShenqingtijiaoEntity shenqingtijiao = shenqingtijiaoService.selectById(id);
        return R.ok().put("data", shenqingtijiao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShenqingtijiaoEntity shenqingtijiao, HttpServletRequest request){
    	shenqingtijiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shenqingtijiao);
        shenqingtijiaoService.insert(shenqingtijiao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShenqingtijiaoEntity shenqingtijiao, HttpServletRequest request){
    	shenqingtijiao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shenqingtijiao);
    	shenqingtijiao.setUserid((Long)request.getSession().getAttribute("userId"));
        shenqingtijiaoService.insert(shenqingtijiao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ShenqingtijiaoEntity shenqingtijiao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shenqingtijiao);
        shenqingtijiaoService.updateById(shenqingtijiao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shenqingtijiaoService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<ShenqingtijiaoEntity> wrapper = new EntityWrapper<ShenqingtijiaoEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("suguan")) {
			wrapper.eq("suguanzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = shenqingtijiaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
