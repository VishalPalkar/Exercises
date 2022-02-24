import java.sql.Connection;
import  java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;
public class Exercise5 {

	public static void main(String[] args) throws SQLException {
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost/JDBCEXE","root","password");
	    Statement stmt=con.createStatement();
	    String create_query ="CREATE TABLE COUNTRIES(country_id int,country_name char(50), region_id int);";
  	  stmt.execute(create_query);
  	  con.close();
	}

}
