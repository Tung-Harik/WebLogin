package Project.Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private final String serverName = "LAPTOP-LLL4HL9N";
    private final String dbName = "LTWeb";
    private final String portNumber = "1433";
    private final String userID = "sa";
    private final String password = "nmt7766332";

    public Connection getConnection() throws Exception {
        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber
                   + ";databaseName=" + dbName
                   + ";encrypt=true;trustServerCertificate=true;";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
    }
}
