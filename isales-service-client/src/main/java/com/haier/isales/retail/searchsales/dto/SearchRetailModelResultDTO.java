/**
* @Company 青鸟软通   
* @Title: SearchRetailModelResultDTO.java 
* @Package com.haier.isales.retail.searchsales.dto 
* @author John zhao   
* @date 2015-3-12 上午10:27:35 
* @version V1.0   
*/ 
package com.haier.isales.retail.searchsales.dto;

import java.io.Serializable;

/** 
 * @ClassName: SearchRetailModelResultDTO 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 *  
 */
public class SearchRetailModelResultDTO  implements Serializable {

	/** 
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	*/ 
	private static final long serialVersionUID = 6080025981170710441L;
	
	private String categoryName;
    private String counts;
    private String fpnum;
    private String fzxId;
    private String fzxName;
    private String gjtime;
    private String hishfresult;
    private String ismember;
    private String isyj;
    private String lrfs;
    private String mdId;
    private String mdName;
    private String newprice;
    private String nfxg;
    private String present;
    private String price;
    private String product;
    private String productType;
    private String productline;
    private String sflr;
    private String shaddress;
    private String sjcjlsId;
    private String status;
    private String updatetime;
    private String ygId;
    private String ygName;
    private String yhname;
    private String yhphone;
    // 2015-7-22 添加是否套餐、套餐发起人
    private String istc;
    private String tcfqr;
    private int pageCount;
    // 添加省市区属性  added by lizhenwei 2015-12-17
    private String province;
    private String provinceCode;
    private String city;
    private String cityCode;
    private String area;
    private String areaCode;
    
