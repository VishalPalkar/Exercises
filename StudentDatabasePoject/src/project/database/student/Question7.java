package project.database.student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Question7 {
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
	public void findprogrammer()
	{
		try
		{
			String sql =("SELECT * from Student join StudentProject on  Student. st_no = StudentProject.st_no join Project on Project. prj_no=StudentProject.prj_no where StudentProject.designation=?");
			PreparedStatement st= c().prepareStatement(sql);
			st.setString(1, "PROGRAMMER");
			ResultSet rs=st.executeQuery();
		    while(rs.next()) { 
		    	System.out.print("st_no : "+rs.getString(1)+"\t");
		    	System.out.print("st_name : "+rs.getString(2)+"\t");
		    	System.out.print("designation : "+rs.getString(7)+"\t");
		    	System.out.print("prj_platform : "+rs.getString(11)+"\n");
		    }    
		}
		catch(Exception e){e.printStackTrace();}
	}
	public static void main(String[] args) {
		Question7 q= new Question7();
		q.findprogrammer();

	}

}
