
public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setName("Elif");
		student1.setSurname("Eryiðit");
		student1.setEmail("sjahfhgdfhf");
		student1.setUniversity("Harran");
		student1.setEducationLevel(1);
		
		Instructor instructor1 = new Instructor();
		instructor1.setName("Engin");
		instructor1.setSurname("Demiroð");
		instructor1.setEmail("jdjhfjfhj");
		instructor1.setEducationId(2);
		instructor1.setEducation("Java");
		
		System.out.println(student1.getName() + " sistemde");
		
		System.out.println(instructor1.getName() + " hocanýn " + instructor1.getEducation() + " dersi");
		
		UserManager[] users = new UserManager[] { new InstructorManager(), new StudentManager() };
		for(UserManager user:users )
		{
			user.add("eklendi");
		}
				
	}

}
