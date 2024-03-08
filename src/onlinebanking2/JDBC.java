/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinebanking2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
    
    Connection con;
    Statement stm;
    ResultSet rs; 
    
    public JDBC()
     {
     try
      {
      Class.forName("com.mysql.cj.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_onlinebanking","root","root");
    stm=con.createStatement();
      }
    catch(Exception ex)
      {
       System.out.println(ex);
    
      }    
     }
 private static class statement {

        public statement() {
        }
    }
    
}
