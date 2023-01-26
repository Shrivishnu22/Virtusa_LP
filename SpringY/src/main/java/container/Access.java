package container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Access {
	public static void main(String args[]){
		
		ApplicationContext a = new ClassPathXmlApplicationContext("beans.xml");
		
		Student s = a.getBean("stu",Student.class);
		System.out.println(s.getId());
		System.out.println(s.getName());
	}

}
