package com.entity.view;

import com.entity.XueshengbaoxiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学生报修
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-07 16:34:51
 */
@TableName("xueshengbaoxiu")
public class XueshengbaoxiuView  extends XueshengbaoxiuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XueshengbaoxiuView(){
	}
 
 	public XueshengbaoxiuView(XueshengbaoxiuEntity xueshengbaoxiuEntity){
 	try {
			BeanUtils.copyProperties(this, xueshengbaoxiuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
