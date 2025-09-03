package Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static final String SERVER   = "localhost";
    private static final String PORT     = "1433";
    private static final String DB_NAME  = "LTWeb";
    private static final String USER     = "sa";
    private static final String PASS     = "nmt7766332";

    public Connection getConnection() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String url = "jdbc:sqlserver://" + SERVER + ":" + PORT
                + ";databaseName=" + DB_NAME
                + ";encrypt=true;trustServerCertificate=true";
        return DriverManager.getConnection(url, USER, PASS);
    }
    
    public static void main(String[] args) {
    	try {
			System.out.println(new DBConnection().getConnection());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
