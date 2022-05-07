package mayank.crud.dbconnection;
import java.sql.*;

public class dbConnection {
    private static Connection con;
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/studentinfo";
            String username = "root";
            String pass = "";
            con = DriverManager.getConnection(url,username,pass);
            //System.out.println("Connection Established....");
            
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
           
}
