package People;

public class Employer extends Person {
	private String company;
	private double salary;
	public Employer(String name,int age,String company){
		this(name,age,company,240.);
	}
	
	public Employer(String name,int age,String company,double salary){
		super(name,age);
		this.setCompany(company);
		this.setSalary(salary);
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
