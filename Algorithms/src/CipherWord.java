import java.util.Scanner;

public class CipherWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String str1 = in.next();
		StringBuilder str = new StringBuilder(str1);
		//String str = in.nextLine();
		int cipherValue = in.nextInt();
		
		for(int i=0;i<str.length();i++){
			int asc = (int)str.charAt(i);
			
			//for A-Z and a-z
			if((asc>=65 && asc<=90)){
				asc = asc+cipherValue;
				if(asc>90){
					int val = asc-90;
					asc = 64+val;
				}
				str.setCharAt(i, (char)asc);
			}
			if(asc>=97 && asc<=122){
				asc = asc+cipherValue;
				while(asc>122){
					int val = asc-122;
					asc = 96+val;
				}
				str.setCharAt(i, (char)asc);
			}
		}
		
		System.out.println(str);
		
		
	}

}
