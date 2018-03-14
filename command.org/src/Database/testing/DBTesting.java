package Database.testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTesting {

	
	private static String root;
	private static String raj;

	public static void selectQuery() throws SQLException, ClassNotFoundException {	
		String dbURL = "jdbc:sqlserver://ipAddress:portNumber/dbName";
	
		String username = root;
	        
			String password = raj;
	        //Load MS SQL JDBC Driver
	        Class.forName("net.sourceforge.jtds.jdbc.Driver");
	        //Creating connection to the database
	        Connection con = DriverManager.getConnection(dbURL,username,password);
	        //Creating statement object
	    	Statement st = con.createStatement();
	    	String selectquery = "SELECT * FROM <tablename> WHERE <condition>";
	        //Executing the SQL Query and store the results in ResultSet
	    	ResultSet rs = st.executeQuery(selectquery);
	    	//While loop to iterate through all data and print results
	    	while (rs.next()) {
	    		System.out.println(rs.getString("transaction_datetime"));
	    	}
	        //Closing DB Connection
	    	con.close();
		}
}
