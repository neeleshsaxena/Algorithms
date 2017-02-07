import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PDFHighlighter {
	/*input as -> 1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
	abc*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int[] heights = new int[26];
	
		for(int i = 0;i<26;i++){
			heights[i] = in.nextInt();
		}
		String word = in.next();
		
		Map<Character,Integer> map = new HashMap<>();
		
		int ch=0;
		for(char j='a';j<='z';j++){
			map.put(j, heights[ch]);
			ch++;
		}
		
		int max =0;
		for(int br=0;br<word.length();br++){
			int h = map.get(word.charAt(br));
			if(h>max){
				max = h;
			}
		}
		
		int width = word.length();
		int height = max;
		int area = width*height;
		
		System.out.println(area);

	}

}
