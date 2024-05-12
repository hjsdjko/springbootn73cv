package com.entity.model;

import com.entity.LoudongxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 楼栋信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-07 16:34:51
 */
public class LoudongxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 楼栋名称
	 */
	
	private String loudongmingcheng;
		
	/**
	 * 位置
	 */
	
	private String weizhi;
		
	/**
	 * 宿舍数量
	 */
	
	private Integer susheshuliang;
		
	/**
	 * 床位数量
	 */
	
	private Integer chuangweishuliang;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 宿管账号
	 */
	
	private String suguanzhanghao;
		
	/**
	 * 宿管姓名
	 */
	
	private String suguanxingming;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 安排时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date anpaishijian;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：楼栋名称
	 */
	 
	public void setLoudongmingcheng(String loudongmingcheng) {
		this.loudongmingcheng = loudongmingcheng;
	}
	
	/**
	 * 获取：楼栋名称
	 */
	public String getLoudongmingcheng() {
		return loudongmingcheng;
	}
				
	
	/**
	 * 设置：位置
	 */
	 
	public void setWeizhi(String weizhi) {
		this.weizhi = weizhi;
	}
	
	/**
	 * 获取：位置
	 */
	public String getWeizhi() {
		return weizhi;
	}
				
	
	/**
	 * 设置：宿舍数量
	 */
	 
	public void setSusheshuliang(Integer susheshuliang) {
		this.susheshuliang = susheshuliang;
	}
	
	/**
	 * 获取：宿舍数量
	 */
	public Integer getSusheshuliang() {
		return susheshuliang;
	}
				
	
	/**
	 * 设置：床位数量
	 */
	 
	public void setChuangweishuliang(Integer chuangweishuliang) {
		this.chuangweishuliang = chuangweishuliang;
	}
	
	/**
	 * 获取：床位数量
	 */
	public Integer getChuangweishuliang() {
		return chuangweishuliang;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：宿管账号
	 */
	 
	public void setSuguanzhanghao(String suguanzhanghao) {
		this.suguanzhanghao = suguanzhanghao;
	}
	
	/**
	 * 获取：宿管账号
	 */
	public String getSuguanzhanghao() {
		return suguanzhanghao;
	}
				
	
	/**
	 * 设置：宿管姓名
	 */
	 
	public void setSuguanxingming(String suguanxingming) {
		this.suguanxingming = suguanxingming;
	}
	
	/**
	 * 获取：宿管姓名
	 */
	public String getSuguanxingming() {
		return suguanxingming;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：安排时间
	 */
	 
	public void setAnpaishijian(Date anpaishijian) {
		this.anpaishijian = anpaishijian;
	}
	
	/**
	 * 获取：安排时间
	 */
	public Date getAnpaishijian() {
		return anpaishijian;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
