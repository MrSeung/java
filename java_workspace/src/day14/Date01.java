package day14;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Date01 {

	//static Calendar now=Calendar.getInstance();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd(E) hh:mm:ss");
		String dateString=sdf.format(d);
		System.out.println(dateString);
		/*printY();
		printM();
		printD();
		printW();
		printH();
		printMin();*/
		
		LocalDateTime today=LocalDateTime.now();
		System.out.println(today);
		String curr=today.toString();
		System.out.println(curr.substring(0, curr.indexOf("T")));
		System.out.println(curr.substring(curr.indexOf("T")+1,curr.indexOf(".")));
		System.out.println(curr.substring(curr.indexOf(".")+1));
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		System.out.println(dtf.format(today));
		
		
		
	}
	/*public static void printY() {
		System.out.print(now.get(Calendar.YEAR)+"-");
	}
	public static void printM() {
		System.out.print(now.get(Calendar.MONTH)+1+"-");
	}
	public static void printD() {
		System.out.print(now.get(Calendar.DAY_OF_MONTH));
	}
	public static void printW() {
		String str="";
		switch(now.get(+Calendar.DAY_OF_WEEK)) {
		case 1: str="(일)";break;
		case 2: str="(월)";break;
		case 3: str="(화)";break;
		case 4: str="(수)";break;
		case 5: str="(목)";break;
		case 6: str="(금)";break;
		case 7: str="(토)";break;
		}
		System.out.println(str);
	}
	public static void printH() {
		int hour=now.get(Calendar.HOUR_OF_DAY);
		if(now.get(Calendar.HOUR_OF_DAY)<11)
			System.out.print("오전 "+hour+":");
		else if(now.get(Calendar.HOUR_OF_DAY)==12)
			System.out.print("오후 "+hour+":");
		else if(now.get(Calendar.HOUR_OF_DAY)==24)
			System.out.print("오전 "+(hour-12)+":");
		else
			System.out.print("오후 "+(hour-12)+":");
	}
	public static void printMin() {
		System.out.println(now.get(Calendar.MINUTE));
	}
*/
} 
