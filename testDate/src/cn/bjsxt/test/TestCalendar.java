package cn.bjsxt.test;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 测试日期类
 * @author duanzicheng
 *
 */
public class TestCalendar {
	public static void main(String[] args) {
		 Calendar c = new GregorianCalendar();
//		 c.set(2001,Calendar.JANUARY,10,12,23,34);
		 c.set(Calendar.YEAR,2018);
		 c.set(Calendar.MONTH,7 );
		 
		 System.out.println(c.getTime());
		 
	}
}
