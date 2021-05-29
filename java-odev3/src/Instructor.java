
public class Instructor extends User {
	
	private String education;
	private int educationId;
	
	public Instructor() {} 
	
	public Instructor(String education, int educationId) {
		super();
		this.education = education;
		this.educationId = educationId;
	}
	
	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public int getEducationId() {
		return educationId;
	}

	public void setEducationId(int educationId) {
		this.educationId = educationId;
	}

	
	

	
}
