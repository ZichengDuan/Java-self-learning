package cn.bjsxt.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd日 hh:mm:ss 属于本年的第w周");		//这是一个抽象类
		
		Date d = new Date(1432321314323L);
		System.out.println(df.format(d));		//按照格式化字符串将时间对象转化成字符串并打印
		
		String str = "1998-11-05";
		DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");//此处格式一定要一一对应，保持一致
		try {
			Date d2 = df2.parse(str);
			System.out.println(d2);
		}catch(ParseException w) {
			w.printStackTrace();
		}
	}
}
