import java.io.*;

public class Console_Input {
	public static void main(String[] args) throws IOException{
		//InputStreamReader reader = new InputStreamReader(System.in);
		//char charCode = (char)reader.read();
		//System.out.println(charCode);
		
	//	char buffer[] =new char[5000];
		// int charsReadCount =reader.read(buffer);
		//for( int i=0;i<charsReadCount;i++)
		//{
			//System.out.print(buffer[i]);
		//}
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(reader.readLine());
		System.out.println(num+1);
	}
}
