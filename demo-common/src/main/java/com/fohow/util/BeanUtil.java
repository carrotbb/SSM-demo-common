package com.fohow.util;

import java.util.ArrayList;
import java.util.List;

import com.github.pagehelper.Page;


public class BeanUtil
{

	public static <T> PagedResult<T> toPagedResult(List<T> datas)
	{
		PagedResult<T> result = new PagedResult<T>();
		if (datas instanceof Page)
		{
			Page<T> page = (Page<T>) datas;
			result.setPageNo(page.getPageNum());
			result.setPageSize(page.getPageSize());
			result.setDataList(page.getResult());
			result.setTotal(page.getTotal());
			result.setPages(page.getPages());
		}
		else
		{
			result.setPageNo(1);
			if (datas != null)
			{
				result.setPageSize(datas.size());
				result.setDataList(datas);
				result.setTotal(datas.size());
			}
			else
			{
				List<T> list = new ArrayList<T>();
				result.setPageSize(0);
				result.setDataList(list);
				result.setTotal(0);
			}
		}

		return result;
	}

}
