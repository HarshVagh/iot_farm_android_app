/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;


import java.sql.*;

/**
 *
 * @author Harsh
 */
public class Conn {
    
    static private Connection conn;
    
    public static Connection getConnection() throws Exception{
        if(conn == null){
            //JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull", "root", "harshvagh123");
            System.out.println("Connection Successfull");
        }
        return conn;
    }
    
}
