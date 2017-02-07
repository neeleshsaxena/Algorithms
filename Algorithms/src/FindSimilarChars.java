import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class FindSimilarChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in = new Scanner(System.in);
	    int num = in.nextInt();   
		String str = in.next();
		
		Set<Character> set = convertToCharSet(str);
		
		
		for(int i=1;i<num;i++){
			
			set.retainAll(convertToCharSet(in.next()));
			
		}
		
		
		System.out.println(set.size());
		
	
	}
	
	public static Set convertToCharSet(String a){
		Set<Character> set = new HashSet<Character>();
		for(int i=0;i<a.length();i++){
			set.add(a.charAt(i));
		}
		return set;
		
	}

}
