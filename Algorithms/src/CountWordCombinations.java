import java.util.Scanner;

public class CountWordCombinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = 1%3;
		System.out.println(a);
		String str = in.next();
		String sos = "SOS";
		int count =0;
		
		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=sos.charAt(i%3)){
				count++;
			}
		}
		
		
		System.out.println(count);
	}

}
