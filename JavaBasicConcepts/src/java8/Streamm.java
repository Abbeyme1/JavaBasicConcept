package java8;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streamm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> l = Arrays.asList(1,2,3,4,5);
		
		
//		Consumer<Integer> c = new Consumer<Integer>() {
//			
//			public void accept(Integer i)
//			{
//				System.out.println(i);
//			}
//			
//		};
		
		Consumer<Integer> c = i -> System.out.println(i);
		
		
		// internal iteration
		l.forEach(c);
//		l.forEach(i -> System.out.println(i));
	
		
		l.forEach(System.out::println);
		
		l.forEach(Streamm::square);
		
//		l.stream().filter(i -> {
//			
//			System.out.println("yes"+ i);
//			
//			return true;
//		}).forEach(e -> {
//			System.out.println("yes ");
//		});
		
		
		System.out.println(l.stream().filter(i -> {
			
			System.out.println("yes");
			return true;
		}).findFirst().orElse(0));
		
		System.out.println("---");
		
		System.out.println(l.stream().filter(i -> {
			
			System.out.println("yes");
			return false;
		}).findFirst());
		
		System.out.println("---");

		
		System.out.println(l.stream().filter(i -> {
			
			System.out.println("yes");
			return false;
		}).findFirst().orElse(0));
		
		
		
		Function<Integer, Integer> fun = new Function<Integer, Integer>() {

			public Integer apply(Integer t) {
				return t*2;
			}
			
			
		};
		l.stream().map(fun);
		
		
		// WE CAN USE STREAM ONLY ONCE
		
		Stream<Integer> stream = l.stream();
		
		stream.forEach(System.out::println);
//		stream.forEach(System.out::println); //IllegalStateException
		
		
		BinaryOperator<Integer> bo = new BinaryOperator<Integer>() {

			public Integer apply(Integer t, Integer u) {
				return t+u;
			}
		};
		 
		
		System.out.println("sum");
		// find sum of elements in list
		System.out.println(l.stream().reduce(0,bo));
		System.out.println(l.stream().reduce(0,(a,b) -> a+b)); // (c,e) -> c+e)
		System.out.println(l.stream().reduce(0,(a,b) -> Integer.sum(a, b)));
		System.out.println(l.stream().reduce(0,Integer::sum));
		
		// sum of even values in list
		System.out.println(l.stream().filter(e -> e%2 == 0).reduce(0, Integer::sum));
		
		
		
		Predicate<Integer> pre = new Predicate<Integer>() {
			public boolean test(Integer t) {
				return t%2 == 0;
			}
		};
		System.out.println(l.stream().filter(pre).reduce(0, Integer::sum));
		
		
		System.out.println("------------------");
		
		
		
		List<Integer> list = Arrays.asList(11, 21, 5,12,20,78,11,4);
		
		System.out.println(list.stream().filter(Streamm::isModFive).map(Streamm::doublee).findFirst().orElse(0));
		
		
		
		System.out.println("Parellel ");
		System.out.println(list.parallelStream().filter(Streamm::isModFive).map(Streamm::doublee).findFirst().orElse(0));
		
		
		System.out.println("Parelled Stream.....");
		
		long start = 0;
		long end = 0;
		
		start = System.currentTimeMillis();
		IntStream.range(1, 1000).forEach(System.out::print);
		end = System.currentTimeMillis();
		
		System.out.println();
		System.out.println("single stream : "+  (end - start));
		
		
		start = System.currentTimeMillis();
		IntStream.range(1, 1000).parallel().forEach(System.out::print);
		end = System.currentTimeMillis();
		System.out.println();
		System.out.println("parallel stream : "+  (end - start));
		
		
		
	
		
		
		
		
	}
	
	public static int doublee(int i)
	{
		System.out.println(i + " double ");
		return i*2;
	}
	
	public static boolean isModFive(int i)
	{
		System.out.println(i + " % 5 ");
		return i%5==0;
	}
	
	public static void square(int i)
	{
		System.out.println(i*i);
		
	}

}


