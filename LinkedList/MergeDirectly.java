package LinkedList;

class LinkList{
    Node head;
    public class Node {
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
        System.out.print(temp.value + " -> ");
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
    public Node merge(Node list1, Node list2) {
      Node newNode = new Node (0);
      Node temp = newNode;
      
      while (list1 != null && list2 != null)  {  
        newNode.next = list1; // left side key right side value
        list1 = list1.next;
        newNode = newNode.next;
        newNode.next = list2;
        list2 = list2.next;
        newNode = newNode.next;
      }
  
      if (list1 == null) {
        newNode.next = list2;
      }
      if (list2 == null) {
        newNode.next = list1;
      }
      
      return temp.next;
    }
}

public class MergeDirectly {
    public static void main(String[] args) {
        LinkList list1  = new LinkList();
        LinkList list2  = new LinkList();
        list1.add(5);
        list1.add(4);
        list1.add(3);
        list1.add(2);
        list1.add(1);
        list1.display();
        System.out.println();
        list2.add(9);
        list2.add(8);
        list2.add(7);
        list2.add(6);
        list2.display();
        System.out.println();
    
        list1.head = new LinkList().merge(list1.head, list2.head);
        list1.display();
    }
}
    
    
    /*/*
    1 2 3 4 5
    
    6 7 8 9
    
    1 6 2 7 3 8 4 9 5
    */
    
