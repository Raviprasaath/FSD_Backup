package LinkedList;

public class reverseLL {
   
    class LinkedList {
        Node head;
        Node tail;
        int length;
    
        class Node{
            int value;
            Node next;
            Node(int value){
                this.value = value;
            }
        }
        public LinkedList(int value){
            Node newNode = new Node(value);
            head = newNode;
            tail = newNode;
            length = 1;
        }
        public void printList(){
            Node temp = head;
            while(temp != null){
                System.out.println(temp.value);
                temp = temp.next;
            }
        }
        public void getHead(){
            System.out.println("Head Value "+ head.value);
        }
        public void getTail(){
            System.out.println("Tail Value "+ tail.value);
        }
        public void getLength(){
            System.out.println("Length "+ length);
        }
        public void append(int value){
            Node newNode = new Node(value);
            if(length == 0){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
            length++;
        }
        public void prepend(int value){
            Node newNode = new Node(value);
            if(length == 0){
                head = newNode;
                tail = newNode;
            }else{
                newNode.next = head;
                head = newNode;
            }
            length++;
        }
    
        public Node removeLast(){
            if(length == 0) return null;
            Node temp = head;
            Node pre = head;
            while(temp.next != null){
                pre = temp;
                temp = temp.next;
            }
            tail = pre;
            tail.next = null;
            length--;
            if(length == 0){
                head = null;
                tail = null;
            }
            return temp;
        }
        public Node removeFirst(){
            if(length == 0) return null;
            Node temp = head;
            head = head.next;
            temp.next = null;
            length--;
            if(length == 0){
                tail = null;
            }
            return temp;
        }
        public Node get(int index){
            if(index < 0 || index>=length){
                return null;
            }
            Node temp = head;
            for(int i=0; i<index; i++){
                temp = temp.next;
            }
            return temp;
        }
        public boolean set(int index , int value){
            Node temp = get(index);
            if(temp != null){
                temp.value = value;
                return true;
            }
            return false;
        }
        public void insertMiddle(int value){
            Node insert = new Node(value);
            if(length==0) {
                head = insert;
                tail = insert;
            }else{
                Node slow = head;
                Node fast = head;
                while(fast!=null && fast.next!=null){
                    fast = fast.next.next;
                    slow = slow.next;
                }
                insert.next = slow.next;
                slow.next = insert;
            }
            length++;
        }
        public void deleteMiddle(){
            if(length==0){
                return;
            }else{
                Node slow = head;
                Node fast = head;
                Node prev = null;
                while(fast!=null && fast.next!=null){
                    fast = fast.next.next;
                    prev = slow;
                    slow = slow.next;
                }
                prev.next = slow.next;
            }
            length--;
        }
    
    }
   
    public static void main(String[] args) {
        
//        LinkedList myLinkedlist = new LinkedList();

    }
}
