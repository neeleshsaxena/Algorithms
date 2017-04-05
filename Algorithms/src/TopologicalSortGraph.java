import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;


//only possible for Directed Acyclic Graphs(DAG)
public class TopologicalSortGraph {
	
	
	
	int V;
	LinkedList<Integer>[] arr;
	
	
	public TopologicalSortGraph(int v){
		V=v;
		arr = new LinkedList[V];
		for(int i=0;i<V;i++){
			arr[i] = new LinkedList<>();
		}
	}
	
	
	public void topoSortUtil(int v,boolean[] visited, Stack stack){
		
		visited[v] = true;
		
		Iterator it = arr[v].listIterator();
		
		while(it.hasNext()){
			int adjVertex = (int)it.next();
			
			if(!visited[adjVertex]){
				topoSortUtil(adjVertex, visited, stack);
			}
		}
		
		
		//all the adjacent vertices of v are called for topological sort, now it can be put into the stack
		stack.add(v);
		
	}
	
	
	public Stack<Integer> topoSort(){
		
		boolean[] visited = new boolean[V];
		Stack<Integer> stack = new Stack<>();
		
		
		for(int i=0;i<V;i++){
			if(!visited[i]){
				//call
				topoSortUtil(i, visited, stack);
			}
		}
		
		return stack;
	}
	
	public void addEdge(int v,int i){
		arr[v].add(i);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TopologicalSortGraph g = new TopologicalSortGraph(7);
		
		g.addEdge(2,1);
	    g.addEdge(3,1);
	    g.addEdge(1,4);
	    g.addEdge(4,5);
	    g.addEdge(5,0);
	    g.addEdge(3,6);
	    g.addEdge(6,5);
	    
	    
	    Stack stack = g.topoSort();
	    while(!stack.isEmpty()){
	    	System.out.println(stack.pop());
	    }
	    
		
	}

}
