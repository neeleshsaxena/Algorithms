


//http://www.geeksforgeeks.org/union-find/
public class DetectCycleUndirectedGraph {

	
	
	int V;
	int E;
	Edge[] edge; 
	int[] parent;
	
	static class Edge{
		int source;
		int des;
	}
	
	
	public DetectCycleUndirectedGraph(int v,int e){
		V =v;
		E =e;
		edge = new Edge[e];
		parent = new int[v];
		for(int i=0;i<e;i++){
			edge[i] = new Edge();
			parent[i] = i;
		}
	}
	
	
	public int find(int i){
		
		if(parent[i]!= i){
			parent[i] = find(parent[i]);
		}
		
		return parent[i];
		
	}
	
	public void union(int i,int j){
		
		int x = find(i);
		int y = find(j);
		
		parent[y] = x;
	}
	
	public boolean isCycle(){
		
		for(int i=0;i<E;i++){
			
			int x = find(edge[i].source);
			int y = find(edge[i].des);
			
			if(x == y){
				return true;
			}
			union(x, y);
			
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int V = 3, E = 3;
        DetectCycleUndirectedGraph graph = new DetectCycleUndirectedGraph(V, E);
 
        // add edge 0-1
        graph.edge[0].source = 0;
        graph.edge[0].des = 1;
 
        // add edge 1-2
        graph.edge[1].source = 1;
        graph.edge[1].des = 2;
 
        // add edge 0-2
        graph.edge[2].source = 0;
        graph.edge[2].des = 2;
		
		
        System.out.println(graph.isCycle());
        //graph.isCycle()
        
		
	}

}
