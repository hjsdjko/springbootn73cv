package com.entity.view;

import com.entity.WeiguiqinshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 未归寝室
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-07 16:34:51
 */
@TableName("weiguiqinshi")
public class WeiguiqinshiView  extends WeiguiqinshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WeiguiqinshiView(){
	}
 
 	public WeiguiqinshiView(WeiguiqinshiEntity weiguiqinshiEntity){
 	try {
			BeanUtils.copyProperties(this, weiguiqinshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
