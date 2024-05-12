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
 * 楼栋信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-07 16:34:51
 */
@TableName("loudongxinxi")
public class LoudongxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public LoudongxinxiEntity() {
		
	}
	
	public LoudongxinxiEntity(T t) {
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date anpaishijian;
	
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
