package animalHierarchy;

public class Dog extends Animal {

	public Dog(String name,int age,String sex) {
		setName(name);
		setAge(age);
		setSex(sex);
	}
	
	@Override
	void Sound() {
		System.out.println("Bark ");
		
	}

}
