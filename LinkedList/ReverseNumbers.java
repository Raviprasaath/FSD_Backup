package LinkedList;

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



  public void reverse() {
    Node prev = null;
    Node curr = this.head;
    Node nextStore;
    
    while( curr != null ) {
      nextStore = curr.next;
      curr.next = prev;
      prev = curr;
      curr = nextStore;
    }
    head = prev;
  }
}

public class ReverseNumbers {
  public static void main (String[] args) {
    LinkedLists list = new LinkedLists();

    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.display(); 
    System.out.println();


    list.reverse();
    list.display(); 
  }   
}
