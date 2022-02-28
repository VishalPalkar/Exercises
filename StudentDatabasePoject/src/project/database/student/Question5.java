package project.database.student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class Question5 {
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
	public void nullproject()
	{
		try
		{
			
			java.sql.Statement selectStmt = c().createStatement();
		    ResultSet rs = ((java.sql.Statement) selectStmt).executeQuery("SELECT * from Student as s left join StudentProject as sp on  s. st_no = sp.st_no where prj_no is null");
			
			while(rs.next()) { 
		    	System.out.print("st_no : "+rs.getString(1)+"\t");
		    	System.out.print("st_name : "+rs.getString(2)+"\n");
		    }   
		}
		catch(Exception k){k.printStackTrace();}
	}
	public static void main(String[] args) {
		Question5 q= new Question5();
		q.nullproject();
	}

}
