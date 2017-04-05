import java.util.Scanner;

public class StringCompression {
	
	public static void compression(String str){
		
		for(int i=1;i<str.length();i++){
			
			if(str.charAt(i) == str.charAt(i-1)){
				str = 	str.substring(0, i-1) + str.substring(i);
			 	i =0;
			}
		}
		
		System.out.println(str);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		
		String str = in.next();
		compression(str);
		int count=1;
		StringBuilder strB = new StringBuilder();
		char s =0;
		//abcaabbb
		for(int i=1;i<str.length();i++){
			
			if(str.charAt(i)!=str.charAt(i-1)){
				if(count!=1){
					strB.append(str.charAt(i-1)).append(count);
					count=1;
				}
				else{
					strB.append(str.charAt(i-1));
				}
			}else{
				count++;
				s = str.charAt(i-1);
			}
			
			
		}
		
		if(count!=1){
			strB.append(s).append(count);
		}
		
		System.out.println(strB);
	}

}
