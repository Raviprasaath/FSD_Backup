package Leetcode;

import java.util.List;

class LinkedList{
    ListNode head;
    ListNode tail;

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { 
            this.val = val; 
        }
        ListNode(int val, ListNode next) { 
            this.val = val; 
            this.next = next; 
        }        
    }
    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public void add(int num) {
        ListNode newNode = new ListNode(num);
        ListNode temp = head;
        if (temp == null) {
            newNode.next = null;
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    public ListNode middleNode(ListNode head) {
        ListNode fastPointer = head;
        ListNode slowPointer = head;

        while(fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        return slowPointer;   
    }
}

public class MiddleoftheLinkedList876 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.display();
        // list.middleNode(2);

        list.display();
        
    }
}
