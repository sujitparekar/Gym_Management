/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this licenseb 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;

public class ConnectionProvider {
    public static Connection getCon() 
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","root");
            return Con;
        }
        catch(Exception e)
        {
            return null;
        }
    }  
}   
