/**
* @Company 青鸟软通   
* @Title: SysUserCollectDomain.java 
* @Package com.haier.isales.app.domain 
* @author lizhenwei   
* @date 2016年04月22日  14:32:17 
* @version V1.0   
*/ 
package com.haier.isales.app.domain;

import java.io.Serializable;

/** 
 * @ClassName: SysUserCollectDomain 
 * @Description: t_sys_user_collect 自动生成的对应的实体对象   
 *  
 */
public class SysUserCollectDomain implements Serializable{
	private static final long serialVersionUID = -1461306737744L;

	/** 
	* @Fields collectId : 主键ID，自动递增，无实际意义
	*/
	private Long collectId;
	/** 
	* @Fields userCode : 员工工号
	*/
	private String userCode;
	/** 
	* @Fields collectUserCode : 收藏员工工号
	*/
	private String collectUserCode;
	/** 
	* @Fields refStatus : 关联状态
	*/
	private String refStatus;
	/** 
	* @Fields createTime : 创建时间
	*/
	private java.util.Date createTime;
	/** 
	* @Fields updateTime : 修改时间
	*/
	private java.util.Date updateTime;
		
	
	/*=========================getter and setter ===================*/
	
	/**
	 * @Description: 属性 collectId 的get方法 
	 * @return id
	 */
	public Long getCollectId() {
		return this.collectId;
	}
	/**
	 * @Description: 属性 collectId 的set方法 
	 * @param id 
	 */
	public void setCollectId(Long collectId) {
		this.collectId = collectId;
	}
	/**
	 * @Description: 属性 userCode 的get方法 
	 * @return id
	 */
	public String getUserCode() {
		return this.userCode;
	}
	/**
	 * @Description: 属性 userCode 的set方法 
	 * @param id 
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	/**
	 * @Description: 属性 collectUserCode 的get方法 
	 * @return id
	 */
	public String getCollectUserCode() {
		return this.collectUserCode;
	}
	/**
	 * @Description: 属性 collectUserCode 的set方法 
	 * @param id 
	 */
	public void setCollectUserCode(String collectUserCode) {
		this.collectUserCode = collectUserCode;
	}
	/**
	 * @Description: 属性 refStatus 的get方法 
	 * @return id
	 */
	public String getRefStatus() {
		return this.refStatus;
	}
	/**
	 * @Description: 属性 refStatus 的set方法 
	 * @param id 
	 */
	public void setRefStatus(String refStatus) {
		this.refStatus = refStatus;
	}
	/**
	 * @Description: 属性 createTime 的get方法 
	 * @return id
	 */
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	/**
	 * @Description: 属性 createTime 的set方法 
	 * @param id 
	 */
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * @Description: 属性 updateTime 的get方法 
	 * @return id
	 */
	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}
	/**
	 * @Description: 属性 updateTime 的set方法 
	 * @param id 
	 */
	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}
		
	
		
	
	/*====================hashCode and equals ====================*/
/**
	* <p>Description: SysUserCollectDomain 自动生成的hashcode方法</p> 
	* @author lizhenwei   
	* @date 2016年04月22日  14:32:17
	* @return 
	* @see java.lang.Object#hashCode() 
	*/ 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result+ ((collectId == null) ? 0 : collectId.hashCode());
		return result;
	}
	/**
	* <p>Description:SysUserCollectDomain 自动生成的equals方法 </p> 
	* @author lizhenwei   
	* @date 2016年04月22日  14:32:17
	* @param obj
	* @return 
	* @see java.lang.Object#equals(java.lang.Object) 
	*/ 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SysUserCollectDomain other =(SysUserCollectDomain) obj;
		if (collectId == null) {if (other.collectId != null){ return false;} else if (!collectId.equals(other.collectId)){ return false;}}
		return true;
	}
		
	/*==================== toString() ====================*/
	/**
	* <p>Description:SysUserCollectDomain 自动生成的toString方法 </p> 
	* @author lizhenwei   
	* @date 2016年04月22日  14:32:17 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "SysUserCollectDomain [" +
					"collectId=" + collectId + "," + 
					"userCode=" + userCode + "," + 
					"collectUserCode=" + collectUserCode + "," + 
					"refStatus=" + refStatus + "," + 
					"createTime=" + createTime + "," + 
					"updateTime=" + updateTime + "," + 
				"]";
	}
	
	
}
