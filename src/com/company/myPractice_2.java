package com.company;

class Node2 {
    int data;
    Node2 next;

    public Node2(int data, Node2 next){
        this.data = data;
        this.next = next;
    }

    public String toString(){
        return data + "";
    }
}


public class myPractice_2 {

    private Node2 second;
    private Node2 head;

    public void Remove_duplicates(Node2 head){
        if(head == null){
            return;
        }

        Node2 current = head;
        head = new Node2(3, second);
        Node2 node = head;
        while (node.next != null) {
            System.out.println(node.toString());
            node = node.next;
        }
        current = current.next;

    }

    public static void main(String[] args) {

        Node2 fourth = new Node2(5,null);
        Node2 third = new Node2(3,fourth);
        Node2 second = new Node2(4,third);
        Node2 head = new Node2(3,second);
        Node2 cur = head;
        while(cur!=null){
            System.out.println(cur.data);
            cur = cur.next;
        }
    }



}