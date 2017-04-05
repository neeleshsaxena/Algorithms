import java.util.Arrays;
import static java.lang.Math.toIntExact;

public class MinimumMovestoEqualArrayElements {

	/*Minimum Moves to Equal Array Elements
	https://leetcode.com/problems/minimum-moves-to-equal-array-elements/?tab=Description
	*/
	
	 public static int minMoves(int[] nums) {
	        
	        
	        Arrays.sort(nums);
	        int max = nums[nums.length-1];
	        int min = nums[0];
	       
	        int count = 0;
	       
	       
	       for(int num:nums){
	           int n = num - min;
	           count = count + n;
	       }
	        
	        
	        
	        return count;
	    }
	    
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] g = {1,1,2147483647};
	
		int val = minMoves(g);
		System.out.println(val);
	}

}
