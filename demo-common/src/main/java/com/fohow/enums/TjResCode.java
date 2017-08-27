package com.fohow.enums;

public enum TjResCode
{
	// ----------------绯荤粺绾ц繑鍥為敊璇爜----------------
	C800200(800200, "请求成功"), C800400(800400, "系统错误");
	private int code;
	private String reason;

	TjResCode(int code, String reason)
	{
		this.code = code;
		this.reason = reason;
	}

	public int getCode()
	{
		return code;
	}

	public String getReason()
	{
		return reason;
	}
}
