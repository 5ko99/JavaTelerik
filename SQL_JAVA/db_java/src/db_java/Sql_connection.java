package db_java;
import java.sql.*;
import java.util.Scanner;
public class Sql_connection {
	
	public static void main(String[] args){
		try{
			Class.forName("oracle.jdbc.OracleDriver");
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println(e);
		}
		
			Connection connection = null;
			try {
				connection = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:db1","evlogi","system");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
			Statement statement = null;
			try {
				statement = connection.createStatement();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			String sqlQuery = "select FIRST_NAME, SALARY from PERSON where SALARY<400";
		
			
				
			ResultSet result = null;
			try {
				 result = statement.executeQuery(sqlQuery);
				while(result.next()){
					String name = result.getString("first_name");
					String salary = result.getString("salary");
					System.out.print(name+" Salary=");
					System.out.println(salary+"$");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			Scanner s = new Scanner(System.in);
			System.out.print("Enter name: ");
			String name = s.nextLine();
			System.out.println();
			String sqlUpdate = "UPDATE Person SET  FIRST_NAME = '" + name + "' WHERE ADRESS_ID=1";
			try {
				result = statement.executeQuery(sqlUpdate);
				while(result.next()){
					
				}
			} catch (SQLException e1) {
				System.out.println(e1.getStackTrace());
			}
			System.out.println("New name of Bulgarian is "+ name);
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
}
