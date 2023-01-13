/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

public class Node {
    String Name,Pass;
    int employeeID,sqlID;
    Node next;
    Node pre;
    Node(String N, String P, int empID, int ID){
        Name=N;
        Pass=P;
        employeeID=empID;
        sqlID=ID;
        next=null;
        pre=null;
          
    }
}
