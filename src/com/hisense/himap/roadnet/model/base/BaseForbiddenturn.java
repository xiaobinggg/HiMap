package com.hisense.himap.roadnet.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseForbiddenturn<M extends BaseForbiddenturn<M>> extends Model<M> implements IBean {

	public void setFtid(java.lang.String ftid) {
		set("FTID", ftid);
	}

	public java.lang.String getFtid() {
		return get("FTID");
	}

	public void setCrossnode(java.lang.String crossnode) {
		set("CROSSNODE", crossnode);
	}

	public java.lang.String getCrossnode() {
		return get("CROSSNODE");
	}

	public void setFromnode(java.lang.String fromnode) {
		set("FROMNODE", fromnode);
	}

	public java.lang.String getFromnode() {
		return get("FROMNODE");
	}

	public void setTonode(java.lang.String tonode) {
		set("TONODE", tonode);
	}

	public java.lang.String getTonode() {
		return get("TONODE");
	}

	public void setCreateOperator(java.lang.String createOperator) {
		set("CREATE_OPERATOR", createOperator);
	}

	public java.lang.String getCreateOperator() {
		return get("CREATE_OPERATOR");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("CREATE_TIME", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("CREATE_TIME");
	}

	public void setUpdateOperator(java.lang.String updateOperator) {
		set("UPDATE_OPERATOR", updateOperator);
	}

	public java.lang.String getUpdateOperator() {
		return get("UPDATE_OPERATOR");
	}

	public void setUpdateTime(java.util.Date updateTime) {
		set("UPDATE_TIME", updateTime);
	}

	public java.util.Date getUpdateTime() {
		return get("UPDATE_TIME");
	}

	public void setVersion(java.lang.String version) {
		set("VERSION", version);
	}

	public java.lang.String getVersion() {
		return get("VERSION");
	}

}
