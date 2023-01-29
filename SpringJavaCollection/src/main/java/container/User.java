package container;

public class User {
	private int rollno;
	private String name, dept;

	public User() {
	}

	public User(int rollno, String name, String dept) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.dept = dept;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "rollno=" + rollno + ", name=" + name + ", dept=" + dept;
	}
}