    /*================getters & setters==================*/
	/**
	 * @Description: 属性 istc 的get方法 
	 * @return istc
	 */
	public String getIstc() {
		return istc;
	}
	/**
	 * @Description: 属性 istc 的set方法 
	 * @param istc 
	 */
	public void setIstc(String istc) {
		this.istc = istc;
	}
	/**
	 * @Description: 属性 tcfqr 的get方法 
	 * @return tcfqr
	 */
	public String getTcfqr() {
		return tcfqr;
	}
	/**
	 * @Description: 属性 tcfqr 的set方法 
	 * @param tcfqr 
	 */
	public void setTcfqr(String tcfqr) {
		this.tcfqr = tcfqr;
	}
	/**
	 * @Description: 属性 categoryName 的get方法 
	 * @return categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}
	/**
	 * @Description: 属性 categoryName 的set方法 
	 * @param categoryName 
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	/**
	 * @Description: 属性 counts 的get方法 
	 * @return counts
	 */
	public String getCounts() {
		return counts;
	}
	/**
	 * @Description: 属性 counts 的set方法 
	 * @param counts 
	 */
	public void setCounts(String counts) {
		this.counts = counts;
	}
	/**
	 * @Description: 属性 fpnum 的get方法 
	 * @return fpnum
	 */
	public String getFpnum() {
		return fpnum;
	}
	/**
	 * @Description: 属性 fpnum 的set方法 
	 * @param fpnum 
	 */
	public void setFpnum(String fpnum) {
		this.fpnum = fpnum;
	}
	/**
	 * @Description: 属性 fzxId 的get方法 
	 * @return fzxId
	 */
	public String getFzxId() {
		return fzxId;
	}
	/**
	 * @Description: 属性 fzxId 的set方法 
	 * @param fzxId 
	 */
	public void setFzxId(String fzxId) {
		this.fzxId = fzxId;
	}
	/**
	 * @Description: 属性 fzxName 的get方法 
	 * @return fzxName
	 */
	public String getFzxName() {
		return fzxName;
	}
	/**
	 * @Description: 属性 fzxName 的set方法 
	 * @param fzxName 
	 */
	public void setFzxName(String fzxName) {
		this.fzxName = fzxName;
	}
	/**
	 * @Description: 属性 gjtime 的get方法 
	 * @return gjtime
	 */
	public String getGjtime() {
		return gjtime;
	}
	/**
	 * @Description: 属性 gjtime 的set方法 
	 * @param gjtime 
	 */
	public void setGjtime(String gjtime) {
		this.gjtime = gjtime;
	}
	/**
	 * @Description: 属性 hishfresult 的get方法 
	 * @return hishfresult
	 */
	public String getHishfresult() {
		return hishfresult;
	}
	/**
	 * @Description: 属性 hishfresult 的set方法 
	 * @param hishfresult 
	 */
	public void setHishfresult(String hishfresult) {
		this.hishfresult = hishfresult;
	}
	/**
	 * @Description: 属性 ismember 的get方法 
	 * @return ismember
	 */
	public String getIsmember() {
		return ismember;
	}
	/**
	 * @Description: 属性 ismember 的set方法 
	 * @param ismember 
	 */
	public void setIsmember(String ismember) {
		this.ismember = ismember;
	}
	/**
	 * @Description: 属性 isyj 的get方法 
	 * @return isyj
	 */
	public String getIsyj() {
		return isyj;
	}
	/**
	 * @Description: 属性 isyj 的set方法 
	 * @param isyj 
	 */
	public void setIsyj(String isyj) {
		this.isyj = isyj;
	}
	/**
	 * @Description: 属性 lrfs 的get方法 
	 * @return lrfs
	 */
	public String getLrfs() {
		return lrfs;
	}
	/**
	 * @Description: 属性 lrfs 的set方法 
	 * @param lrfs 
	 */
	public void setLrfs(String lrfs) {
		this.lrfs = lrfs;
	}
	/**
	 * @Description: 属性 mdId 的get方法 
	 * @return mdId
	 */
	public String getMdId() {
		return mdId;
	}
	/**
	 * @Description: 属性 mdId 的set方法 
	 * @param mdId 
	 */
	public void setMdId(String mdId) {
		this.mdId = mdId;
	}
	/**
	 * @Description: 属性 mdName 的get方法 
	 * @return mdName
	 */
	public String getMdName() {
		return mdName;
	}
	/**
	 * @Description: 属性 mdName 的set方法 
	 * @param mdName 
	 */
	public void setMdName(String mdName) {
		this.mdName = mdName;
	}
	/**
	 * @Description: 属性 newprice 的get方法 
	 * @return newprice
	 */
	public String getNewprice() {
		return newprice;
	}
	/**
	 * @Description: 属性 newprice 的set方法 
	 * @param newprice 
	 */
	public void setNewprice(String newprice) {
		this.newprice = newprice;
	}
	/**
	 * @Description: 属性 nfxg 的get方法 
	 * @return nfxg
	 */
	public String getNfxg() {
		return nfxg;
	}
	/**
	 * @Description: 属性 nfxg 的set方法 
	 * @param nfxg 
	 */
	public void setNfxg(String nfxg) {
		this.nfxg = nfxg;
	}
	/**
	 * @Description: 属性 present 的get方法 
	 * @return present
	 */
	public String getPresent() {
		return present;
	}
	/**
	 * @Description: 属性 present 的set方法 
	 * @param present 
	 */
	public void setPresent(String present) {
		this.present = present;
	}
	/**
	 * @Description: 属性 price 的get方法 
	 * @return price
	 */
	public String getPrice() {
		return price;
	}
	/**
	 * @Description: 属性 price 的set方法 
	 * @param price 
	 */
	public void setPrice(String price) {
		this.price = price;
	}
	/**
	 * @Description: 属性 product 的get方法 
	 * @return product
	 */
	public String getProduct() {
		return product;
	}
	/**
	 * @Description: 属性 product 的set方法 
	 * @param product 
	 */
	public void setProduct(String product) {
		this.product = product;
	}
	/**
	 * @Description: 属性 productType 的get方法 
	 * @return productType
	 */
	public String getProductType() {
		return productType;
	}
	/**
	 * @Description: 属性 productType 的set方法 
	 * @param productType 
	 */
	public void setProductType(String productType) {
		this.productType = productType;
	}
	/**
	 * @Description: 属性 productline 的get方法 
	 * @return productline
	 */
	public String getProductline() {
		return productline;
	}
	/**
	 * @Description: 属性 productline 的set方法 
	 * @param productline 
	 */
	public void setProductline(String productline) {
		this.productline = productline;
	}
	/**
	 * @Description: 属性 sflr 的get方法 
	 * @return sflr
	 */
	public String getSflr() {
		return sflr;
	}
	/**
	 * @Description: 属性 sflr 的set方法 
	 * @param sflr 
	 */
	public void setSflr(String sflr) {
		this.sflr = sflr;
	}
	/**
	 * @Description: 属性 shaddress 的get方法 
	 * @return shaddress
	 */
	public String getShaddress() {
		return shaddress;
	}
	/**
	 * @Description: 属性 shaddress 的set方法 
	 * @param shaddress 
	 */
	public void setShaddress(String shaddress) {
		this.shaddress = shaddress;
	}
	/**
	 * @Description: 属性 sjcjlsId 的get方法 
	 * @return sjcjlsId
	 */
	public String getSjcjlsId() {
		return sjcjlsId;
	}
	/**
	 * @Description: 属性 sjcjlsId 的set方法 
	 * @param sjcjlsId 
	 */
	public void setSjcjlsId(String sjcjlsId) {
		this.sjcjlsId = sjcjlsId;
	}
	/**
	 * @Description: 属性 status 的get方法 
	 * @return status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @Description: 属性 status 的set方法 
	 * @param status 
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @Description: 属性 updatetime 的get方法 
	 * @return updatetime
	 */
	public String getUpdatetime() {
		return updatetime;
	}
	/**
	 * @Description: 属性 updatetime 的set方法 
	 * @param updatetime 
	 */
	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}
	/**
	 * @Description: 属性 ygId 的get方法 
	 * @return ygId
	 */
	public String getYgId() {
		return ygId;
	}
	/**
	 * @Description: 属性 ygId 的set方法 
	 * @param ygId 
	 */
	public void setYgId(String ygId) {
		this.ygId = ygId;
	}
	/**
	 * @Description: 属性 ygName 的get方法 
	 * @return ygName
	 */
	public String getYgName() {
		return ygName;
	}
	/**
	 * @Description: 属性 ygName 的set方法 
	 * @param ygName 
	 */
	public void setYgName(String ygName) {
		this.ygName = ygName;
	}
	/**
	 * @Description: 属性 yhname 的get方法 
	 * @return yhname
	 */
	public String getYhname() {
		return yhname;
	}
	/**
	 * @Description: 属性 yhname 的set方法 
	 * @param yhname 
	 */
	public void setYhname(String yhname) {
		this.yhname = yhname;
	}
	/**
	 * @Description: 属性 yhphone 的get方法 
	 * @return yhphone
	 */
	public String getYhphone() {
		return yhphone;
	}
	/**
	 * @Description: 属性 yhphone 的set方法 
	 * @param yhphone 
	 */
	public void setYhphone(String yhphone) {
		this.yhphone = yhphone;
	}
	/**
	 * @Description: 属性 pageCount 的get方法 
	 * @return pageCount
	 */
	public int getPageCount() {
		return pageCount;
	}
	/**
	 * @Description: 属性 pageCount 的set方法 
	 * @param pageCount 
	 */
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * @param province the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * @return the provinceCode
	 */
	public String getProvinceCode() {
		return provinceCode;
	}
	/**
	 * @param provinceCode the provinceCode to set
	 */
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	/**
	 * @return the cityCode
	 */
	public String getCityCode() {
		return cityCode;
	}
	/**
	 * @param cityCode the cityCode to set
	 */
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	/**
	 * @return the areaCode
	 */
	public String getAreaCode() {
		return areaCode;
	}
	/**
	 * @param areaCode the areaCode to set
	 */
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}
	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}
}
