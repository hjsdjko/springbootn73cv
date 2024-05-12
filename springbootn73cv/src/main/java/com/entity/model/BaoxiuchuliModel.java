package com.entity.model;

import com.entity.BaoxiuchuliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 报修处理
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-07 16:34:51
 */
public class BaoxiuchuliModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 报修名称
	 */
	
	private String baoxiumingcheng;
		
	/**
	 * 故障图片
	 */
	
	private String guzhangtupian;
		
	/**
	 * 处理简述
	 */
	
	private String chulijianshu;
		
	/**
	 * 处理日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chuliriqi;
		
	/**
	 * 处理状态
	 */
	
	private String chulizhuangtai;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 宿舍号
	 */
	
	private String sushehao;
		
	/**
	 * 宿管账号
	 */
	
	private String suguanzhanghao;
		
	/**
	 * 宿管姓名
	 */
	
	private String suguanxingming;
		
	/**
	 * 后勤账号
	 */
	
	private String houqinzhanghao;
		
	/**
	 * 后勤姓名
	 */
	
	private String houqinxingming;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：报修名称
	 */
	 
	public void setBaoxiumingcheng(String baoxiumingcheng) {
		this.baoxiumingcheng = baoxiumingcheng;
	}
	
	/**
	 * 获取：报修名称
	 */
	public String getBaoxiumingcheng() {
		return baoxiumingcheng;
	}
				
	
	/**
	 * 设置：故障图片
	 */
	 
	public void setGuzhangtupian(String guzhangtupian) {
		this.guzhangtupian = guzhangtupian;
	}
	
	/**
	 * 获取：故障图片
	 */
	public String getGuzhangtupian() {
		return guzhangtupian;
	}
				
	
	/**
	 * 设置：处理简述
	 */
	 
	public void setChulijianshu(String chulijianshu) {
		this.chulijianshu = chulijianshu;
	}
	
	/**
	 * 获取：处理简述
	 */
	public String getChulijianshu() {
		return chulijianshu;
	}
				
	
	/**
	 * 设置：处理日期
	 */
	 
	public void setChuliriqi(Date chuliriqi) {
		this.chuliriqi = chuliriqi;
	}
	
	/**
	 * 获取：处理日期
	 */
	public Date getChuliriqi() {
		return chuliriqi;
	}
				
	
	/**
	 * 设置：处理状态
	 */
	 
	public void setChulizhuangtai(String chulizhuangtai) {
		this.chulizhuangtai = chulizhuangtai;
	}
	
	/**
	 * 获取：处理状态
	 */
	public String getChulizhuangtai() {
		return chulizhuangtai;
	}
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：宿舍号
	 */
	 
	public void setSushehao(String sushehao) {
		this.sushehao = sushehao;
	}
	
	/**
	 * 获取：宿舍号
	 */
	public String getSushehao() {
		return sushehao;
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
	 * 设置：后勤账号
	 */
	 
	public void setHouqinzhanghao(String houqinzhanghao) {
		this.houqinzhanghao = houqinzhanghao;
	}
	
	/**
	 * 获取：后勤账号
	 */
	public String getHouqinzhanghao() {
		return houqinzhanghao;
	}
				
	
	/**
	 * 设置：后勤姓名
	 */
	 
	public void setHouqinxingming(String houqinxingming) {
		this.houqinxingming = houqinxingming;
	}
	
	/**
	 * 获取：后勤姓名
	 */
	public String getHouqinxingming() {
		return houqinxingming;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
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
