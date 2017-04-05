import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KnapsackDuplicates {
	
	
	
	private static int dpKnapsack(int C, int[] w, int[] v, int n){
		
		int[][] mat = new int[n+1][C+1];
		
		
		for(int i=0;i<=n;i++){
			for(int j=0;j<=C;j++){
				
				if(i == 0 || j ==0){
					mat[i][j] = 0;
				}
				else if(w[i-1]<=j){
					mat[i][j] = Math.max(v[i-1] + mat[i-1][j-w[i-1]], mat[i-1][j]);
				}else{
					mat[i][j] = mat[i-1][j];
				}
				
			}
		}
		
		return mat[n][C];
		
	}
	
	
	/*public static int knapsack(int[] values, int[] weights, int C, int n){
		
		int[] M = new int[C+1];
		int temp=0;
		List<Integer> list = new ArrayList<>();
		
		for(int i=1;i<=C;i++){
			
			M[i] = M[i-1];
			int pos = i-1;
			
			for(int j=0;j< n; j++){
				
				if(i > weights[j]){
					temp = values[j] + M[i - weights[j]];
				}
				if(temp > M[i]){
					M[i] = temp;
					pos = i - weights[j];
				}
				
			}
			
			list.add(pos);
			
		}
		
		int ans = M[C];
		
		
		
	}*/
	
	public static int knapsack(int C, int n, int[] weights, int[] values){
			if( (C==0) || n == weights.length	){
				return 0;
			}
			
			if(weights[n]> C){
				return knapsack(C, n+1, weights, values);
			}
			
			int includedVal = values[n] + knapsack(C - weights[n], n+1, weights, values);
		
			int excludedVal = knapsack(C, n+1, weights, values);
			
			return Math.max(includedVal,excludedVal);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int num = in.nextInt();
		
		for(int i=0;i<num;i++){
			
			
			int size = in.nextInt();
			int C = in.nextInt();
			
			int[] values = new int[size];
			for(int u=0;u<size;u++){
				values[u] = in.nextInt();
			}
			
			int[] weights = new int[size];
			for(int u=0;u<size;u++){
				weights[u] = in.nextInt();
			}
			
			int val1 = dpKnapsack(C, weights, values, weights.length);
		int val =	knapsack(C, 0, weights, values);
			System.out.println(val1);
			System.out.println(val);
		}
		
	}
	
	

}
