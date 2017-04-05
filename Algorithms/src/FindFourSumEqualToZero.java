import java.util.HashMap;
import java.util.Map;

//find pairs from 4 arrays of equal length whose sum is 0
public class FindFourSumEqualToZero {
	
	
	public static int find(int[] A,int[] B,int[] C,int[] D){
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<A.length;i++){
			for(int j =0;j<B.length;j++){
				int sum = A[i] + B[j];
				map.put(sum,map.getOrDefault(sum, 0) + 1);
			}
		}
		
		
		int res=0;
		
		for(int i=0;i<C.length;i++){
			for(int j=0;j<D.length;j++){
				res += map.getOrDefault(-1 *(C[i]+D[j]), 0);
			}
		}
		
		
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] A = {1,2};
		int[] B = {-2,-1};
		int[] C = {-1,2};
		int[] D = {0,2};
		
		int result = find(A, B, C, D);
		System.out.println(result);
	}

}
