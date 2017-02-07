import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Sum3Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int size = in.nextInt();
		int sum = in.nextInt();
		
		int[] arr = new int[size];
		for(int a=0;a<size;a++){
			arr[a]=in.nextInt();
		}
		
		/*Map<Integer,List<Integer>> map = new HashMap<>();
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				List<Integer> list = new ArrayList<>();
				list.add(arr[i]);
				list.add(arr[j]);
				map.put(arr[i]+arr[j], list);
				
			}
			
		}
		
		List<Integer> list = new ArrayList<>();
		for(int q=0;q<arr.length;q++){
			int comp = sum - arr[q];
			int[] ar = new int[3];
			if(map.containsKey(comp)){
				list = map.get(comp);
				list.add(arr[q]);
				break;
			}
			
			
		}*/
		
		
		Arrays.sort(arr);
		List<int[]> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++){
			int j = i+1;
			int k = arr.length-1;
			
			while(j<k){
				
				int val = arr[i] + arr[j] + arr[k];
				if(val==sum){
					System.out.println("the pairs are " + arr[i] + ", "+ arr[j]+" ," +arr[k]);
					j++;
					k--;
				}
				else if(val<sum){
					j++;
				}
				else if(val>sum){
					k--;
				}
			}
			
			
		}
		
		
	}

}
