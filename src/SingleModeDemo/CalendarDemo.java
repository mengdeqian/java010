package SingleModeDemo;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 * ��ʾ������ĳ��÷���
 * @author mdq
 *
 */
public class CalendarDemo {
	public static void main(String[] args) throws ParseException{
		//Calendar��һ�������࣬һ��������ʵ��
		Calendar cal = Calendar.getInstance();
		//System.out.println(cal.getClass());
		//ʹ��������ӡ��ǰʱ��
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int milliSecond = cal.get(Calendar.MILLISECOND);
		System.out.println("��ǰʱ��:");
		String strTime = String.format("%d-%02d-%02d %d-%d-%d:%s",
				year, month, day, hour, minute, second, milliSecond);
		System.out.println(strTime);
		
		//Ϊ������������ʱ��
		cal.set(2019, 5, 12, 12, 23, 1);
		Date date = cal.getTime();
		System.out.println(date.toLocaleString());
		
		//���ڸ�ʽ����
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
		String strDate = format.format(date);
		System.out.println(strDate);
		
		//���ַ���ת��ΪDate����
		Date newDate = format.parse("2017-12-23 23:23:32:999");
		System.out.println(newDate.toLocaleString());
		
		GregorianCalendar cal2 = new GregorianCalendar(2017, 8, 9);
		long diff = Math.abs(cal.getTimeInMillis() - cal2.getTimeInMillis()) ;
		int diffDays =(int)diff / 1000 / 60 / 60 / 24;
		System.out.println("���" + diffDays + "��");
		cal.add(Calendar.YEAR, 3);
		System.out.println(cal.get(Calendar.YEAR));
		//�����ǰ�����ݣ���������·ݻ����������
		System.out.println(cal.getActualMaximum(Calendar.YEAR));
	}
}
