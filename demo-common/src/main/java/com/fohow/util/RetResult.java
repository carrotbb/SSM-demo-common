package com.fohow.util;

import java.util.List;

import com.fohow.enums.TjResCode;


public class RetResult<T extends Result>
{
	/**
	 * 杩斿洖CODE鐮�
	 */
	private int code;
	/**
	 * 杩斿洖缁撴灉淇℃伅.
	 */
	private String reason;

	/**
	 * 閫氱敤瀵硅薄杩斿洖.
	 */
	private Object obj;
	/**
	 * 杩斿洖缁撴灉鏁版嵁.
	 */

	private List<T> result;

	public int getCode()
	{
		return code;
	}

	public Object getObj()
	{
		return obj;
	}

	public String getReason()
	{
		return reason;
	}

	public List<T> getResult()
	{
		return result;
	}

	public void setCode(int code)
	{
		this.code = code;
	}

	public void setObj(Object obj)
	{
		this.obj = obj;
	}

	public void setReason(String reason)
	{
		this.reason = reason;
	}

	public void setResult(List<T> result)
	{
		this.result = result;
	}

	public void setTjResCode(TjResCode resCode)
	{
		this.code = resCode.getCode();
		this.reason = resCode.getReason();
	}

}
