package com.entity.view;

import com.entity.ZaisuqingkuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 在宿情况
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-07 16:34:51
 */
@TableName("zaisuqingkuang")
public class ZaisuqingkuangView  extends ZaisuqingkuangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZaisuqingkuangView(){
	}
 
 	public ZaisuqingkuangView(ZaisuqingkuangEntity zaisuqingkuangEntity){
 	try {
			BeanUtils.copyProperties(this, zaisuqingkuangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
