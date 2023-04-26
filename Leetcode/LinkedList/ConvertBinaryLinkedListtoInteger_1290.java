package Leetcode.LinkedList;
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
    public int getDecimalValue(Node head) {
      Node temp =  head;
      int count = -1;
      while (temp != null) {
          count++;
          temp = temp.next;
      }
      int sum = 0; 
      temp = head;
      while (count != -1) {
          sum += ((Math.pow(2, count))*temp.value);
          count--;
          temp = temp.next;
      }
      return sum; 
    }
}

public class ConvertBinaryLinkedListtoInteger_1290 {
    public static void main(String[] args) {
        LinkkList list = new LinkkList();
        list.add(1);
        list.add(0);
        list.add(1);
        list.display();
        System.out.println();
        int ans = list.getDecimalValue(list.head);
        System.out.println(ans);
    }
}
