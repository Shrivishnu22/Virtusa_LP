package container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConf.class);
		ShoppingCart s = context.getBean(ShoppingCart.class);
		ShoppingCart2 s1 = context.getBean(ShoppingCart2.class);
		s.checkout("Vishnu");
		
	}

}
