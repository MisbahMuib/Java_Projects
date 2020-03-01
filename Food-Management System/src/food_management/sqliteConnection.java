/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food_management;

/**
 *
 * @author SHOUVO
 */
import java.sql.*;
import javax.swing.*;
public class sqliteConnection {
    Connection conn=null;
    
    public static Connection dbConnection(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:D:\\NetBeansProjects\\FOOD_MANAGEMENT\\FoodDatabase.sqlite");
             JOptionPane.showMessageDialog(null, "Connection successfully");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
