package com.entity.view;

import com.entity.LoudongxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 楼栋信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-07 16:34:51
 */
@TableName("loudongxinxi")
public class LoudongxinxiView  extends LoudongxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LoudongxinxiView(){
	}
 
 	public LoudongxinxiView(LoudongxinxiEntity loudongxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, loudongxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
