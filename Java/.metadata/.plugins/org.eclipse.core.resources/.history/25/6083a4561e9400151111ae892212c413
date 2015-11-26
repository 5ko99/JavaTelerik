package People;

public class Person {
	private String name;
	private int age;
	public Person(String name){
		this(name,0);
	}
	public Person(String name,int age){
		this.SetName(name);
		this.SetAge(age);
	}
	
	public String getName(){
		return this.name;
	}
	public void SetName(String value){
		if((value==null) || (value=="") )
		{
			throw new IllegalArgumentException("Invalid name");
		}
		else{
			this.name=value;
		}
		
	}
	
	public int getAge(){
		return this.age;
	}
	
	public void SetAge(int value){
		if(value<0)
		{
			throw new IllegalArgumentException("Invalid name");
		}
		else{
			this.age=value;
		}
		
	}
	
	
	
}
