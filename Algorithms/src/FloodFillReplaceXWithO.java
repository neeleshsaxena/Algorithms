import java.util.Scanner;

public class FloodFillReplaceXWithO {

	public static int M;
	public static int N;
	
	public static void floodFill(char[][] screen,int x, int y, char prevC, char newC){
		
		//base cases
		if( (x<0) || (x>=M) || (y<0) || (y>=N)){
			return;
		}
		if(screen[x][y]!=prevC){
			return;
		}
		
		
		if(newC!=prevC){
			
			screen[x][y] = newC;
			
			floodFill(screen, x+1, y, prevC, newC);
			floodFill(screen, x-1, y, prevC, newC);
			floodFill(screen, x, y+1, prevC, newC);
			floodFill(screen, x, y-1, prevC, newC);
			
		}
		
		
	}
	
	public static void replaceAndCall(char[][] screen){
		
		for(int i=0;i<M;i++){
			for(int j=0;j<N;j++){
				
				if(screen[i][j] == 'O'){
					screen[i][j] = '-';
				}
			}
		}
		
		
		//start from all the edges of the matrix - left, right, bottom, top
		//left
		for(int i=0;i<M;i++){
			if(screen[i][0] == '-'){
				floodFill(screen, i, 0, '-', 'O');
			}
		}
		
		//right
		for(int i=0;i<M;i++){
			if(screen[i][N-1] == '-'){
				floodFill(screen, i, N-1, '-', 'O');
			}
		}
		
		
		//top
				for(int i=0;i<N;i++){
					if(screen[0][i] == '-'){
						floodFill(screen, 0, i, '-', 'O');
					}
				}
		
				
		//bottom
				for(int i=0;i<N;i++){
					if(screen[M-1][i] == '-'){
						floodFill(screen, M-1, i, '-', 'O');
					}
				}
				
				
				for(int i=0;i<M;i++){
					for(int j=0;j<N;j++){
						
						if(screen[i][j] == '-'){
							screen[i][j] = 'X';
						}
					}
				}
				
				
	}
	
	
	///http://www.practice.geeksforgeeks.org/problem-page.php?pid=1630
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	M=6;
		N=6;
		
		
		char screen[][] = new char[][]{
			{'X', 'O', 'X', 'O', 'X', 'X'},
            {'X', 'O', 'X', 'X', 'O', 'X'},
            {'X', 'X', 'X', 'O', 'X', 'X'},
            {'O', 'X', 'X', 'X', 'X', 'X'},
            {'X', 'X', 'X', 'O', 'X', 'O'},
            {'O', 'O', 'X', 'O', 'O', 'O'}
           };
		
		
           replaceAndCall(screen);
           
           
           for(int i=0;i<M;i++){
           	for(int j=0;j<N;j++){
           		System.out.print(screen[i][j]+"");
           		
           	}
           	System.out.println(" ");
           }*/
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		for(int w=0;w<num;w++){
		    N = in.nextInt();
		    M = in.nextInt();
		    char[][] arr = new char[M][N];
		    
		    for(int i=0;i<M;i++){
		        for(int j=0;j<N;j++){
		            arr[i][j] = in.next().charAt(0);
		        }
		    }
		    
		    for(int i=0;i<M;i++){
            	for(int j=0;j<N;j++){
            		System.out.print(arr[i][j]+"");
            		
            	}
            	System.out.println(" ");
            }
		    
		    replaceAndCall(arr);
		    
		    
		    for(int i=0;i<M;i++){
           	for(int j=0;j<N;j++){
           		System.out.print(arr[i][j]+"");
           		
           	}
           
           }
		    
		    for(int i=0;i<M;i++){
            	for(int j=0;j<N;j++){
            		System.out.print(arr[i][j]+"");
            		
            	}
            	System.out.println(" ");
            }
		    
           
		    System.out.println("");
		    
		    
		}
		
	}

}
