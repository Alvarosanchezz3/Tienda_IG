package MAIN;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SimpleTesting{
    public static void main(String[] args) {
        try {
         
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306","root","");
            Statement stmt=con.createStatement();  
            stmt.execute("CREATE DATABASE OGT;");
            System.out.println("Connected");
            
//        	 Class.forName("com.mysql.cj.jdbc.Driver");
//             Connection con=DriverManager.getConnection(
//                     "jdbc:mysql://localhost:3306/OGT","root","");
//             Statement stmt=con.createStatement();  
//            String st= "CREATE TABLE MyGuests (\r\n"
//             		+ "id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,\r\n"
//             		+ "firstname VARCHAR(30) NOT NULL,\r\n"
//             		+ "lastname VARCHAR(30) NOT NULL\r\n"
//             		+ ");";
//            System.out.println(st);
//             stmt.execute(st);
//             System.out.println("Connected"); 
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }  
}