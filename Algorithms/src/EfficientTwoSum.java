import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class EfficientTwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int target = in.nextInt();
		int[] nums = new int[size];
		for(int j=0;j<size;j++){
			nums[j] = in.nextInt();
		}
		
		 int[] result = new int[2];
	        Map<Integer,Integer> map = new HashMap<>();
	        
	        for(int i=0;i<nums.length;i++){
	        	if(map.containsKey(nums[i])){
	        		result[0] = map.get(nums[i]);
	        		result[1] = i;
	        	}else{
	        		map.put(target - nums[i], i);
	        	}
	        }
	        
	        
	        for(int a:result){
	        	System.out.println(a);
	        }
	}

}
