import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AssignCookies {

	/*455. Assign Cookies
	https://leetcode.com/problems/assign-cookies/?tab=Description
*/	
	
	public static int findContentChildren(int[] g, int[] s) {

		Arrays.sort(g);
		Arrays.sort(s);

		int i = 0;
		int count = 0;
		for (int j = 0; i < g.length && j < s.length; j++) {
			if (g[i] <= s[j]) {
				count++;
				i++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] g = {10,9,8,7,10,9,8,7};
		int[] s = {10,9,8,7};
	
	
		int count = findContentChildren(g, s);
		System.out.println(count);
	}

}
