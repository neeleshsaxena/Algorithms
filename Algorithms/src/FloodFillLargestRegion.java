import java.util.Scanner;

public class FloodFillLargestRegion {
	private static int row;
	private static int col;
	private static int count;
	
	
	//amazon question
	/*
	 * 	2
		3 3
		1 1 0 0 0 1 1 0 1
		1 3
		1 1 1
	 * 
	 */
	private static void floodFill(int[][] mat, int x,int y, boolean[][] visited){
		
		
		if( (x<0) || (x>=row) || (y<0) || (y>=col)){
			return;
			
		}
		
		if(mat[x][y]!=1 || visited[x][y]){
			return;
		}
		
		count++;
		visited[x][y] = true;
		
		floodFill(mat, x+1, y, visited);
		floodFill(mat, x-1, y, visited);
		floodFill(mat, x, y+1, visited);
		floodFill(mat, x, y-1, visited);
		floodFill(mat, x-1, y-1, visited);
		floodFill(mat, x-1, y+1, visited);
		floodFill(mat, x+1, y-1, visited);
		floodFill(mat, x+1, y+1, visited);
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		for(int m=0;m<num;m++){
			
			row = in.nextInt();
			col = in.nextInt();
			
			
			int mat[][] = new int[row][col];
			for(int h=0;h<row;h++){
				for(int y=0;y<col;y++){
					mat[h][y] = in.nextInt();
				}
				
			}
			
			
			  boolean[][] visited = new boolean[row][col];
			  
			  count=0;
			  int result =0;
	             for(int i=0;i<row;i++){
	            	 for(int j=0;j<col;j++){
	            		 
	            		 
	            		 if(mat[i][j] ==1 && !visited[i][j] ){
	            			  count =0;
	            			 floodFill(mat,i,j,visited);
	            			 
	            			 result = Math.max(result, count);
	            		 }
	            	 }
	            	 
	             }
	             
	             System.out.println(result);
			  
		}
		
		
	}

}
