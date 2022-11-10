package database;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {
    private static Connection con;
    private static String driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/tobacoshop";  // myDB --> nama database 
    private static String username = "root";       // user name DMBS
    private static String password = "";    // pswd DMBS

 
    public Connection logOn(){
        try {
            //Load JDBC Driver
            Class.forName( driver ).newInstance();
            //Buat object Connection
            con = DriverManager.getConnection( url, username, password );
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
        return con;
    }

    public void logOff(){
        try {
            //Tutup Koneksi
            con.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
