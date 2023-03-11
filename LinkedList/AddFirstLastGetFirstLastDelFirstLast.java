package LinkedList;

class LinkingList {
    Node head;
    int size;
    public class Node {
        int value;
        Node next;

        Node () {}
        Node (int value) {
            this.value = value;
            this.next = null;
        }
    }
    public int size(){
        return this.size;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value+"->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void addFirst (int num) {
        Node newNode = new Node(num);
        Node temp = head;
        if (temp == null) {
            newNode.next = null;
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void addLast (int num) {
        Node newNode = new Node (num);
        Node temp = head;
        if (temp == null) {
            newNode.next = null;
            head = newNode;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = null;
        }
        temp = head;
        size++;
    }

    public Node addAtFromStart (int position, int num) {
        int n = position-2;

        Node newNode = new Node(num);
        newNode.next = head;
        Node temp = head;
        
        while (n -- != 0) {
            temp = temp.next;
        } 
        
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
        
        return newNode.next;
    }

    public Node addFromLast (int position, int num) {
        int n = position-1;
        Node newNode = new Node(num);
        newNode.next = head;

        Node first = head;
        Node second = head;

        while (n-- != 0) {
            first = first.next;
        }

        while (first != null && first.next != null) {
            first = first.next;
            second = second.next;
        } 
        newNode.next = second.next;
        second.next = newNode;

        size++;
        return newNode.next;
    }

    
    
    

}
public class AddFirstLastGetFirstLastDelFirstLast {
    public static void main(String[] args) {
        LinkingList list = new LinkingList();
        list.addFirst(1); 
        list.addFirst(2);
        System.out.println(list.size()); 
        list.display();
        System.out.println();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(3);
        list.addLast(3);
        list.addLast(3);
        System.out.println(list.size()); 
        list.display();
        System.out.println();
        list.addAtFromStart(2, 4);
        list.display();
        System.out.println();
        list.addFromLast(4,5);
        list.display();

    }
   
}
