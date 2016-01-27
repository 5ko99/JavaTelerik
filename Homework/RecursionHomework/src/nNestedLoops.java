
public class nNestedLoops {
	public static void main(String[] args){
		int n = 3;
		Rec(n,1,1);
	}
	
	public static void Rec(int n,int p,int q){
		//Дъно
		if (n+1==p){
			return;
		}
		
			System.out.print(p+" "+q+" ");
			if(q==n){
				p++;
				q=1;
				System.out.println();
			}
			else{
				q++;
				System.out.println();
			}
			
			Rec(n,p,q);
		
	}
}
