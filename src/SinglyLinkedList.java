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
public class SinglyLinkedList {
    Node head;
    String listName;
    
    public SinglyLinkedList(String name){
        this.listName = name;        //set this class's list_name with name
        head = null;        //set head with NULL to be sure.
    }
    
    public void popBack() {
        if (isEmpty()){
            System.out.print("ERROR");
        }else{
            Node temp=head;
            while (temp.next.next != null){
                temp=temp.next;
            }
            temp.next = null;
        }
    }
    
    public void popFront(){
        if (isEmpty()){
            System.out.print("ERROR");
        }else{
            head=head.next;
        }
    }
    
    public Node topFront(){
        if (isEmpty()){
            System.out.print("ERROR");
        } else {
            return head;
        }
    }
    
    public Node topBack(){ 
        if (isEmpty()){
            System.out.print("ERROR");
        } else {
            Node temp=head;
            while (temp.next.next != null){
                temp=temp.next;
            }
            return temp.next;
        }
    }
    
    public void pushFront(Node node){
        node.next=null;
        if (isEmpty()){
            head.next=node;
        }else{
            node.next=head.next.next;
            head.next=node;
        }
    }
    
    public void pushBack(Node node) {
        node.next=null;
        if (isEmpty()){
            head.next=node;
        } else {
            Node temp=head;
            while (temp.next.next != null){
                temp=temp.next;
            }
            temp.next=node;
        }
    }

    public Node findNode(int id){
        if (isEmpty()){
            return new Node(0,"EMPTY LIST",0);
        } else {
            Node temp=head;
            while (temp.next.next != null){
                temp=temp.next;
                if(temp.student_id=id){
                    return id;
                }
            }
        }
        return new Node(0,"ID NOT FOUND",0);
    }
    
    public Node eraseNode(int id){
        if (isEmpty()){
            return new Node(0,"EMPTY LIST",0);
        } else {
            Node temp=head;
            while (temp.next.next != null){
                temp=temp.next;
                if(temp.student_id=id){
                    break;
                }
            }

        }
    }
    
    public void addNodeAfter(Node node1, Node node2){
        node2.next=node1.next;
        node1.next=node2;
    }
    
    public void addNodeBefore(Node node1, Node node2){
        Node temp=head;
        while (temp.next.next != node1){
            temp=temp.next;
        }
        node2.next=node1;
        temp.next=node2;
    }
    
    public boolean isEmpty(){
        return head==null;    //If head NULL then this method will return true or implies that this list is empty.
    }
    public void merge(SinglyLinkedList list){
        
    }
    
    public void printStructure(){
        Node temp=head;
        while (temp.next.next != null){
            temp=temp.next;
            System.out.println(temp.name);
        }
    }
    
    public Node whoGotHighestGPA(){
        if (isEmpty()) {
            return new Node();
        } else {
            return new Node();
        }
    }
}
