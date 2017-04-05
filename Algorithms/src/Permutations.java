import java.util.Arrays;

public class Permutations {
	
	public static char[] comArr;
	
	public static void powerSet(char[] arr)
	{
	    for (int i = 0; i < arr.length; ++i)
	    {
	        char[] branch = new char[i];
	        combine(arr, i, 0, branch, 0);
	    }    
	}

	public static void generatePermutations(char[] arr, int size, char[] branch, int level, boolean[] visited)
	{
	    if (level >= size-1)
	    {
	        System.out.println(branch);
	        return;
	    }
	    
	    for (int i = 0; i < size; i++)
	    {
	        if (!visited[i])
	        {
	            branch[++level] = arr[i];
	            visited[i] = true;
	            generatePermutations(arr, size, branch, level, visited);
	            visited[i] = false;
	            level--;
	        }
	    }
	}
	
	//http://exceptional-code.blogspot.com/2012/09/generating-all-permutations.html
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "EGKES";
		int n = str.length();
		char[] arr = str.toCharArray();
		boolean[] visited = new boolean[n];
		
		char[] branch = new char[n];
		generatePermutations(arr, n, branch, -1, visited);
		
		//int k=2;
		/*for(int k=2;k<n;k++){
		combine(arr, k, 0, branch, 0);
		}*/
		//powerSet(arr);
		

	}
	
	public static void combine(char[] arr, int k, int startId, char[] branch, int numElem)
	{
	    if (numElem == k)
	    {
	        System.out.println(Arrays.toString(branch));
	        return;
	    }
	    
	    for (int i = startId; i < arr.length; ++i)
	    {
	        branch[numElem++] = arr[i];
	        combine(arr, k, ++startId, branch, numElem);
	        --numElem;
	    }
	}

}
