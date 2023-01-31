package container;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentDao st = (StudentDao) context.getBean("stuDaoImpObj");
		Student s = new Student();
//		s.setStudentName("Vishnu");
//		s.setStudentPhone("123456789");
//		s.setStudentCity("Trichy");
//		st.insertStu(s);
//		st.updateNameById("Akshya", 3);
//		st.DeleteById(3);

		List<Student> sl = st.getAllStudents();
		for (Student ss : sl)
			System.out.println(ss.getStudentId() + " " + ss.getStudentName() + " " + ss.getStudentPhone() + " "
					+ ss.getStudentCity());
	}

}
