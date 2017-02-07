import java.util.Scanner;

public class IsPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1%4;
		System.out.println(a);
		Scanner in = new Scanner(System.in);
		
		String word = in.nextLine().toLowerCase();
		
		char[] arr = word.toCharArray();
		
		int i=0;
		int j = arr.length-1;
		
		boolean flag = true;
		while(i<j){
			if(arr[i]!=arr[j]){
				flag = false;
				break;
			}
			i++;
			j--;
		}
		

		
		if(flag){
			System.out.println("Is a Pallindrome");
		}else{
			System.out.println("Not a Pallindrome");
		}
	}

}
