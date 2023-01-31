package com.sample.model;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Access {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		//Calculation of perimeter of a rectangle 
		Perimeter p = (Perimeter) context.getBean("periObj");
		System.out.println("the Perimeter is number is: " + p.getPerimeter());

		//Mark Calculation
		Result r = (Result) context.getBean("resObj");
		System.out.println(r.getResultMsg());
		System.out.println("Pass Status : "+r.getHasPassed());
		
		//Email Validation 
		EmailValidator e = (EmailValidator) context.getBean("emailObj");
		System.out.println(e.getIsValidEmail());
		
		//Display of student details
		StudentListAccessor s = (StudentListAccessor) context.getBean("studentAccObj");
		System.out.println("Third student of the list "+s.getThirdStudentInList().getName() + " " + s.getThirdStudentInList().getMarks());
		List<Student> fstu = s.getFailedStudent();
		System.out.println("Failed Students List : ");
		for (Student s1 : fstu)
			System.out.println(s1.getName() + " " + s1.getMarks());
		List<String> snames = s.getStudentNames();
		System.out.println("Students List : ");
		for (String n : snames)
			System.out.println(n);

		//Fetching Telephone number using name
		TeletphoneDir t = (TeletphoneDir) context.getBean("teledirObj");
		System.out.println("Telephone associate with named 'Sai' : "+t.getPhoneNumber());

	}

}
