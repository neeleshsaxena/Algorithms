import java.util.LinkedList;
import java.util.Queue;

public class SnakesLaddersGraphBFS {

	
	static class Cell{
		int v;
		int dist;
		
	}
	
	
	public int minDiceMoves(int[] moves,int N){
		
		boolean[] visited = new boolean[N];
		
		//start with 0
		Cell vertex = new Cell();
		vertex.v = 0;
		vertex.dist =0;
		
		//mark visited
		visited[0] = true;
		
		Queue<Cell> q = new LinkedList<>();
		q.add(vertex);
		
		Cell curr = null;
		while(!q.isEmpty()){
			
			 curr = q.poll();
			 int v = curr.v;
			
			 if(v==N-1){
				 break;
			 }
			
			//dice can only provide 6 positions
			for(int i=v+1;i<N && i<(v+6);i++ ){
				
				if(!visited[i]){
					
					//create new vertex(cell), mark it visited, add its dist = previous vertex's distance +1 
					Cell newVertex = new Cell();
					newVertex.dist = curr.dist + 1;
					visited[i] = true;
					
					//if there is a snake or a ladder at the position
					if(moves[i]!=-1){
						newVertex.v = moves[i];
					}else{
						newVertex.v = i;
					}
					q.add(newVertex);
				}
				
			}
			
			
		}
		
		return curr.dist;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N = 30;
		int[] moves = new int[N];
		for (int i = 0; i<N; i++)
	        moves[i] = -1;
		
		
		// Ladders
	    moves[2] = 21;
	    moves[4] = 7;
	    moves[10] = 25;
	    moves[19] = 28;
	 
	    // Snakes
	    moves[26] = 0;
	    moves[20] = 8;
	    moves[16] = 3;
	    moves[18] = 6;
	    
	    SnakesLaddersGraphBFS sl = new SnakesLaddersGraphBFS();
	    int numberOfMoves = sl.minDiceMoves(moves, N);
		System.out.println(numberOfMoves);

	}

}
