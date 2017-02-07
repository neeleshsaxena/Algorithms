import java.util.Scanner;
import java.util.stream.IntStream;

public class SuperReducedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)) {
                str = str.substring(0, i-1) + str.substring(i+1);
                i = 0;   //this is important for input type = baab -> need to restart the loop to find potential duplicates from the start of the new string
            }
        }
       
       
       
        if (str.length() == 0) {
            System.out.println("Empty String");
        } else {
           
        	int len = find(str);
        	System.out.println(len);
        	
        	
        }
			
	}

	public static int find(String s){
		
		for(int i =1;i<s.length();i++){
			if(s.substring(0, i).equals(s.substring(i)) ){
				String s1 = s.substring(0,i);
				return s1.length();

			}
			
			
		}
		return s.length();
	}
	
}
