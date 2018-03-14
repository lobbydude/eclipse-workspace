package Database.testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class updateQuery {
	 private static String root;
	private static String pass;

	public static void updateQuery() throws ClassNotFoundException, SQLException{		
			String dbURL = "jdbc:sqlserver://ipAddress:portNumber/dbName";
			String myUserName = root;
			String username = myUserName;
		        String myPassword = pass;
				String password = myPassword;
		        String updatequery = "UPDATE <table_name> SET <column_name> = <some_value>";
		        
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
		   	Connection con = DriverManager.getConnection(dbURL,username,password);
		    	Statement stmt = con.createStatement();
		    	stmt.executeUpdate(updatequery);  
		    	con.close();
		     }
}
