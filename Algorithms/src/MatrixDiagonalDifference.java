import java.util.Scanner;

public class MatrixDiagonalDifference {
	
	
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
			
		int size = in.nextInt();
		int[][] a = new int[size][size];
		int sum=0;
		int sum1 = 0;
		int difference =0;
		for(int i=0;i<size;i++){
			
			for(int j=0;j<size;j++){
				a[i][j] = in.nextInt();
				
				//primary diagonal
				if(i==j){
					sum += a[i][j];
				}
				//secondary diagonal
				if(i+j==size-1){
					sum1 +=a[i][j];
				}
				
				
			}//j loop
			
		}//i loop
		
		difference = Math.abs(sum - sum1);
		System.out.println(difference);
		
	}

}
