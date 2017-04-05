import java.util.Arrays;

public class KruskalMinSpanningTree {
	
	class Edge implements Comparable<Edge>{

		int src;
		int dest;
		int weight;
		
		@Override
		public int compareTo(Edge that) {
			// TODO Auto-generated method stub
			return this.weight - that.weight;
		}
		
	}
	
	class Subset{
		int parent;
		int rank;
	}
	
	
	int V;
	int E;
	Edge[] arr;
	
	public KruskalMinSpanningTree(int v,int e){
		this.V = v;
		this.E= e;
		arr = new Edge[E];
		for(int i=0;i<E;i++){
			arr[i] = new Edge();
		}
	}
	
	int findParent(Subset[] subset,int i){
		
		if(subset[i].parent!= i){
			subset[i].parent = findParent(subset, subset[i].parent);
		}
		
		return subset[i].parent;
	}

	
	public void union(Subset[] subset,int x,int y){
		
		int xRoot = findParent(subset, x);
		int yRoot = findParent(subset, y);
		
		if(subset[xRoot].rank>subset[yRoot].rank){
			subset[yRoot].parent = xRoot;
					
		}
		else if(subset[xRoot].rank<subset[yRoot].rank){
			subset[xRoot].parent = yRoot;
		}
		else{
			subset[yRoot].parent = xRoot;
			subset[xRoot].rank = subset[xRoot].rank+1;
			
		}
	}
	
	
	void Kruskal(){
		
		Edge[] result = new Edge[V];
		
		int i=0;
		
		Arrays.sort(arr);
		Subset[] subsets = new Subset[V];
		for( i=0;i<V;i++){
			subsets[i] = new Subset();
			subsets[i].parent = i;
		}
		
		i=0;
		int e=0;
		
		while(e<V-1){
			
			//chooses edge with the min weight
			Edge nextEdge = arr[i++];
			
			int x = findParent(subsets, nextEdge.src);
			int y = findParent(subsets, nextEdge.dest);
			
			//if no cycle, then include it in the mst
			if(x!=y){
				result[e] =  nextEdge;
				e++;
				union(subsets, x, y);
			}
			
		}
		
		
		
		// print the contents of result[] to display the built MST
        System.out.println("Following are the edges in the constructed MST");
        for (i = 0; i < e; ++i)
            System.out.println(result[i].src+" -- "+result[i].dest+" == "+
                               result[i].weight);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 /* Let us create following weighted graph
        10
   0--------1
   |  \     |
  6|   5\   |15
   |      \ |
   2--------3
       4       */
int V = 4;  // Number of vertices in graph
int E = 5;  // Number of edges in graph
KruskalMinSpanningTree graph = new KruskalMinSpanningTree(V, E);

// add edge 0-1
graph.arr[0].src = 0;
graph.arr[0].dest = 1;
graph.arr[0].weight = 10;

// add edge 0-2
graph.arr[1].src = 0;
graph.arr[1].dest = 2;
graph.arr[1].weight = 6;

// add edge 0-3
graph.arr[2].src = 0;
graph.arr[2].dest = 3;
graph.arr[2].weight = 5;

// add edge 1-3
graph.arr[3].src = 1;
graph.arr[3].dest = 3;
graph.arr[3].weight = 15;

// add edge 2-3
graph.arr[4].src = 2;
graph.arr[4].dest = 3;
graph.arr[4].weight = 4;

graph.Kruskal();
	}

}
