package container;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student> {

	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student s = new Student();
		s.setStudentId(rs.getInt("sid"));
		s.setStudentName(rs.getString("sname"));
		s.setStudentPhone(rs.getString("sphone"));
		s.setStudentCity(rs.getString("scity"));
		return s;
	}

}
