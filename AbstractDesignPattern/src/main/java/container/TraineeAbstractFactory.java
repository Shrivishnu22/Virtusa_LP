package container;

public class TraineeAbstractFactory extends AbstractFactory {
public Professions getProfession(String typeOfProfession)
{

	  if(typeOfProfession.equalsIgnoreCase("Teacher"))
		return  new TraineeTeacher();
	  if(typeOfProfession.equalsIgnoreCase("Doctor"))
			return  new TraineeDoctor();
	  return null;
	  
}
}
