package Leetcode.LinkedList;


class LLNN {
    Node head;
    
    public class Node {
        int val;
        Node next;
  
        Node(){}
        Node (int value) {
            this.val = value;
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
    public Node swapPairs(Node head) {   
        Node temp = head;
        Node first = head;
        Node second = head;
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        if (len < 2) {
            return head;
        } else {
            temp = head;
            while (temp != null && temp.next != null) {
                int count = 0;
                while (count < 1) {
                    first = temp;
                    second = temp.next;
                    count++;
                }
                int swap = first.val;
                first.val = second.val;
                second.val = swap;
                temp = temp.next.next;
            }
            return head;
        }
    }
}

public class SwapNodesinPairs_24 {
    
    public static void main(String[] args) {
        LLNN list = new LLNN();
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        list.display();
        System.out.println();
        list.head = list.swapPairs(list.head);
        list.display();
    }

}
