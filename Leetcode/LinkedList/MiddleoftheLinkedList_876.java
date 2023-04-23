package Leetcode.LinkedList;

class LinkedList{
   Node head;

    public class Node {
        int val;
        Node next;
        Node() {}
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void add(int num) {
        Node newNode = new Node(num);
        Node temp = head;
        if (temp == null) {
            newNode.next = null;
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public Node middleNode() {
        Node fastPointer = head;
        Node slowPointer = head;

        while(fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        head = slowPointer;
        return head;
    }
}

public class MiddleoftheLinkedList_876 {

   public static void main(String[] args) {
       LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.display();
        System.out.println();
        list.middleNode();
        list.display();
   }
}
