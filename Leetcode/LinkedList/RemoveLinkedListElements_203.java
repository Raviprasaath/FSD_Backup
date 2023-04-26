package Leetcode.LinkedList;

class LLN {
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
    public Node removeElements(Node head, int val) {
        Node newNode = new Node(0);
        Node temp = newNode;
        Node fast = head;
        
        while (fast != null) {
            if (fast.val != val) {
                newNode.next = fast;
                newNode = newNode.next;
            }
            fast = fast.next;
        }
        newNode.next = null;
        return temp.next;
    }
}
    
public class RemoveLinkedListElements_203 {
    public static void main(String[] args) {
        LLN list = new LLN();
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(6);
        list.add(2);
        list.add(1);

        list.display();
        System.out.println();
        list.head = list.removeElements(list.head, 6);
        list.display();
    }
}
