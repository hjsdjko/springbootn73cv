package com.entity.view;

import com.entity.SushegonggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 宿舍公告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-07 16:34:51
 */
@TableName("sushegonggao")
public class SushegonggaoView  extends SushegonggaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SushegonggaoView(){
	}
 
 	public SushegonggaoView(SushegonggaoEntity sushegonggaoEntity){
 	try {
			BeanUtils.copyProperties(this, sushegonggaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
