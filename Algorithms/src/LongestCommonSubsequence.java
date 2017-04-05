import java.util.Scanner;

public class LongestCommonSubsequence {
	
	
	private static int dpLongestSubsequence(char[] s1,char[] s2){
		
		int[][] mat = new int[s1.length+1][s2.length+1];
		int max =0;
		
		for(int i=1;i<s1.length;i++){
			
			for(int j=1;j<s2.length;j++){
				
				if(s1[i] == s2[j]){
					mat[i][j] = mat[i-1][j-1]+1;
				}else{
					mat[i][j] = Math.max(mat[i-1][j], mat[i][j-1]);
				}
				
				if(mat[i][j]>max){
					max = mat[i][j];
				}
			}
			
		}
		
		
		return max;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		for(int y=0;y<num;y++){
		    
		    int str1Size = in.nextInt();
		    int str2Size = in.nextInt();
		    
		    String str1 = in.next();
		    String str2 = in.next();
		    
		    int val = dpLongestSubsequence(str1.toCharArray(), str2.toCharArray());
		    
		    System.out.println(val);
		}
	}

}
