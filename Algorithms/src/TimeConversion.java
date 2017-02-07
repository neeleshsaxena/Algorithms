import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String a = in.next();
		
		String b = a.substring(0, 8);
		String[] ab = b.split(":");
		String hour1 = ab[0];
		String min = ab[1];
		String sec = ab[2];
		boolean splCase =false;
		if(hour1.contains("12") && a.contains("PM")){
			splCase = true;
		}
		
		if(a.contains("PM") && !splCase){
			int hour = Integer.parseInt(ab[0]);
			hour = hour+12;
			System.out.println(hour+":"+min+":"+sec);
		}
		else if(hour1.contains("12") && a.contains("AM") ){
			System.out.println("00:"+min+":"+sec);
		}
		
		else {
			System.out.println(hour1+":"+min+":"+sec);
		}
	}

}
