import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class LongestKUniqueCharsSubstring {
	
	
public static int getMySubString(String s,int k){
		
		int l=s.length();
        Map<Character,Integer> map = new HashMap<>();
        int maxWindowSize = Integer.MIN_VALUE, u=0;
        Queue<Character> queue = new LinkedList<>();
        String str=null;
        for (int currStart=0,currEnd=0; currEnd < l; currEnd++) {
            char c = s.charAt(currEnd);
            if(!map.containsKey(c)){
            	u++;
            }
            map.replace(c, map.get(c) + 1);
            if(u>k) {
                int prevCurrStart = currStart;
                while (u > k) {
                    while (map.get(s.charAt(prevCurrStart))  != 0) {
                    	map.replace(s.charAt(currStart), map.get(currStart) -1);
                        prevCurrStart = currStart;
                        currStart++;
                    }
                    u--;
                }
            }
            else if (u==k){
                int len=currEnd-currStart+1;
                if(len>maxWindowSize)
                {
                    maxWindowSize=len;
                    str=s.substring(currStart,currEnd+1);
                    System.out.println(str);
                }
            }
        }

        if(u<k)
            return -1;
        else return str.length();
		
	}

	
	//http://www.geeksforgeeks.org/find-the-longest-substring-with-k-unique-characters-in-a-given-string/
	public static String unique2CharSubstring(String str, int k) {
        String result = "";
        int len = str.length();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] c = str.toCharArray();
        int right = 0, max = 0;
        LinkedList<Character> queue = new LinkedList<Character>();
        for (int left = 0; left < len; left++) {
            while (right < len) {
                if (!map.containsKey(c[right])) {
                    queue.add(c[right]);
                }
                map.put(c[right], right);
                if (map.size() > k) {
                    left = Math.max(left, map.get(queue.peek()) + 1);
                    map.remove(queue.pop());
                }
                if(map.size() == k){
                	if(right - left > max){
                		max = right - left;
                		result = str.substring(left, right + 1);
                        System.out.println(result);
                	}
                	
                }
                
                right++;
            }
        }
        return result;
    }
	
	
	//correct method
	public static int getSubString(String s,int k){
		
		int l=s.length();
        int hasFound[]=new int[26];
        int maxWindowSize = Integer.MIN_VALUE, u=0;
        String str=null;
        for (int currStart=0,currEnd=0; currEnd < l; currEnd++) {
            char c = s.charAt(currEnd);
            if(hasFound[c-'a']==0) u++;
            hasFound[c-'a']++;
            if(u>k) {
                int prevCurrStart = currStart;
                while (u > k) {
                    while (hasFound[s.charAt(prevCurrStart) - 'a'] != 0) {
                        hasFound[s.charAt(currStart) - 'a']--;
                        prevCurrStart = currStart;
                        currStart++;
                    }
                    u--;
                }
            }
            else if (u==k){
                int len=currEnd-currStart+1;
                if(len>maxWindowSize)
                {
                    maxWindowSize=len;
                    str=s.substring(currStart,currEnd+1);
                    System.out.println(str);
                }
            }
        }

        if(u<k)
            return -1;
        else return str.length();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		for(int i=0;i<num;i++){
		    
		   String str = in.next();
		   int k = in.nextInt();
		   
		   //getSubString(str, k);
		   //String str1 = unique2CharSubstring(str, k);
		   int len = getSubString(str, k);
		   System.out.println(len);
		   //int len1 = getMySubString(str, k);
		   //System.out.println(len1);
		   /*
		   String result = unique2CharSubstring(str,k);
		    if(result.length()!=0){
		        System.out.println(result.length());
		    }else if(k==1){
		        System.out.println(1);
		    }else{
		         System.out.println(-1);
		    }*/
		    
		}
	}

}
