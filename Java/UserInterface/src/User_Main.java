import java.io.*;
import java.util.*;


public class User_Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int choise;
		System.out.print("0:Register \n1:Login \n2:RemoveAccaount \nChoise=");
		choise = scanner.nextInt();
		
		switch(choise){
		 case 0:{
			 	System.out.print("Username:");
			    String username = scanner.next();
			    System.out.print("Password:");
				String password = scanner.next();
				Register(username,password);
				break;
			}
		 
		 case 1:{
			 	System.out.print("Username:");
			    String username = scanner.next();
			    System.out.print("Password:");
				String password = scanner.next();
			 Login(username,password);
			 break;
		 }
		 
		 case 2:{
			 	System.out.print("Username:");
			    String username = scanner.next();
			    System.out.print("Password:");
				String password = scanner.next();
			 Remove(username,password);
			 break;
		 }
		 
		 default:{
			 System.out.println("Please enter only '1' '2' or '3' !");
			 break;
		 }
		 
		}
		scanner.close();
	}
	
	public static void Register(String username,String password){
		try {
		    //create a temporary file
		    String user = username+password+"\n";
		    File logFile=new File("database");

		    BufferedWriter writer = new BufferedWriter(new FileWriter(logFile,true0));
		    writer.write (user);

		    //Close writer
		    writer.close();
		} catch(Exception e) {
		    e.printStackTrace();
		}
		System.out.println("Successful register now you are registered and login!");
		Login(username,password);
	}
	
	
	public static void Login(String username,String password){
		try {
			String user = username+password+"\n";
			BufferedReader reader = new BufferedReader(new FileReader("database"));
			String line;
			try {
				while((line = reader.readLine()) != null)
				{
				    if(user==line){
				    	Logged(username,password);
				    }
				}
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void  Remove(String username,String password){
		
	}
	
	public static void Logged(String username,String Password){
		System.out.print("Hello ");
		System.out.print(username);
		System.out.print("! You are logged");
	}
	
}