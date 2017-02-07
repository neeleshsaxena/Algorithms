import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class DistinctTransformations {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
	
		String word = in.nextLine();
	
		char[] arr = word.toCharArray();
		
		int i = 0;
		int j= arr.length-1;
		
		while(i<j){
			char temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			i++;
			j--;
		}
		
	
		
		String word1 = String.valueOf(arr);
		System.out.println(word1);
	}

}
