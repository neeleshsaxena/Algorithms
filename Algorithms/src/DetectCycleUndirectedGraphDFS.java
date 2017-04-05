import java.util.Iterator;
import java.util.LinkedList;

public class DetectCycleUndirectedGraphDFS {
	
	
	LinkedList<Integer>[] arr;
	int V;
	
	public DetectCycleUndirectedGraphDFS(int v){
		V=v;
		arr = new LinkedList[V];
		for(int i=0;i<V;i++){
			arr[i] = new LinkedList<>();
			
		}
		
	}
	
	public void addEdge(int i,int j){
		arr[i].add(j);
		arr[j].add(i);
	}
	
	
	public boolean isCyclicUtil(int i,boolean[] visited, int parent){
		
		visited[i] = true;
		
		Iterator it =  arr[i].listIterator();
		while(it.hasNext()){
			
			int a = (int)it.next();
			if(!visited[a]){
				isCyclicUtil(a, visited, i);
			}
			else if(a!=parent){
				return true;
			}
		}
		
		return false;
	}
	
	public boolean isCycle(){
		
		boolean[] visited = new boolean[V];
		
		for(int i=0;i<V;i++){
			
			if(!visited[i]){
				
				if(isCyclicUtil(i,visited,-1)){
					return true;
				}
				
			}
			
		}
		return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DetectCycleUndirectedGraphDFS g1 = new DetectCycleUndirectedGraphDFS(5);
        g1.addEdge(1, 0);
        g1.addEdge(0, 2);
        g1.addEdge(2, 0);
        g1.addEdge(0, 3);
        g1.addEdge(3, 4);
        
        System.out.println(g1.isCycle());
        
        
        
	}

}
