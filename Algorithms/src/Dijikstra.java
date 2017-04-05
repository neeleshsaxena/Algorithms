import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Dijikstra {
	
	class Node implements Comparable<Node>{
		int v;
		int dist;
		
		public Node(int v,int dist){
			this.v=v;
			this.dist = dist;
		}
		@Override
		public int compareTo(Node that){
			return this.dist - that.dist;
		}
	}
	
	
	int V;
	LinkedList<Node> arr[];
	
	public Dijikstra(int V){
		this.V =V;
		arr = new LinkedList[V];
		for(int i=0;i<V;i++){
			arr[i] = new LinkedList<>();
		}
		
	}

	public void addEdge(int u,int v,int dist){
		arr[u].add(new Node(v,dist));
		arr[v].add(new Node(u,dist));
	}
	
	
	Comparator<Map.Entry<Integer,Integer>> comp = new Comparator<Map.Entry<Integer,Integer>>() {


		@Override
		public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
			// TODO Auto-generated method stub
			return o1.getValue() - o2.getValue();
		}
		
		
	}; 
	
	public Node getNode(PriorityQueue<Node> pq,int v){
		
		Iterator it = pq.iterator();
		while(it.hasNext()){
			Node node = (Node)it.next();
			
			if(node.v==v){
				pq.remove(node);
				return node;
			}
		}
		return null;
	}
	
	public void dijik(){
		
		Node[] parent = new Node[V];
		
		
		//vertex,dist
		//List<Node> list = new LinkedList<>();
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		
		int[] dist = new int[V];
		for(int i=0;i<V;i++){
			dist[i] = Integer.MAX_VALUE;
		}
		
		//start with 0 vertex
		pq.add(new Node(0,0));
		dist[0] =0;
		
		
		while(!pq.isEmpty()){
			
			//sort every time
			Node node = pq.poll();
			int u = node.v;
			
			Iterator it = arr[u].listIterator();
			while(it.hasNext()){
				
				Node adjacentNode = (Node)it.next();
				int v = adjacentNode.v;
				int distance = adjacentNode.dist;
				
				if(dist[v]> dist[u] + distance){
					
					//if the dist for that vertex was already calculated, but a new dist has come, which is less that the previous one
					if(dist[v]!=Integer.MAX_VALUE){
						int newDist = dist[u] + distance;
						dist[v] = newDist;
						Node replaceDistofThisNode = getNode(pq, v);
						replaceDistofThisNode.dist = newDist;
						pq.add(replaceDistofThisNode);
						
						//map.replace(v, newDist);
					}
					else{
						dist[v] = dist[u] + distance;
						pq.add(new Node(v,dist[v]));
						//map.put(v, dist[v]);
					}
					
				}
			}
			
			
			
			
		}
		
		System.out.println("The shortest path is");
		
		for(int i=0;i<V;i++){
			System.out.println("i "+ i +" , dist= "+dist[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dijikstra g = new Dijikstra(9);
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
	    
	    
	    g.dijik();
	    
	    
	}

}
