package container;

public class Email implements communication{

	public void process(Employee e) {
		System.out.println("Communicate "+e.getName()+" via "+e.getEmail());
		
	}

}
