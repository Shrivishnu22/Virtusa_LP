package container;

public class Mode {
	public communication getMode(String mode) {
		if(mode.equalsIgnoreCase("Email"))
			return new Email();
		if(mode.equalsIgnoreCase("Phone"))
			return new Phone();
		return null;
	}
}
