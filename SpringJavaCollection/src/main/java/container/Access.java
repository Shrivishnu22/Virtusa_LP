package container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Access {
	public static void main(String args[]){
		
		ApplicationContext a = new ClassPathXmlApplicationContext("beans.xml");
		Food f = a.getBean(Food.class);
		f.display();
		
		Book b = a.getBean(Book.class);
		b.display();
		
		Question q = a.getBean(Question.class);
		q.display();
	}

}
