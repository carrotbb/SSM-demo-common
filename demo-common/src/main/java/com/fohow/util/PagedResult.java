package com.fohow.util;

import java.util.List;


public class PagedResult<T>
{

    private List<T> dataList;//����

    private long pageNo = 0;//��ǰҳ

    private long pageSize;//����

    private long total;//������

    private long pages;//��ҳ����Ŀ

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
