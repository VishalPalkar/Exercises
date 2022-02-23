
import java.sql.Connection;
import  java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;
public class Exercise6 {

	public static void main(String[] args) throws SQLException {
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost/JDBCEXE","root","password");
	    Statement stmt=con.createStatement();
	    String alter_query ="ALTER TABLE COUNTRIES ADD region_name char(20));";
  	  stmt.execute(alter_query);
  	  con.close();
	}

}