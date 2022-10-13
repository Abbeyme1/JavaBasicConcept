import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@CustomAnnotation
public class Annotations {

	@CustomAnnotation
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException  {
		// TODO Auto-generated method stub

		
		@SuppressWarnings("unused")
		int a = 5;
		
		
		Animal animal = new Animal("abcd ",5);
		
		System.out.println(CustomAnnotation.class);
		
		System.out.println(animal.getClass().isAnnotationPresent(CustomAnnotation.class));
		
		
		for(Method m : animal.getClass().getDeclaredMethods())
		{
			if(m.isAnnotationPresent(RunIt.class))
			{
				RunIt annotation = m.getAnnotation(RunIt.class);
				
				for(int i = 0 ;i < annotation.times(); i++)
					m.invoke(animal,null);
			}
		}
		
		
		
		for(Field field : animal.getClass().getDeclaredFields())
		{
			if(field.isAnnotationPresent(ForStrings.class))
			{
				Object val = field.get(animal);
				
				if(val instanceof String)
				{
					 String str = val.toString();
					 System.out.println(str.toUpperCase());
				}
			}
		}
		
		
	}

}


@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface CustomAnnotation {
	
}

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface RunIt {
	int times() default 1;
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@interface ForStrings {
	
}


@CustomAnnotation
class Animal {
	
	@ForStrings
	String name;
	int age;
	
	public Animal(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	@RunIt(times = 3)
	public void walk() {
		System.out.println("walking...");
	}
	
	public void eat()
	{
		System.out.println("eating...");
	}
}





@CustomAnnotation
interface A {
	
}