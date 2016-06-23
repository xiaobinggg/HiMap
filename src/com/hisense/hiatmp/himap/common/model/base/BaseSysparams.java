package com.hisense.hiatmp.himap.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSysparams<M extends BaseSysparams<M>> extends Model<M> implements IBean {

	public void setParamcode(java.lang.String paramcode) {
		set("PARAMCODE", paramcode);
	}

	public java.lang.String getParamcode() {
		return get("PARAMCODE");
	}

	public void setParamname(java.lang.String paramname) {
		set("PARAMNAME", paramname);
	}

	public java.lang.String getParamname() {
		return get("PARAMNAME");
	}

	public void setParamvalue(java.lang.String paramvalue) {
		set("PARAMVALUE", paramvalue);
	}

	public java.lang.String getParamvalue() {
		return get("PARAMVALUE");
	}

	public void setParamcontent(java.lang.String paramcontent) {
		set("PARAMCONTENT", paramcontent);
	}

	public java.lang.String getParamcontent() {
		return get("PARAMCONTENT");
	}

	public void setParamstate(java.lang.String paramstate) {
		set("PARAMSTATE", paramstate);
	}

	public java.lang.String getParamstate() {
		return get("PARAMSTATE");
	}

}