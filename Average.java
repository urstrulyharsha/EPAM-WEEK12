package average;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream s=IntStream.of(121,151,171,191,181,211,212,265,242,262);
        OptionalDouble d=s.average();
        if(d.isPresent())
        {
            System.out.println("The average og given list of integers is "+d.getAsDouble());
        }
        else
        {
            System.out.println(-1);
        }

	}

}
