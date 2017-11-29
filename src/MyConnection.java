
import static java.lang.Character.UnicodeBlock.forName;
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miltos
 */
public class MyConnection {
    
    
    public static Connection getConection(){
    Connection con=null;
    try{
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost/stdmgdb","root","");
    }catch(Exception ex){
    System.out.println(ex.getMessage());
    }
    return con;
    }
    }
    

