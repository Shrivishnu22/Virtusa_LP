package container;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import conf.BeanConfig;

public class Main {
	public static void main(String[] args) {
		ApplicationContext a = new AnnotationConfigApplicationContext(BeanConfig.class);
		Professor p = a.getBean(Professor.class);
		p.setId(33);
		p.setName("Tony");
		
		System.out.println(p.getId()+" "+p.getName());
		
		Student s = a.getBean(Student.class);
		s.setId(92);
		s.setName("Vishnu");
		
		System.out.println(s.getId()+" "+s.getName());
	}	
}
