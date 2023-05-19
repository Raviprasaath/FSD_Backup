package Leetcode.LinkedList;

class LinkedLists {
	Node head;
	Node tail;
	
	public class Node{
		int value;
		Node next;

		Node(){}
		
		Node(int val){
			value=val;
			next=null;
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

  public void add(int val){
    Node newNode = new Node(val);
    Node temp = this.head;

    if (temp == null) {
      newNode.next=null;
      head = newNode;
    } else {
      newNode.next = head;
      head = newNode;
    }
  }



  public int pairSum(Node head) {
    Node temp = head;
    int count = 0;
    while ( temp != null ) {
        count++;
        temp = temp.next;
    }
    
    temp = head;

    Node dummy = new Node(0);
    Node dummyHead = dummy;
    while (temp != null) {
        dummy.next = new Node(temp.value);
        dummy = dummy.next;
        temp = temp.next;
    }

    Node current = dummyHead.next;
    Node currStore = null;
    Node prev = null;
    while (current != null) {
        currStore = current.next;
        current.next = prev;
        prev = current;
        current = currStore;
    }
    dummy = prev;
    temp = head;
    int max = 0;
    while (count / 2 != 0) {
        max = Math.max(max, (temp.value + dummy.value) );
        count--;
        temp = temp.next;
        dummy = dummy.next;
    }
    return max;
    }
}


public class MaximumTwinSumofaLinkedList_2130 {
    public static void main(String[] args) {
        LinkedLists list = new LinkedLists();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.display(); 
        System.out.println();
        int sum = new LinkedLists().pairSum(list.head);
        System.out.println(sum);
    }
}
