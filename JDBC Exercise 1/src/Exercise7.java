import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Exercise7 {
	public  String c_id;
	public  String r_id;
	public  String c_name;
	public String r_name;
	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter cou1ntry id : ");
		   int c_id= sc.nextInt();
		   System.out.println("Enter country name : ");
		   String c_name= sc.next();
		   System.out.println("Enter region id: ");
		   int r_id= sc.nextInt();
		   System.out.println("Enter region name : ");
		   String r_name= sc.next();
	try {	   
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost/JDBCEXE","root","password");
	    Statement stmt=con.createStatement();
	    PreparedStatement pst=con.prepareStatement("insert into COUNTRIES(country_id ,country_name , region_id,region_name) values(?,?,?,?)");  
	   pst.setLong(1,c_id); 
	    pst.setString(2,c_name);  
	    pst.setLong(3,r_id);
	    pst.setString(4,r_name);
	    int i=pst.executeUpdate();  
	    System.out.println(i+" records inserted");  
	      
	    con.close();  
	}
	catch(Exception e){ System.out.println(e);}  
	  
	}  
	}

