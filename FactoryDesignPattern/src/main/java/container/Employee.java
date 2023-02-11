package container;

public class Employee {
	private String name;
	private String email;
	private long phone;
	private String mode;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public Employee(String name, String email, long phone, String mode) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.mode = mode;
	}

}
