import java.util.LinkedList;
import java.util.Queue;
import java.util.function.DoubleToIntFunction;

public class MatrixFlip {
	
	public static void swap(int[][]mat, int i, int j){
		
		int temp = mat[i][j];
		mat[i][j] = mat[j][i];
		mat[j][i] = temp;
		
	
	}
	
	public static void transpose(int[][] mat){
		int rows = mat.length;
		int cols = mat[0].length;
		
		for(int i=0;i<rows;i++){
			for(int j=i;j<cols;j++){
				swap(mat,i,j);
			}
		}
		
	}
	
	public static void reverse(int[][] mat){
		
		int cols = mat[0].length;
		int rows = mat.length;
		
		for(int i=0;i<cols;i++){
			for(int j=0,k=cols-1;j<k;j++,k--){
				int temp = mat[j][i];
				mat[j][i] = mat[k][i];
				mat[k][i] = temp;
			}
			
		}
		
	}
	public static void clockwiseReverse(int[][] mat){
		
		
		int col = mat[0].length;
		
		for(int i=0;i<col;i++){
			for(int j=0,k=col-1;j<k;j++,k--){
				
				int temp = mat[i][j];
				mat[i][j] = mat[i][k];
				mat[i][k] = temp;
						
			}
		}
	}
	
	
	public static void flipAnticlockwise(int[][] mat){
		
		transpose(mat);
		reverse(mat);
		
		
		
		
	}
	
	public static void flipClockwise(int[][] mat){
		
		transpose(mat);
		clockwiseReverse(mat);
	}
	public static void replaceWithO(int[][] mat){
		int r = mat.length;
		int c = mat[0].length;
		
		int row = -1;
		int col = -1;
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				if(mat[i][j] == 0) {
					row = i;
					col = j;
					break;
				}
			}
		}
		
		
		for(int j=0;j<col;j++){
			mat[row][j] = 0;
		}
		for(int j=0;j<row;j++){
			mat[j][col] = 0;
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 int mat[][] = new int[][]{
		 	 {1,2,3,4},
		 	 {5,6,7,0},
		 	 {9,10,11,12},
		 	 {13,14,15,16}
            };
            
            //transpose(mat);
            //flipAnticlockwise(mat);
            flipClockwise(mat);
            
            //replaceWithO(mat);
            
            for(int i=0;i<mat.length;i++){
            	for(int j=0;j<mat[0].length;j++){
            		System.out.print(mat[i][j]+" ");
            		
            	}
            	System.out.println(" ");
            }
            
         
            

	}

}
