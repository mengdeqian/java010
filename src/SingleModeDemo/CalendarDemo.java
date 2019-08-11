package SingleModeDemo;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 * 演示日历类的常用方法
 * @author mdq
 *
 */
public class CalendarDemo {
	public static void main(String[] args) throws ParseException{
		//Calendar是一个抽象类，一般由子类实现
		Calendar cal = Calendar.getInstance();
		//System.out.println(cal.getClass());
		//使用日历打印当前时间
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int milliSecond = cal.get(Calendar.MILLISECOND);
		System.out.println("当前时间:");
		String strTime = String.format("%d-%02d-%02d %d-%d-%d:%s",
				year, month, day, hour, minute, second, milliSecond);
		System.out.println(strTime);
		
		//为日历对象设立时间
		cal.set(2019, 5, 12, 12, 23, 1);
		Date date = cal.getTime();
		System.out.println(date.toLocaleString());
		
		//日期格式化类
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		String strDate = format.format(date);
		System.out.println(strDate);
		
		//将字符串转换为Date类型
		Date newDate = format.parse("2017-12-23 23:23:32:999");
		System.out.println(newDate.toLocaleString());
		
		GregorianCalendar cal2 = new GregorianCalendar(2017, 8, 9);
		long diff = Math.abs(cal.getTimeInMillis() - cal2.getTimeInMillis()) ;
		int diffDays =(int)diff / 1000 / 60 / 60 / 24;
		System.out.println("相差" + diffDays + "天");
		cal.add(Calendar.YEAR, 3);
		System.out.println(cal.get(Calendar.YEAR));
		//输出当前最大年份，或当年最大月份或当月最多天数
		System.out.println(cal.getActualMaximum(Calendar.YEAR));
	}
}
