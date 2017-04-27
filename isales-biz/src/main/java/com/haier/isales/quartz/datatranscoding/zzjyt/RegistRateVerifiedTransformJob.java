/**
 * @Company 青鸟软通   
 * @Title: RegistRateVerifiedTransformJob.java 
 * @Package com.haier.isales.quartz.datatranscoding 
 * @author GuoYuchao  
 * @date 2014年12月15日14:38:22
 * @version V1.0   
 */
package com.haier.isales.quartz.datatranscoding.zzjyt;

import org.bana.common.util.etl.SimpleTransform;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.haier.isales.common.SpringApplicationContextHolder;

/**
 * @ClassName: RegistRateVerifiedTransformJob
 * @Description:会员注册率（已验证）
 * 
 */
public class RegistRateVerifiedTransformJob implements Job {

	private static final Logger LOG = LoggerFactory.getLogger(RegistRateVerifiedTransformJob.class);

	/**
	 * @Fields cardSetRateTransform : 会员注册率（已验证）信息同步转换
	 */
	private SimpleTransform registRateVerifiedTransform;

	/**
	 * <p>
	 * Description: 
	 * </p>
	 * 
	 * @author GuoYuchao
	 * @date 2014-12-15 14:39:27
	 * @param context
	 * @throws JobExecutionException
	 * @see org.quartz.Job#execute(org.quartz.JobExecutionContext)
	 */
	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		LOG.info("执行会员注册率（已验证）信息同步转换开始！");
		registRateVerifiedTransform = SpringApplicationContextHolder.getBean("registRateVerifiedTransform");
		try {
			registRateVerifiedTransform.execute();
			LOG.info("执行会员注册率（已验证）信息同步转换结束！");
		} catch (Exception e) {
			LOG.warn("执行会员注册率（已验证）信息同步转换失败！",new Throwable(e));
		}
	}

	/**
	 * @Description: 属性 registRateVerifiedTransform 的set方法 
	 * @param registRateVerifiedTransform 
	 */
	public void setRegistRateVerifiedTransform(
			SimpleTransform registRateVerifiedTransform) {
		this.registRateVerifiedTransform = registRateVerifiedTransform;
	}



}
