package animalHierarchy;

public class Frog extends Animal {

	
	public Frog(String name,int age,String sex) {
		setName(name);
		setAge(age);
		setSex(sex);
	}
	
	@Override
	void Sound() {
		System.out.println("Kwaa ");
		
	}

}
