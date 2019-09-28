package com.company;

public class LinkedListInJava {

    Node head;

    public static void main(String[] args) {

        LinkedListInJava linkedListInJava = new LinkedListInJava();
    }

    static class Node {

        int data;
        Node next;

        Node(int data) {
            data = this.data;
            next = null;
        }
    }


    public LinkedListInJava insert(LinkedListInJava list, int data) {


        Node node = new Node(data);
        node.next = null;

        if (head.next == null) {

            head.next = node.next;

        } else {

            while (head.next != null) {

                // head.next=node
            }

        }
        return list;
    }

}
