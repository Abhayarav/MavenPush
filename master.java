import java.util.*;

public interface Java8
{
	public static void main(String args[])
	{
		Integer i1 = 33;	
		Integer i2 = 22;	
		
		Optional<Integer> o1 = Optional.ofNullable(i1);
		Optional<Integer> o2 = Optional.ofNullable(i2);

		add(o1, o2);
	}
	public static void add(Optional<Integer> a, Optional<Integer> b)
	{
		Integer i1 = a.orElse(new Integer(0));
		Integer i2 = b.orElse(new Integer(0));

		System.out.println(i1 + i2);
	}
	
}


