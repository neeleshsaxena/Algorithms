
public class FloodFill {
	
	public static int M;
	public static int N;

	public static void floodFill(int[][] screen,int x,int y, int prevC,int newC){
		
		//base cases
		if( (x<0) || (x>=M) || (y<0) || (y>=N)   ){
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
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 M = 8;N = 8;
		
		 int screen[][] = new int[][]{
			 	 {1, 1, 1, 1, 1, 1, 1, 1},
                 {1, 1, 1, 1, 1, 1, 0, 0},
                 {1, 0, 0, 1, 1, 0, 1, 1},
                 {1, 2, 2, 2, 2, 0, 1, 0},
                 {1, 1, 1, 2, 2, 0, 1, 0},
                 {1, 1, 1, 2, 2, 2, 2, 0},
                 {1, 1, 1, 1, 1, 2, 1, 1},
                 {1, 1, 1, 1, 1, 2, 2, 1},
                };
                
                char screen1[][] = new char[][]{
                	{'X', 'O', 'X', 'X', 'X', 'X'},
                    {'X', 'O', 'X', 'X', 'O', 'X'},
                    {'X', 'X', 'X', 'O', 'O', 'X'},
                    {'O', 'X', 'X', 'X', 'X', 'X'},
                    {'X', 'X', 'X', 'O', 'X', 'O'},
                    {'O', 'O', 'X', 'O', 'O', 'O'},
                   };
                
                int x = 4, y = 4, newC = 3;
                
                int prevC = screen[x][y];
                floodFill(screen,x,y,prevC,newC);
		
                
                for(int i=0;i<M;i++){
                	for(int j=0;j<N;j++){
                		System.out.print(screen[i][j]+"");
                		
                	}
                	System.out.println(" ");
                }

	}

}
