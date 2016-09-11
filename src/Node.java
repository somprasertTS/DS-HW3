/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package hw3;

/**
 *
 * @author Patiwet
 */
public class Node {
    public int student_id;
    public String name;
    public double gpa;
    
    Node next;
    Node previous;
    
    // Constructor 1
    public Node(int id, String name, double gpa){
        this.student_id = id;   //set this class's student_id with id.
        this.name = name;   //set this class's name with name.
        this.gpa = gpa;   //set this class's gpa with gpa.
    }
    // Constructor 2
    public Node(String name){
        this.name = name;        //set this class's name to error message.

    }
    // Constructor 3 (dummy)
    public Node(){
        // You can leave this function blank
    }
    
    public void printIDName(){
        System.out.println("StudentID: " + student_id + " , Name: " + name);
    }

}
