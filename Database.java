import java.sql.*;
public class Database 
{
    // Object of Connection class
    Connection con = null;
        
    public static Connection connectDB()
    {
        try
        {
            // Here, the name of the database is mysql
            Class.forName("com.mysql.jdbc.Driver");
        
            // 2(b) Registering drivers using DriverManager
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/database",
                "root", "1234");
            return con;
        }
        
        // Here, the exceptions is handle by Catch block
        catch (SQLException | ClassNotFoundException e)
        {
                
            // Print the exceptions
            System.out.println(e);
        
            return null;
        }
    }
}
