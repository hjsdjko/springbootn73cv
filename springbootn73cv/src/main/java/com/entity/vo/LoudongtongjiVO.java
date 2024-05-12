package com.entity.vo;

import com.entity.LoudongtongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 楼栋统计
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-07 16:34:51
 */
public class LoudongtongjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 楼栋名称
	 */
	
	private String loudongmingcheng;
		
	/**
	 * 在用宿舍
	 */
	
	private Integer zaiyongsushe;
		
	/**
	 * 空闲宿舍
	 */
	
	private Integer kongxiansushe;
		
	/**
	 * 床位数量
	 */
	
	private Integer chuangweishuliang;
		
	/**
	 * 空闲床位数
	 */
	
	private Integer kongxianchuangweishu;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
		
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
	 * 设置：在用宿舍
	 */
	 
	public void setZaiyongsushe(Integer zaiyongsushe) {
		this.zaiyongsushe = zaiyongsushe;
	}
	
	/**
	 * 获取：在用宿舍
	 */
	public Integer getZaiyongsushe() {
		return zaiyongsushe;
	}
				
	
	/**
	 * 设置：空闲宿舍
	 */
	 
	public void setKongxiansushe(Integer kongxiansushe) {
		this.kongxiansushe = kongxiansushe;
	}
	
	/**
	 * 获取：空闲宿舍
	 */
	public Integer getKongxiansushe() {
		return kongxiansushe;
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
	 * 设置：空闲床位数
	 */
	 
	public void setKongxianchuangweishu(Integer kongxianchuangweishu) {
		this.kongxianchuangweishu = kongxianchuangweishu;
	}
	
	/**
	 * 获取：空闲床位数
	 */
	public Integer getKongxianchuangweishu() {
		return kongxianchuangweishu;
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
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
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
