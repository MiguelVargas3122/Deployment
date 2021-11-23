
package conexion;

import java.sql.*;


public class cone {
    
    Connection con; 
    
    public Connection conex(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=sisTPC";
            con = DriverManager.getConnection(url, "sa", "12345");
            
        } catch (Exception e) {
            
        }
      return con;  
    }
    
}
 