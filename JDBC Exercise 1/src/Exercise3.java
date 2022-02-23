import java.sql.Connection;
import  java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;
public class Exercise3 {

	public static void main(String[] args) throws SQLException {
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost/JDBCEXE","root","password");
	    Statement stmt=con.createStatement();
	    try {
	    String update_query="UPDATE BANK SET AccountNo='ABC987'WHERE AccountBal=5000;";
        stmt.executeUpdate(update_query);
        con.close();
	    }

	    catch(Exception e)
	    {
	    e.printStackTrace();	
	    }
	    	}

}
