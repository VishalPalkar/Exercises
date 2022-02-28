package project.database.student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class Question3 {
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
	public void projectworkstud()
	{
		try
		{
			
			
			String sql =("SELECT st_no,st_name from Student join StudentProject on  Student. st_no = StudentProject.st_no join Project on Project. prj_no=StudentProject.prj_no where Project. prj_no=?");
			PreparedStatement st= c().prepareStatement(sql);
			st.setString(1, "P01");
			ResultSet rs=st.executeQuery();
			int count=0;
			while(rs.next()) { 
		    	System.out.print("st_no : "+rs.getString(1)+"\t");
		    	System.out.print("st_name : "+rs.getString(2)+"\n");
		    	count++;
			}
			System.out.println("number of students who are working on project P01 : "+count); 
		}
		catch(Exception k){k.printStackTrace();}
			
	
	}
	public static void main(String[] args) {
		Question3 q= new Question3();
		q.projectworkstud();

	}

}
