package container;

public class Phone implements communication {

	public void process(Employee e) {
		System.out.println("Communicate "+e.getName()+" via "+e.getPhone());		
	}

}
