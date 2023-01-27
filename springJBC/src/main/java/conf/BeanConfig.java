package conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import container.Professor;
import container.Student;
@Configuration
public class BeanConfig {
	@Bean
	public Professor getProfessor() {
		return new Professor();
	}
	@Bean
	public Student getStudent() {
		return new Student();
	}
}
