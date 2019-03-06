package com.lin.recitewords.common.model;

public class R {
	private Integer code;
	private String msg;
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
}
