package Geometry;

public class Utility {
	public static class Validator{
		private static Boolean isTrue;
		public static Boolean isPositive(int value){
			if(value<0){
				isTrue=false;
			}
			else{
				isTrue=true;
			}
			return isTrue;
		}
	}
}
