package LinkedList;

class LinkkList {
    Node head;
    
    public class Node {
        int value;
        Node next;

        Node(){}
        Node (int value) {
            this.value = value;
            this.next = null;
        }
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value+" -> ");
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

    public Node removeFromLast(Node head, int n) {
        Node newNode = new Node(0);
        newNode.next = head;

        Node first = head;
        Node second = head;
        
        while (n -- != 0) {
            first = first.next;
        }

        while (first != null && first.next != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return newNode.next;
    }
    
}
public class RemoveNthNodeFromEnd {
    
    public static void main(String[] args) {
        LinkkList list = new LinkkList();
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(9);
        list.display();
        System.out.println();
        list.head = new LinkkList().removeFromLast(list.head, 2);
        list.display();
        System.out.println();
        list.removeFromLast(list.head, 2);
        list.display();
        
    }
}
