package cn.bjsxt.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
/**
 * 可视化日历程序
 * @author duanzicheng
 *
 */

public class VisualCalendar {
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("请输入您想找的具体日期，格式为yyyy.MM.dd");
		
		String temp = s1.nextLine();
		s1.close();
		DateFormat format = new SimpleDateFormat("yyyy.MM.dd");
		try {
			Date date = format.parse(temp);
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			System.out.println("\t"+"\t"+"公元 " + calendar.get(calendar.YEAR) + "年"
					+ (calendar.get(Calendar.MONTH)+1) + "月" 
					+ calendar.get(Calendar.DATE) + "日");
			System.out.println("日\t一\t二\t三\t四\t五\t六");
			int count = 0;
			int j = 1;
			
			for(int i = 1; i<= calendar.getActualMaximum(Calendar.DATE) + calendar.get(Calendar.DAY_OF_WEEK) - 1; i++) {
				if(i < calendar.get(Calendar.DAY_OF_WEEK)) {
					System.out.print("\t");
				}
				else {
					System.out.print(j  + "\t");
					j++;
				}
				count ++;
				if(count % 7 == 0) {
					System.out.println();
				}
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("请重新运行程序，并输入正确的格式！");
		}
		
		
	}
}



//6 2， 5 8， 4 10， 3 11








