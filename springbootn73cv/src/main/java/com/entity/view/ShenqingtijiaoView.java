package com.entity.view;

import com.entity.ShenqingtijiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 申请提交
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-07 16:34:51
 */
@TableName("shenqingtijiao")
public class ShenqingtijiaoView  extends ShenqingtijiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShenqingtijiaoView(){
	}
 
 	public ShenqingtijiaoView(ShenqingtijiaoEntity shenqingtijiaoEntity){
 	try {
			BeanUtils.copyProperties(this, shenqingtijiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
