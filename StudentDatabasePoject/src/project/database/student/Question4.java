package project.database.student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class Question4 {
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
	public void groupby()
	{
		try
		{
		    java.sql.Statement selectStmt = c().createStatement();
		    ResultSet rs = ((java.sql.Statement) selectStmt).executeQuery("select st_no,count(st_no) from StudentProject group by st_no having count(prj_no)>1");
		    while(rs.next()) { 
		    	System.out.print("st_no : "+rs.getString(1)+"\t");
		    	System.out.print("count : "+rs.getInt(2)+"\n");
		  
		    }    
		}
		catch(Exception e){e.printStackTrace();}
	}
	public static void main(String[] args) {
		Question4 q= new Question4();
		q.groupby();

	}

}
