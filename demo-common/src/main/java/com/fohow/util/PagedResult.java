package com.fohow.util;

import java.util.List;


public class PagedResult<T>
{

    private List<T> dataList;//数据

    private long pageNo = 0;//当前页

    private long pageSize;//条数

    private long total;//总条数

    private long pages;//总页面数目

	public List<T> getDataList()
	{
		return dataList;
	}

	public long getPageNo()
	{
		return pageNo;
	}

	public long getPages()
	{
		pages = total % pageSize == 0 ? total / pageSize : total / pageSize + 1;
		return pages;
	}

	public long getPageSize()
	{
		return pageSize;
	}

	public long getTotal()
	{
		return total;
	}

	public void setDataList(List<T> dataList)
	{
		this.dataList = dataList;
	}

	public void setPageNo(long pageNo)
	{
		this.pageNo = pageNo;
	}

	public void setPages(long pages)
	{
		this.pages = pages;
	}

	public void setPageSize(long pageSize)
	{
		this.pageSize = pageSize;
	}

	public void setTotal(long total)
	{
		this.total = total;
	}

}
