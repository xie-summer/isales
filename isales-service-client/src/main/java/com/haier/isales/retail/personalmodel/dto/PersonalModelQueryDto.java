/**
* @Company 青鸟软通   
* @Title: PersonalModelQueryDto.java 
* @Package com.haier.isales.retail.personalmodel 
* @author Cao Rui   
* @date 2014-12-3 上午11:03:09 
* @version V1.0   
*/ 
package com.haier.isales.retail.personalmodel.dto;

import java.io.Serializable;

/** 
 * @ClassName: PersonalModelQueryDto 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class PersonalModelQueryDto implements Serializable{

	private static final long serialVersionUID = -1417575363197L;

	/** 
	* @Fields id : 主键
	*/
	private Long id;
	/** 
	* @Fields modelCode : 产品型号编码
	*/
	private String modelCode;
	/** 
	* @Fields modelName : 产品型号名称
	*/
	private String modelName;
	/** 
	* @Fields operatorId : 用户id
	*/
	private Long operatorId;
	/** 
	* @Fields userCode : 对应员工号
	*/
	private String userCode;
	/** 
	* @Fields userName : 用户姓名
	*/
	private String userName;
	
	/*=========================getter and setter ===================*/
	/**
	 * @Description: 属性 id 的get方法 
	 * @return id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @Description: 属性 id 的set方法 
	 * @param id 
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @Description: 属性 modelCode 的get方法 
	 * @return modelCode
	 */
	public String getModelCode() {
		return modelCode;
	}
	/**
	 * @Description: 属性 modelCode 的set方法 
	 * @param modelCode 
	 */
	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
	}
	/**
	 * @Description: 属性 modelName 的get方法 
	 * @return modelName
	 */
	public String getModelName() {
		return modelName;
	}
	/**
	 * @Description: 属性 modelName 的set方法 
	 * @param modelName 
	 */
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	/**
	 * @Description: 属性 operatorId 的get方法 
	 * @return operatorId
	 */
	public Long getOperatorId() {
		return operatorId;
	}
	/**
	 * @Description: 属性 operatorId 的set方法 
	 * @param operatorId 
	 */
	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}
	/**
	 * @Description: 属性 userCode 的get方法 
	 * @return userCode
	 */
	public String getUserCode() {
		return userCode;
	}
	/**
	 * @Description: 属性 userCode 的set方法 
	 * @param userCode 
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	/**
	 * @Description: 属性 userName 的get方法 
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @Description: 属性 userName 的set方法 
	 * @param userName 
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	/*=================toString=================*/
	/**
	* <p>Description: PersonalModelQueryDto自动生成的toString方法</p> 
	* @author Guo Yuchao   
	* @date 2015-1-7 下午7:09:47 
	* @return 
	* @see java.lang.Object#toString() 
	*/ 
	@Override
	public String toString() {
		return "PersonalModelQueryDto [id=" + id + ", modelCode=" + modelCode
				+ ", modelName=" + modelName + ", operatorId=" + operatorId
				+ ", userCode=" + userCode + ", userName=" + userName + "]";
	}
}
