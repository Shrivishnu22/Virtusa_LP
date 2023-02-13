package container;

public class AccessClient {

	public static void main(String[] args) {
		AbstractFactory abstractFactory=AbstractFactoryProducer.getProfession(true);
		  
		 Professions p= abstractFactory.getProfession("docTor");
		 p.print();
		 
		  
	}

}
