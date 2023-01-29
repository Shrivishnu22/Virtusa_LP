package container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import config.BeanConfig;

public class Access {
	public static void main(String args[]){
		
		//create and use beans in Spring using the ApplicationContext and XML configuration
		
		ApplicationContext a = new ClassPathXmlApplicationContext("beans.xml");
		
		Student s = a.getBean("stu",Student.class);
		s.setId(92);
		s.setName("Vishnu");
		System.out.println(s.getId());
		System.out.println(s.getName());
		
		//Bean defined using annotation tags (@configuration and @Bean) without using XML
		ApplicationContext b = new AnnotationConfigApplicationContext(BeanConfig.class);
		Address ad = b.getBean("getAddress",Address.class);
		ad.setCountry("India");
		ad.setName("Trichy");
		System.out.println(ad.getName());
		System.out.println(ad.getCountry());
	}

}
