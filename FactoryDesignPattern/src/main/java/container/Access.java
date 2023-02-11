package container;

import java.util.ArrayList;

public class Access {

	public static void main(String[] args) {
		communication com;
		ArrayList<Employee>	arr = createEmp();
		Mode m = new Mode();
		for(Employee e : arr) {
			com = m.getMode(e.getMode());
			com.process(e);
			System.out.println("--------------------");
		}

	}
	
	public static ArrayList<Employee> createEmp(){
		ArrayList<Employee> arr = new ArrayList<Employee>();
		arr.add(new Employee("Vishnu","abc@gmail.com",987465123,"Email"));
		arr.add(new Employee("Shri","def@gmail.com",123456789,"Phone"));
		return arr;
	}

}

//Factory design
