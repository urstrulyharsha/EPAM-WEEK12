import java.util.*;
import java.util.stream.Collectors;

public class StartsWithA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l = new ArrayList<String>();
		l.add("abcd");
		l.add("adc");
		l.add("abc");
		l.add("abcda");
		l=search(l);
        for(String i:l)
            System.out.println(i);
		}
	static List<String> search(List<String> l) {
        return l.stream().filter(s -> s.startsWith("a")).filter(s -> s.length()==3).collect(Collectors.toList());
    }
}
