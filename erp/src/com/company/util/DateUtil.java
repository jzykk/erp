package com.company.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 金子阳
 * @category 时间日期工具类
 */
public class DateUtil {

	/**
	 * 转换时间对象，将date类型转换称为了String类型
	 * @param date
	 * @return
	 */
	public static String changeDateTime(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH/mm/ss");
		String str = sdf.format(date);
		return str;
	}
}
