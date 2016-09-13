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
          System.out.print("ERROR");
        }else{
          tail=tail.previous; 
          tail.next=null;
        }
    }
    
    public void popFront(){
        if (isEmpty()){
            System.out.print("ERROR");
        }else{
            head=head.next;
            head.previous=null;
        }
    }
    
    public Node topFront(){
        if (isEmpty()){
            System.out.print("ERROR");
            return new Node();
        } else {
            return head; //return first node
        }
    }
    
    public Node topBack(){
        if (isEmpty()){
            System.out.print("ERROR");
            return new Node();
        } else {
            return tail; // tail.next always null //tail is the last node
        }
    }
    
    public void pushFront(Node node){
        node.next = head;
        if (isEmpty()){
            head=tail=node;
        }else{
            node.next=head.next; //a new node point to first node
            head.previous=node; // first node point to a new node
            head=node;
        }
    }
    
    public void pushBack(Node node) {
        node.next = null;
        if (isEmpty()) {
            head=tail=node;
        } else {
            node=tail; //new node point to last node of list
            tail.next=node; //last node point to new code
            tail=node;
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
