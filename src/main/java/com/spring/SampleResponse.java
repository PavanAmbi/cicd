package com.spring;

import lombok.Data;

@Data
public class SampleResponse {

	private String msg;

	
	public SampleResponse(String msg) {
		this.msg=msg;
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
}
