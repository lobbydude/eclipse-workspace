package Database.testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class deleteQuery {

	
	  private static String myUserName;
	private static String myPassword;

	public static void deleteQuery() throws SQLException, ClassNotFoundException {	
			String dbURL = "jdbc:sqlserver://ipAddress:portNumber/dbName";
			String username = myUserName;
		        String password = myPassword;
		        String query = "DELETE FROM <table_name>";		
		        Class.forName("net.sourceforge.jtds.jdbc.Driver");
		   	Connection con = DriverManager.getConnection(dbURL,username,password);
		    	Statement stmt = con.createStatement();			
		    	stmt.executeUpdate(query);
		    	//Closing DB Connection
		    	con.close();
		     }
}
