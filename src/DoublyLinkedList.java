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
public class DoublyLinkedList {
    Node head;
    Node tail;
    String listName;
    
    public DoublyLinkedList(String name){
        this.listName = name;        //set this class's list_name with name
        head = null;        //set head with NULL to be sure.
        tail = null;        //set tail with NULL to be sure.
    }
    
    public void popBack() {
      if (isEmpty()){
 
        }else{

        }
    }
    
    public void popFront(){
        if (isEmpty()){
 
        }else{

        }
    }
    
    public Node topFront(){
        if (isEmpty()){
            return new Node();
        } else {
            return new Node();
        }
    }
    
    public Node topBack(){
        if (isEmpty()){
            return new Node();
        } else {
            return new Node();
        }
    }
    
    public void pushFront(Node node){
        if (isEmpty()){

        }else{
            
        }
    }
    
    public void pushBack(Node node) {
        if (isEmpty()) {

        } else {

        }
    }

    public Node findNode(int id){
        if (isEmpty()){
            return new Node();
        } else {
            return new Node();
        }
    }
    
    public Node eraseNode(int id){
        if (isEmpty()){
            return new Node();
        } else {
            return new Node();
        }
    }
    
    public void addNodeAfter(Node node1, Node node2){

    }
    
    public void addNodeBefore(Node node1, Node node2){

    }
    
    public boolean isEmpty(){
        return head==null || tail==null;    //If head or tail is NULL then this method will return true or implies that this list is empty.
    }
    public void merge(DoublyLinkedList list){
        
    }
    
    public void printStructure(){
        System.out.println("Hello World!");
    }
    
    // This may be useful for you for implementing printStructure()
    public void printStructureBackward(){ 
        Node current=tail;
        System.out.print(listName + ": tail <-> ");
        while(current!=null){
            System.out.print("{" + current.student_id + "} <-> ");
            current = current.previous;
        }
        System.out.println("head");
    }
    
    public Node whoGotHighestGPA(){
        if (isEmpty()) {
            return new Node();
        } else {
            return new Node();
        }
    }
}
