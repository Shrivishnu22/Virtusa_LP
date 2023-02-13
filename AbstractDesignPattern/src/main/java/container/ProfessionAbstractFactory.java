package container;

public class ProfessionAbstractFactory extends AbstractFactory {
public Professions getProfession(String typeOfProfession)
{

	  if(typeOfProfession.equalsIgnoreCase("Teacher"))
		return  new Teacher();
	  if(typeOfProfession.equalsIgnoreCase("Doctor"))
			return  new Doctor();
	  return null;
	  
}
}
