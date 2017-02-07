import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FindPhoneNumber {

	//1-800-gofedex
	public static void main(String[] args) {
		

		Scanner in = new Scanner(System.in);
		
		String string = in.next();
		
		Map<String,String> map = new HashMap<>();
		
		map.put("[a-c]","2");
		map.put("[d-f]","3");
		map.put("[g-i]","4");
		map.put("[j-l]","5");
		map.put("[m-o]","6");
		map.put("[p-s]","7");
		map.put("[t-v]","8");
		map.put("[w-z]","9");
		
	
		
		
		
		/*map.put("[a-c]", "2");
		map.put("[d-f]", "3");
		map.put("[g-i]", "4");
		map.put("[j-l]", "5");
		map.put("[m-o]", "6");
		map.put("[p-s]", "7");
		map.put("[t-v]", "8");
		map.put("[w-z]", "9");
		
		
		
		Iterator it = map.keySet().iterator();
		while(it.hasNext()){
			String key = (String)it.next();
			String num = (String)map.get(key);
			string = string.replaceAll(key, num);
			
		}*/
		
		
		
		System.out.println(string);
	}

}
