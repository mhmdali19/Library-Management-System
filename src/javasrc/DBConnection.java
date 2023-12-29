package javasrc;

import java.sql.Connection;
import java.sql.DriverManager;

//creating class for connection with database

public class DBConnection {
    
    private static Connection con = null;
    
    private DBConnection(){
    
    }
    
    public static Connection getConnection(){
        if (con == null){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost:3307/student","root","");   
    }catch(Exception e){
        e.printStackTrace();
    }
   
}
        return con;
}
}
