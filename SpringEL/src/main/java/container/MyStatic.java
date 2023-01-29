package container;

public class MyStatic {
	private static String name,city;

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		MyStatic.name = name;
	}

	public static String getCity() {
		return city;
	}

	public static void setCity(String city) {
		MyStatic.city = city;
	}
	
}
