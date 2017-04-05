import java.util.Iterator;
import java.util.LinkedList;

public class DetectCycleDirectedGraphDFS {

	int V;
	LinkedList[] arr;
	
	
	public DetectCycleDirectedGraphDFS(int v){
		V=v;
		arr = new LinkedList[V];
		for(int i=0;i<V;i++){
			arr[i] = new LinkedList<>();
		}
	}
	
	
	public void addEdge(int i,int j){
		arr[i].add(j);
	}
	
	public boolean isCyclicUtil(int i, boolean[] visited, boolean[] recursionStack){
		
		if(!visited[i]){
			
			visited[i] = true;
			recursionStack[i] = true;
			
			Iterator it = arr[i].listIterator();
			while(it.hasNext()){
				int j = (int)it.next();
				
				if(!visited[j] && isCyclicUtil(j, visited, recursionStack)){
					return true;
				}
				else if(recursionStack[j]){
					return true;
				}
				
			}
			
		}
		return false;
	}
	
	
	public boolean isCyclic(){
		
		boolean[] visited = new boolean[V];
		boolean[] recursionStack = new boolean[V];
		
		for(int i=0;i<V;i++){
			if(isCyclicUtil(i,visited,recursionStack)){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args){
		
		DetectCycleDirectedGraphDFS g = new DetectCycleDirectedGraphDFS(4);
			g.addEdge(0, 1);
		    g.addEdge(0, 2);
		    g.addEdge(1, 2);
		    g.addEdge(2, 0);
		    g.addEdge(2, 3);
		    g.addEdge(3, 3);
		    
		    System.out.println(g.isCyclic());
		
	}
}
