package animals;

public class program {
	public static void main(String[] args){
		cat[] a=new cat[5];
		String name[]={
				"Pesho",
				"Gosho",
				"Ivanchou",
				"Mitko",
				"Pesho"
		};
		
		for(int i=0;i<a.length;i++){
			a[i]=new cat(name[i],i+2,i);
			System.out.println(a[i].getinfo());
		}
		System.out.println(a[2].id);
		System.out.println(a[2].getID());
		System.out.println(a[2].getAge());
	}
}