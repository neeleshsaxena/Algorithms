import java.util.Scanner;

public class DistinctTransformationsGoogle {
	
	/*private static String word;
	
	
	private static boolean check(StringBuilder str){
		
		if(str.length()!=word.length()){
			return false;
		}
		else{
			if(word.contains(str.subSequence(0, str.length()))){
				return true;
			}
			
		}
	
		return false;
	}*/
	
	private static int find(String s,String t){
		
		int m = t.length();
		int n = s.length();
		
		if(m>n){
			return 0;
		}
		
		
		int[][] mat = new int[m+1][n+1];
		
		for(int i=1;i<=m;i++){
			mat[i][0] = 0;
		}
		for(int i=0;i<=n;i++){
			mat[0][i] = 1; 
		}
		
		 for(int i=0;i<=m;i++){
         	for(int j=0;j<=n;j++){
         		System.out.print(mat[i][j]+"");
         		
         	}
         	System.out.println(" ");
         }
		
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
				
				if(t.charAt(i - 1) != s.charAt(j -1)){
					mat[i][j] = mat[i][j-1];
				}
				else{
					mat[i][j] = mat[i][j-1] + mat[i-1][j-1];
				}
				
				for(int p=0;p<=m;p++){
		         	for(int q=0;q<=n;q++){
		         		System.out.print(mat[p][q]+"");
		         		
		         	}
		         	System.out.println(" ");
		         }
			}
		}
		
		return mat[m][n];
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Scanner in = new Scanner(System.in);

		String str = in.next();
		  word	= in.next();
		
		  char[] arr = str.toCharArray();
		  int size = arr.length;
		  int count =0;
		for(int i=0;i<(1<<size);i++){
			StringBuilder st = new StringBuilder();
			for(int j=0;j<size;j++){
				
				if( (i & (1<<j))> 0){
					st.append(arr[j]);
				}
				
			}
			if(check(st)) count++;
			
		}
		
		
		System.out.println(count);*/
		
		
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
        
        for(int h=0;h<num;h++){
            
            String s = in.next();
            String t = in.next();
            
            int val = find(s, t);
        
        System.out.println(val);
        
        }
		
		
		
		
	}

	
	
	
	
}
