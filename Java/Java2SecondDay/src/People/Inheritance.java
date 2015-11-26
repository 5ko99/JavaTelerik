package People;


public class Inheritance {
	public static void main(String[] args){
		Person person = new Person("Stamat",15);
		System.out.println(person.getName());
		Student student = new Student("Petyr","Ivan Vazov SOU",15);
		System.out.println(student.getName());
		Employer employer = new Employer("Petko",16,"Telerik",3800);
		System.out.println(employer.getCompany()+" "+ employer.getSalary());
	}
}
