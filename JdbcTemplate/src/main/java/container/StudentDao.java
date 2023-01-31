package container;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void insertStu(Student stu) {
		String s = "insert into student(sname,sphone,scity) values(?,?,?)";
		int insert = jdbcTemplate.update(s, stu.getStudentName(), stu.getStudentPhone(), stu.getStudentCity());
		if (insert > 0)
			System.out.println("data inserted");

	}

	public void updateNameById(String name, int id) {
		String query = "update student set sname=? where sid=?";
		int update = jdbcTemplate.update(query, name, id);
		if (update > 0) {
			System.out.println("Updated the name Successfully");
		}
	}

	public void updatePhoneById(String phone, int id) {
		String query = "update student set sphone=? where sid=?";
		int update = jdbcTemplate.update(query, phone, id);
		if (update > 0) {
			System.out.println("Updated the Phone Successfully");
		}
	}

	public void updateCityById(String city, int id) {
		String query = "update student set scity=? where sid=?";
		int update = jdbcTemplate.update(query, city, id);
		if (update > 0) {
			System.out.println("Updated the City Successfully");
		}
	}

	public void DeleteById(int id) {
		String query = "delete from student where sid=?";
		int delete = jdbcTemplate.update(query, id);
		if (delete > 0) {
			System.out.println("Deleted the" + id + " Successfully");
		}
	}

	public List<Student> getAllStudents() {
		String s = "select * from student";
		List<Student> stus = jdbcTemplate.query(s, new StudentRowMapper());
		return stus;
	}
}
