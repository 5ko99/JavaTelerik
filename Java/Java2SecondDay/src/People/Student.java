package People;
public class Student extends Person {
	private String school;
	public Student(String name,String school,int age){
		super(name,age);
		this.school=school;
	}
	public String getSchool(){
		return this.school;
	}
	public void SetSchool(String value){
		
			this.school=value;
		
	}
	
}
