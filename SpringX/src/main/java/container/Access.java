package container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Access {
	public static void main(String args[]){
		
		ApplicationContext a = new ClassPathXmlApplicationContext("beans.xml");
		
		Car car = a.getBean("c",Car.class);
		Bike bike = a.getBean("b",Bike.class);
		
		car.getWheel();
		bike.getWheel();
		
		
		/* Implemented using Interface [Low Dependency] 
		 
		Vehicle cr = new Car();
		cr.getWheel();
		Vehicle bk = new Bike();
		bk.getWheel(); 
		*/
		
		/* Implemented using class [High dependency]
		 
		 Car c = new Car();
		 c.getWheel();
		 Bike b = new Bike();
		 b.getWheel();
		 
		 */
	}

}
