/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

import javax.swing.table.DefaultTableModel;
import pmsswing.EditEmp;

/**
 *
 * @author BSP
 */
public class myRuntimeData {
    Node head;   
    
    public void addUser(String N, String P, int empID, int ID){
        Node n = new Node(N,P,empID,ID);
        if (head == null){
            head = n;
        }else{
            Node temp = head;
            Node last=null;
            while(temp != null){
                last=temp;
                temp=temp.next;
            }
            n.pre=last;
            last.next=n;
        }
    }
        
    
    public  boolean empid_DS_val(int empId){
        Node temp = head;
        try{
        while(temp!=null){
            if(empId == temp.employeeID){
                return false;
            }
            temp = temp.next;
        }
        }
        catch(Exception e){
            
        }
        return true;
    }

        public  boolean ID_DS_val(int Id){
        Node temp = head;
        try{
        while(temp!=null){
            if(Id == temp.sqlID){
                return false;
            }
            temp = temp.next;
        }
        }
        catch(Exception e){
            
        }
        return true;
    }
    
    public void delbyEmp(int empId){
            Node temp = head;
            try{
            while(temp != null){
                if(temp.employeeID==empId){
                    if(temp.pre==null){
                        head=head.next;
                        head.pre=null;
                        return;
                    }
                    else{
                    head.pre.next=head.next;}
                    break;
                }
                temp=temp.next;
            }
            if (temp==null){
               System.out.println("Data not in List");
           }}
        catch(Exception e){
            
        }    
    }

   public void show(){        
        Node temp = head;
        DefaultTableModel model = (DefaultTableModel) EditEmp.DS_table.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        while(temp != null){
            System.out.println(temp.Name);
            System.out.println(temp.Pass);
            System.out.println(temp.employeeID);
            System.out.println(temp.sqlID);   
            Object[] row = { temp.Name, temp.Pass, temp.employeeID, temp.sqlID };
            model.addRow(row);            
            temp=temp.next;   
        }
        
    }

    
}

