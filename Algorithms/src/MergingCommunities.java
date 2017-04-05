import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MergingCommunities {

	
	private int[] parent;
	private int[] rank;
	private Map<Integer,Integer> map;
	
	public MergingCommunities(int n){
		
		parent = new int[n+1];
		rank = new int[n+1];
		map = new HashMap<>();
		
		for(int i=1;i<=n;i++){
			parent[i] = i;
			map.put(i, 1);
		}
		
		
		
	}
	
	private int find(int i){
		
		if(parent[i]!= i){
			
			parent[i] = find(parent[i]);
			
			
		}
		
		return parent[i];
		
	}
	
	
	private void union(int i,int j){
		
		int xRoot = find(i);
		int yRoot = find(j);
		
		if(xRoot!= yRoot){
			
			if(rank[xRoot]>rank[yRoot]){
				parent[yRoot] = xRoot;
				map.replace(xRoot, map.get(xRoot) + map.get(yRoot));
				map.remove(yRoot);
				
			}
			
			else if(rank[xRoot]<rank[yRoot]){
				parent[xRoot] = yRoot;
				map.replace(yRoot, map.get(yRoot) + map.get(xRoot));
				map.remove(xRoot);
				
			}
			else{
				//assign any
				parent[yRoot] = xRoot;
				
				rank[xRoot] = rank[xRoot] +1;
				
				map.replace(xRoot, map.get(xRoot) + map.get(yRoot));
				
			}
			
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int len = in.nextInt();
		MergingCommunities mCom = new MergingCommunities(n);
		
		for(int i =0;i<len;i++){
			
			
			String ch = in.next();
			
			
			
			if(ch.equals("Q")){
				
				int num = in.nextInt();
				
				int parent = mCom.find(num);
				int size = mCom.map.get(parent);
				
				System.out.println(size);
			}
			else if(ch.equals("M")){
				
				int k = in.nextInt();
				int j = in.nextInt();
				
				mCom.union(k, j);
				
			
				
				
				
			}
			
			
		}
		
		
		
		
	}

}
