import java.util.Scanner;

public class FormAPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		for(int a=0;a<num;a++){
			String word = in.next();
			char[] arr = word.toCharArray();
			
			if(pallindrome(arr)){
				System.out.println(0);
				
			}else{
			
			int i =0;
			int j = arr.length-1;
			int  count=1;
			int backCounter=0;
			int abs =0;
			int val =0;
			boolean flag = false;
			while(i<j){
			
				char[] arr1 = new char[arr.length+count];
				System.arraycopy(arr, 0, arr1, count, arr.length);
				//arr = arr1;
				//backCounter = arr.length-1;
				backCounter=arr1.length-1;
				for(int q=0;q<count;q++){
					arr1[q] = arr1[backCounter];
					backCounter--;
				}
				
				if(pallindrome(arr1)){
					abs++;
					flag = true;
					count++;
					break;
				}
				j--;
				count++;
			}
			
			
			
			if(flag){
				System.out.println(count-1);
			}
			else{
				System.out.println(0);
			}
		}
			
			
		}
		
	}

	
	public static boolean pallindrome(char[] arr){
		
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
		
		return flag;
		
	}
}
/*	j = (arr.length-1)-backCounter;

char[] arr1 = new char[arr.length+1];
System.arraycopy(arr, 0, arr1, 1, arr.length);
arr1[i]=arr[j];
arr = arr1;
if(pallindrome(arr)){
	count++;
}
backCounter++;*/