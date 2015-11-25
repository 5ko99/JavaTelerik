package Animals;

public  class dog {
	private String name;
	private String owner;
	
	public dog(String name, String owner){
		this.name=name;
		this.owner=owner;
	}
	public  String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name=name;
	}
}
