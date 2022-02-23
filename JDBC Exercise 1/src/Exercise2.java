import java.sql.Connection;
import  java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;

public class Exercise2 {
	
	public static void main(String[] args) throws SQLException {
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost/JDBCEXE","root","password");
	   
	    try {
	    String Insert_query="INSERT INTO BANK(AccountNo,AccountBal)VALUES(?,?);";
	    PreparedStatement pre_st=con.prepareStatement(Insert_query);
	    pre_st.setString(1, "ABC123");
	    pre_st.setLong(2, 1000);
	    pre_st.execute();
	    
	    pre_st.setString(1, "ABC234");
	    pre_st.setLong(2, 2000);
	    pre_st.execute();
	    
	    pre_st.setString(1, "ABC345");
	    pre_st.setLong(2, 3000);
	    pre_st.execute();
	    
	    pre_st.setString(1, "ABC456");
	    pre_st.setLong(2, 4000);
	    pre_st.execute();
	
	    pre_st.setString(1, "ABC567");
	    pre_st.setLong(2, 5000);
	    pre_st.execute();
        
	    con.close();
	}

catch(Exception e)
{
e.printStackTrace();	
}
	}
	}

