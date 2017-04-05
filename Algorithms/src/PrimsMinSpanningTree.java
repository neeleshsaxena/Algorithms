import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class PrimsMinSpanningTree {
	
	class Node implements Comparable<Node>{
		int v;
		int weight;
		
		@Override
		public int compareTo(Node that){
			return this.weight - that.weight;
		}
		
		public Node(int v,int weight){
			this.v = v;
			this.weight = weight;
		}
	}
	
	
	
	
	int V;
	
	LinkedList<Node>[] arr;
	
	
	public void addEdge(int v,int i,int weight){
		arr[v].add(new Node(i,weight));
		arr[i].add(new Node(v,weight));
	}
	
	public PrimsMinSpanningTree(int v){
	
		this.V = v;
		arr = new LinkedList[V];
		for(int i=0;i<V;i++){
			arr[i] = new LinkedList<>();
		}
		
	}
	

	
	
	public void Prims(){
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		
		int src=0;
		int[] key = new int[V];
		for(int i=0;i<V;i++){
			key[i] = Integer.MAX_VALUE;
		}
		
		Node[] parent = new Node[V];
		
		boolean[] inMST = new boolean[V];
		
		pq.add(new Node(0,src));
		key[0] = 0;
		
		while(!pq.isEmpty()){
			
			Node node = pq.poll();
			int v = node.v;
			inMST[v] = true;
			
			Iterator it = arr[v].listIterator();
			while(it.hasNext()){
				
				Node adjacentNode = (Node)it.next();
				int u = adjacentNode.v;
				int weight = adjacentNode.weight;
				
				if(!inMST[u] && key[u]>weight){
					key[u] = weight;
					pq.add(new Node(u,weight));
					parent[u] = node;
				}
				
			}
			
			
		}
		
		
		for(int i=1;i<V;i++){
			System.out.println("u=>"+parent[i].v  +", v =>  "+ i +" , and the edge weight is "+parent[i].weight);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		PrimsMinSpanningTree g = new PrimsMinSpanningTree(9);

		g.addEdge(0, 1, 4);
	    g.addEdge(0, 7, 8);
	    g.addEdge(1, 2, 8);
	    g.addEdge(1, 7, 11);
	    g.addEdge(2, 3, 7);
	    g.addEdge(2, 8, 2);
	    g.addEdge(2, 5, 4);
	    g.addEdge(3, 4, 9);
	    g.addEdge(3, 5, 14);
	    g.addEdge(4, 5, 10);
	    g.addEdge(5, 6, 2);
	    g.addEdge(6, 7, 1);
	    g.addEdge(6, 8, 6);
	    g.addEdge(7, 8, 7);
	    
	    g.Prims();
		
	}

}
