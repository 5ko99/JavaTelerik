package animals;

public class cat {
	private  String name;
	private  int age;
	public int id;
	
	public cat(String name,int age,int id){
		this.age = age;
		this.name =name;
		this.id = id;
	}
	
	public  String getinfo(){
		return this.name;
	}
	
	public int getID(){
		return this.id;
	}
	
	public int getAge(){
		return this.age;
	}
}
