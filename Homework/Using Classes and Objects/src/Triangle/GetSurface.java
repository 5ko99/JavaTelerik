package Triangle;
import java.util.Scanner;

public class GetSurface {
 public static void main(String[] args){
	 Scanner scanner = new Scanner(System.in);
	 double result=0;
	 System.out.println("Chose 1, 2 or 3");
	 int chose = scanner.nextInt();
	 switch(chose){
		 case 1 :
			 double a,hA;
			 System.out.println("a= ");
			 a=scanner.nextDouble();
			 System.out.println("hA=" );
			 hA=scanner.nextDouble();
			 result=baseAndHeight.calculate(a,hA);
			 break;
		 case 2 : 
			 double A,B,C;
			 System.out.println("a= ");
			 A=scanner.nextDouble();
			 System.out.println("b= ");
			 B=scanner.nextDouble();
			 System.out.println("c= ");
			 C=scanner.nextDouble();
			 result = lengthOfEachSide.calc(A, B, C);
			 ; break;
		 case 3 :
			 double a1,b1,h;
			 System.out.println("a=" );
			 a1=scanner.nextDouble();
			 System.out.println("b= ");
			 b1=scanner.nextDouble();
			 System.out.println("alpha= ");
			 h=scanner.nextDouble();
			 result =lengthOfEachSide.calc(a1, b1, h);
			 ; break;
		 default: System.out.println("Wrong chowe"); break;
	 }
	 System.out.printf("Area=%scm2 \n",result);
	 scanner.close();
 }
}