package container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		 BuiltIn b= (BuiltIn) context.getBean("bi");
		 
		 System.out.println("the random number is: "+b.getRandom());
		 System.out.println("the pi value is: "+b.getPi());
		 System.out.println("Name value from MyStatic class: "+b.getGetName());
		 System.out.println("City value from MyStatic class: "+b.getGetCity());


	}

}
