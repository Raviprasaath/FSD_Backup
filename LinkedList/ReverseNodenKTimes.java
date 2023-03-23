package LinkedList;

class LinkList2 {
    Node head;
    
    class Node {
        int value;
        Node next;

        Node () {}
        Node (int value) {
            this.value = value;
            this.next = null;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value+"->");
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
    public Node kAltReverse(Node node, int k) {
        Node current = node;
        Node next = null, prev = null;
        int count = 0;
    
        while (current != null && count < k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
    
        if (node != null) {
            node.next = current;
        }
    
        count = 0;
        while (count < k - 1 && current != null) {
            current = current.next;
            count++;
        }
    
        if (current != null) {
            current.next = kAltReverse(current.next, k);
        }

        return prev;
    }
}

public class ReverseNodenKTimes {
    public static void main(String[] args) {
        LinkList2 list = new LinkList2();
        list.add (1);
        list.add (2);
        list.add (4);
        list.add (6);
        list.add (8);
        list.add (7);
        list.display();
        System.out.println();
        list.head = list.kAltReverse(list.head, 3);
        list.display();
    }
}
