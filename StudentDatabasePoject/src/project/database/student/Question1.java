package project.database.student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class Question1 {
	private Connection con;
	Scanner sc =new Scanner(System.in);
	public Connection c()
	{
		try {
			
			con=DriverManager.getConnection("jdbc:mysql://localhost/Student_Project","root","password");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return con;
	}
	public void displaystudent()
	{
		try
		{
		    java.sql.Statement selectStmt = c().createStatement();
		    ResultSet rs = ((java.sql.Statement) selectStmt).executeQuery("SELECT * FROM Student");
		    while(rs.next()) { 
		    	System.out.print("st_no : "+rs.getString(1)+"\t");
		    	System.out.print("st_name : "+rs.getString(2)+"\t");
		    	System.out.print("st_dob : "+rs.getDate(3)+"\t");
		    	System.out.print("st_doj : "+rs.getDate(4)+"\n");
		    }    
		}
		catch(Exception e){e.printStackTrace();}
		
	}
	public static void main(String[] args) {
		Question1 q= new Question1();
		q.displaystudent();

	}

}
