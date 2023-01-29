package container;

public class Address {
	private String name;
	private String country;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public Address() {}
	
	public Address(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}
	
	

}
