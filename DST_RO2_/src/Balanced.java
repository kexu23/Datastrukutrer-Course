import java.util.LinkedList;
import java.util.Queue;

public class Balanced {

	public static void main(String[] args) {
		System.out.println(isBalanced("{[()()[]()]}"));
		System.out.println(isBalanced("{[()]}"));
		System.out.println(isBalanced("{[()]"));

	}

	public static boolean isBalanced(String s) {
		LinkedList<Object> linkedList = new LinkedList<>();
		if (null == s || (s.length() % 2) != 0) {
			return false;
		}
		else{
			char[] ch = s.toCharArray();
			for (char c : ch){
				if(!(c == '{' || c == '[' || c == '(' || c == '}' || c == ']' || c == ')')){
					return false;
				}
			}
		}
		while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
			s = s.replaceAll("\\(\\)", "")
					.replaceAll("\\[\\]", "")
					.replaceAll("\\{\\}", "");
		}
		if (s.length() != 0){
			return false;
		}
		// Add your code here
		
		// Note: s.length() will return the number of characters
		// in the String s
		//
		// s.charAt(i) will return the char at index i in the
		// String s
		
		return true;
	}
}
