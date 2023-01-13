/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pmsswing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author BSP
 */
public class ConDB {
    Connection con;
    Statement st;
    PreparedStatement pst;
    
    private void ConnectToDatabase (){
	try{
            con = DriverManager.getConnection("jdbc:ucanaccess://D:\\DSA Theory Summers\\Project\\ODBC connectivity issue resolved\\MediDB.accdb");
            st = con.createStatement();
            }
	catch (Exception e) {System.out.println(e);
        }
    }
    
    public void AddtoDB(String N, String P, int empID, int Id ){
        try{
            ConnectToDatabase();
                String qry = "Insert into login values (?, ?, ?, ?)"; 
		pst = con.prepareStatement(qry);
		pst.setString(1, N);
		pst.setString(2, P);
                pst.setInt(3, Id);
                pst.setInt(4, empID);
		pst.executeUpdate();
                con.close();
            }
	catch(Exception e) {
                JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void Update (String N, String P, int empID, int Id ){
	try{
            ConnectToDatabase();
            String qry = "Update login set ID = ?, unames = ?, passwords = ?, emp_id = ? where ID = ?";
            pst = con.prepareStatement(qry);
            pst.setInt(1, Id);
            pst.setString(2, N);
            pst.setString(3, P);
            pst.setInt(4, empID);
                        
            pst.setInt(5, Id);
            pst.executeUpdate();
            con.close();
            }
	catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }    
    
    public void Delete (int Id){
	try{
            ConnectToDatabase();
            String qry = "Delete from login where ID = ?";
            pst = con.prepareStatement(qry);
            pst.setInt(1, Id);
            pst.executeUpdate();
            con.close();
        }
	catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }   
    
    public void SearchEmp(JTable TableSupply,String Key){
            try{
                ConnectToDatabase();
                Statement disstat = con.createStatement();
                String query="select * from login where unames='"+Key+ "'";
                ResultSet rs =disstat.executeQuery(query);
                TableSupply.setModel(DbUtils.resultSetToTableModel(rs));
                con.close();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }        
    }    
}
