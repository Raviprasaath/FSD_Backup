package Leetcode.LinkedList;

class Linkkk {
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
    public Node swapNodes(Node head, int k) {
        Node Pointer1 = head;
        Node Pointer2 = head;
        int count = 1;
        Node cur = head;

        while(cur != null){

            if(count < k){
                Pointer1 = Pointer1.next;
            }
            if(count > k){
                Pointer2 = Pointer2.next;
            }
            count++;
            cur = cur.next;
        }

        int temp = Pointer1.val;
        Pointer1.val = Pointer2.val;
        Pointer2.val = temp;
        return head;
    }
}


public class SwappingNodesinaLinkedList_1721 {
    public static void main(String[] args) {
        Linkkk list = new Linkkk();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        list.display();
        System.out.println();
        list.head = list.swapNodes(list.head, 2);
        list.display();
    }

}
