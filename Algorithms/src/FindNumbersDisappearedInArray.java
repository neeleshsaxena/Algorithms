import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class FindNumbersDisappearedInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int size = in.nextInt();
		int[] arr = new int[size];
		
		for(int i=0;i<size;i++){
			arr[i] = in.nextInt();
		}
		
		SortedSet<Integer> set = new TreeSet<>();
		
		for(int j=0;j<arr.length;j++){
			set.add(arr[j]);
		
		}
		List<Integer> list = new ArrayList<>();
		if(!set.isEmpty()){
		
		
			
			for(int k=1;k<=arr.length;k++){
				if(!set.contains(k)){
					list.add(k);
				}
			}
		}
		
		
		
		for(int num:list){
			System.out.println(num);
		}
		
	}

}
