import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class WordBreak {

	/*2
	12
	i like sam sung samsung mobile ice cream icecream man go mango
	ilike
	12
	i like sam sung samsung mobile ice cream icecream man go mango
	idontlike
	http://www.practice.geeksforgeeks.org/problem-page.php?pid=1277
	
*/	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner in = new Scanner(System.in);

		int num = in.nextInt();
		for(int i=0;i<num;i++){
			
			int size = in.nextInt();
			List<String> dict = new ArrayList<>(size);
			
			for(int j=0;j<size;j++){
				dict.add(in.next());
			}
			
			String word = in.next();
			LinkedList<Character> list = new LinkedList<>();
			for(int q=0;q<word.length();q++){
				list.add(word.charAt(q));
			}
			String temp = "";
			
			
			while(list.size()!=0){
				temp = temp+String.valueOf(list.pollFirst());
				//temp.concat(String.valueOf(list.pollFirst()));
				if(dict.contains(temp)){
					temp="";
				}
				
			}
			
			if(temp==""){
				System.out.println(1);
			}
			else{
				System.out.println(0);
			}
			
		}
		
	}

}
