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
          tail=tail.previous; //tail point to before last node
          tail.next=null; //cut last node out
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
            return tail; // return tail //tail.next always null //tail is the last node
        }
    }
    
    public void pushFront(Node node){
        node.next = null;
        if (isEmpty()){
            head=tail=node;
            node.previous=null;
        }else{
            node.next=head; //a new node point to first node
            head=node;
        }
    }
    
    public void pushBack(Node node) {
        node.next = null;//new node be the last node of list
        if (isEmpty()) {
            head=tail=node;
            node.previous=null;
        } else {
            node.previous=tail;
            tail.next=node; //new node point to last node of list
            tail=node;//last node point to new code

        }
    }

    public Node findNode(int id){
        if (isEmpty()){
            System.out.print("ERROR");
            return new Node();
        } else {
            return new Node();
        }
    }
    
    public Node eraseNode(int id){
        if (isEmpty()){
            System.out.print("ERROR");
            return new Node();
        } else {
            return new Node();
        }
    }
    
    public void addNodeAfter(Node node1, Node node2){ //node 1 is a current node node 2 is a new node to add
        node2.next = node1.next;
        node1.next = node2;
        node2.previous=node1;
        node1.next.previous=node2;
    }
    
    public void addNodeBefore(Node node1, Node node2){
        node2.next = node1;

    }
    
    public boolean isEmpty(){
        return head==null || tail==null;    //If head or tail is NULL then this method will return true or implies that this list is empty.
    }

    public void merge(DoublyLinkedList list){
        tail.next=list.head.previous;
    }
    
    public void printStructure(){
        Node current = head;
        System.out.print(listName + ": head <-> ");
        while(current!=null){
            System.out.print("{" + current.student_id + "} <-> ");
            current = current.next;
        }
        System.out.print("tail");
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