import java.util.Scanner;

public class PanagramOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String as = in.nextLine().toLowerCase();
		
		char[] arr = as.toCharArray();
		int count=0;
		for(char i='a';i<='z';i++){
			
			for(int j=0;j<arr.length;j++){
				
				if(i==arr[j]){
					count++;
			
					break;
				}
				
			}
		}
		
		if(count==26){
			System.out.println("pangram");
		}else{
			System.out.println("not pangram");
		}
		

	}

}
