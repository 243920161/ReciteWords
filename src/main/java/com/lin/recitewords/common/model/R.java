package com.lin.recitewords.common.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class R {
	@ApiModelProperty(value = "状态码")
	private Integer code;
	@ApiModelProperty(value = "状态消息")
	private String msg;
	@ApiModelProperty(value = "数据")
	private Object data;

	private R(Integer code, String msg, Object data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	// 成功
	public static R ok() {
		return new R(200, null, null);
	}
	public static R ok(String msg) {
		return new R(200, msg, null);
	}
	public static R ok(String msg, Object data) {
		return new R(200, msg, data);
	}

	// 失败
	public static R error(String msg) {
		return new R(500, msg, null);
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
