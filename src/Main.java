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
public class Main {
        public static void main(String[] args) {
        // TODO code application logic here
        Node node;
        SinglyLinkedList list1;
        DoublyLinkedList list2;
        node = new Node();
        list1 = new SinglyLinkedList("Hello World!");
        list2 = new DoublyLinkedList("list2");
                node = new Node(5806001,"Matthew",3.50);
                list2.pushFront(node);
                node = new Node(5806002,"Mark",2.75);
                list2.pushFront(node);
                node = new Node(5806003,"Luke",3.00);
                list2.pushFront(node);
                node = new Node(5806004,"John",3.75);
                list2.pushFront(node);
                list2.printStructure();
        }
}
