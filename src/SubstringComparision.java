import java.util.TreeSet;

public class SubstringComparision {
	public static void main(String[] args) {
		String s = "welcometojava";
		int k = 3;
		TreeSet<String> set = new  TreeSet<>();
		for(int i = 0; i <= s.length()-k; i++) {
			String p = s.substring(i, i+k);
			set.add(p);
			
		}
		System.out.println(set.first());
		System.out.println(set.last());
	}

}
