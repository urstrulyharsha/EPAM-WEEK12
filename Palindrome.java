import java.util.*;
import java.util.stream.IntStream;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l=new ArrayList<String>();
        l.add("ababa");
        l.add("adda");
        l.add("abcdea");
        l.add("abccba");
        l=palindrome(l);
        for(String i:l)
            System.out.println(i);

	}
	static List<String> palindrome(List<String> l)
    {
        List<String> k=new ArrayList<String>();
           for(String i:l)
           {String t = i.replaceAll("\\s+", "").toLowerCase();
            if( IntStream.range(0,t.length()/2).noneMatch(j -> t.charAt(j)!= t.charAt(t.length()-j-1)))
                k.add(i);}
            return k;
    }

}
