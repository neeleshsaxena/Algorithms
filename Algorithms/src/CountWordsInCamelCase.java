import java.util.Scanner;

public class CountWordsInCamelCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
	       
		String str = in.nextLine();
		int count =0;
		for(int i =0;i<str.length();i++){
			
			if(Character.isUpperCase(str.charAt(i))){
				count++;
			}
		}
		
		count = count+1;
        
		
		System.out.println(count);
	}

}
