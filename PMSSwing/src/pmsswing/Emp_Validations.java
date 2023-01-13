/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pmsswing;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;

public class Emp_Validations {

    Connection con;
    Statement st;
    PreparedStatement pst;
    
    private void ConnectToDatabse(){
        try{
            con = DriverManager.getConnection("jdbc:ucanaccess://D:\\DSA Theory Summers\\Project\\ODBC connectivity issue resolved\\MediDB.accdb");
            st = con.createStatement();
            }
	catch (Exception e) {System.out.println(e);
        }
    }
    
    public  boolean NPIString_val(String text){
        if(text.isEmpty() == true || text.length()<5 ){
            return false;
        }
        return true;
    }
    
    public  boolean ID_string_val(String text){
        if(text.isEmpty() == true || text.length()>3 ){
            return false;
        }
        return true;
    } 
    
    public  boolean empid_DB_val(int ID) {
        try{ 
            ConnectToDatabse();
            String qu="select * from login where emp_id='"+ID+ "'";
            pst = con.prepareStatement(qu); 
            ResultSet MyResrs = pst.executeQuery();
            if(MyResrs.next()){
                con.close();
                return false;
            }
            else{
                con.close();
                return true;
            }
            
	}
        catch (Exception e) {
            
        }     
    return true;        
    }    
    
    public  boolean ID_DB_val(int ID) {
        try{ 
            con = DriverManager.getConnection("jdbc:ucanaccess://D:\\DSA Theory Summers\\Project\\ODBC connectivity issue resolved\\MediDB.accdb");
            String qu="select * from login where ID='"+ID+ "'";
            pst = con.prepareStatement(qu); 
            ResultSet MyResrs = pst.executeQuery();
            if(MyResrs.next()){
                con.close();
                return false;
            }
            else{
                con.close();
                return true;
            }
	}
        catch (Exception e) {
            
        }
    return true;        
    }   
}
