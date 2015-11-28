public class Anonim  {
	public static void main(String[] args){
		IrandomProvider random = new IrandomProvider() {
			@Override
			public double Get(int a) {
				// TODO Auto-generated method stub
				return (Math.random()*a)pр;
			}
			public char[] ch ={'a','b','c','d'};
			
		
		};
		StringBuilder password = new StringBuilder();
		for (int i = 0; i < 6; i++) {
			int pos = (int)random.Get(3);
			password.append(random.ch[(int)random.Get(4)]);
		}
		System.out.println(password.toString());
}
}