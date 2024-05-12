package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 楼栋统计
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-07 16:34:51
 */
@TableName("loudongtongji")
public class LoudongtongjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LoudongtongjiEntity() {
		
	}
	
	public LoudongtongjiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 楼栋编号
	 */
					
	private String loudongbianhao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date dengjiriqi;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：楼栋编号
	 */
	public void setLoudongbianhao(String loudongbianhao) {
		this.loudongbianhao = loudongbianhao;
	}
	/**
	 * 获取：楼栋编号
	 */
	public String getLoudongbianhao() {
		return loudongbianhao;
	}
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
