/**
* @Company 青鸟软通   
* @Title: RegRateVerDomain.java 
* @Package com.haier.isales.performance.leaguer.registrate.domain 
* @author Guo Yuchao   
* @date 2014年12月22日  13:57:03 
* @version V1.0   
*/ 
package com.haier.isales.performance.leaguer.registrate.domain;

import java.io.Serializable;

/** 
 * @ClassName: RegRateVerDomain 
 * t_zzjyt_card_set_rate 自动生成的对应的实体对象   
 *  
 */
public class RegRateVerDomain implements Serializable{
	private static final long serialVersionUID = -1419227823466L;

	private Long id;		//本系统中表的主键，无意义。同步数据时对方数据库中没有对应的字段

	private String month;		// 月份

	private String orgId;		//中心

	private String orgName;		//工贸名称

	private String shopId;		//门店

	private String shopName;		//门店名称

	private String productLineId;		//产品线
	
	private String productLineName;		//旧产品线名称

	private java.math.BigDecimal counts;		//销量（已验证）

	private java.math.BigDecimal registQty;		//注册量

	private java.math.BigDecimal registRate;		// 注册率

	private String remark;		// 备注,本系统中添加的字段，预留以存储一些信息。在同步数据时对方数据库中没有对应的字段	
	
	/*=========================getter and setter ===================*/
	/**
	 * 属性 id 的get方法 
	 * @return id
	 */
	public Long getId() {
		return this.id;
	}
	/**
	 * 属性 id 的set方法 
	 * @param id 
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 属性 month 的get方法 
	 * @return id
	 */
	public String getMonth() {
		return this.month;
	}
	/**
	 * 属性 month 的set方法 
	 * @param id 
	 */
	public void setMonth(String month) {
		this.month = month;
	}
	/**
	 * 属性 orgId 的get方法 
	 * @return id
	 */
	public String getOrgId() {
		return this.orgId;
	}
	/**
	 * 属性 orgId 的set方法 
	 * @param id 
	 */
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	/**
	 * 属性 orgName 的get方法 
	 * @return id
	 */
	public String getOrgName() {
		return this.orgName;
	}
	/**
	 * 属性 orgName 的set方法 
	 * @param id 
	 */
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	/**
	 * 属性 shopId 的get方法 
	 * @return id
	 */
	public String getShopId() {
		return this.shopId;
	}
	/**
	 * 属性 shopId 的set方法 
	 * @param id 
	 */
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	/**
	 * 属性 shopName 的get方法 
	 * @return id
	 */
	public String getShopName() {
		return this.shopName;
	}
	/**
	 * 属性 shopName 的set方法 
	 * @param id 
	 */
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	/**
	 * 属性 productLineId 的get方法 
	 * @return id
	 */
	public String getProductLineId() {
		return this.productLineId;
	}
	/**
	 * 属性 productLineId 的set方法 
	 * @param id 
	 */
	public void setProductLineId(String productLineId) {
		this.productLineId = productLineId;
	}
	/**
	 * 属性 productLineName 的get方法 
	 * @return id
	 */
	public String getProductLineName() {
		return this.productLineName;
	}
	/**
	 * 属性 productLineName 的set方法 
	 * @param id 
	 */
	public void setProductLineName(String productLineName) {
		this.productLineName = productLineName;
	}
	/**
	 * 属性 counts 的get方法 
	 * @return id
	 */
	public java.math.BigDecimal getCounts() {
		return this.counts;
	}
	/**
	 * 属性 counts 的set方法 
	 * @param id 
	 */
	public void setCounts(java.math.BigDecimal counts) {
		this.counts = counts;
	}
	/**
	 * 属性 registQty 的get方法 
	 * @return id
	 */
	public java.math.BigDecimal getRegistQty() {
		return this.registQty;
	}
	/**
	 * 属性 registQty 的set方法 
	 * @param id 
	 */
	public void setRegistQty(java.math.BigDecimal registQty) {
		this.registQty = registQty;
	}
	/**
	 * 属性 registRate 的get方法 
	 * @return id
	 */
	public java.math.BigDecimal getRegistRate() {
		return this.registRate;
	}
	/**
	 * 属性 registRate 的set方法 
	 * @param id 
	 */
	public void setRegistRate(java.math.BigDecimal registRate) {
		this.registRate = registRate;
	}
	/**
	 * 属性 remark 的get方法 
	 * @return id
	 */
	public String getRemark() {
		return this.remark;
	}
	/**
	 * 属性 remark 的set方法 
	 * @param id 
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/*====================hashCode and equals ====================*/
	/**
	* <p>Description: RegRateVerDomain 自动生成的hashcode方法</p> 
	* @author Guo Yuchao   
	* @date 2014年12月22日  13:57:03
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result+ ((id == null) ? 0 : id.hashCode());
		return result;
	}
	/**
	* <p>Description:RegRateVerDomain 自动生成的equals方法 </p> 
	* @author Guo Yuchao   
	* @date 2014年12月22日  13:57:03
	* @param obj
	* @return 
	* @see java.lang.Object#equals(java.lang.Object) 
	*/ 
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		RegRateVerDomain other =(RegRateVerDomain) obj;
		/*修改代码违规，原语句存在空指针情况,原语句如下：
		if (id == null) {if (other.id != null){ return false;} else if (!id.equals(other.id)){ return false;}}
		*/
		if (id == null) {
			if (other.id != null){ 
				return false;
			}
		}else if (!id.equals(other.id)){
				return false;
		}
		return true;
	}
		
	/*==================== toString() ====================*/
	/**
	* <p>Description:RegRateVerDomain 自动生成的toString方法 </p> 
	* @author Guo Yuchao   
	* @date 2014年12月22日  13:57:03 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "RegRateVerDomain [" +
					"id=" + id + "," + 
					"month=" + month + "," + 
					"orgId=" + orgId + "," + 
					"orgName=" + orgName + "," + 
					"shopId=" + shopId + "," + 
					"shopName=" + shopName + "," + 
					"productLineId=" + productLineId + "," + 
					"productLineName=" + productLineName + "," + 
					"counts=" + counts + "," + 
					"registQty=" + registQty + "," + 
					"registRate=" + registRate + "," + 
					"remark=" + remark + "," + 
				"]";
	}
}
