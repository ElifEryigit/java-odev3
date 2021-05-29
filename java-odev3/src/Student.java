
public class Student extends User {
	
	private int educationLevel;
	private String university;
	
	public Student() {} 
	
	public Student(int educationLevel, String university) {
		super();
		this.educationLevel = educationLevel;
		this.university = university;
	}

	public int getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(int educationLevel) {
		this.educationLevel = educationLevel;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

}
