package LinkedList;

// public class practise {
    
// }



class nLinkedlist {
        Node head;
        Node tail;
    class Node {
        Node next;
        int val;

        Node(int d) {
            val = d;
            next=null;
        }
    }
    nLinkedlist(){

    }
    public  void addfirst(int val){
        Node newNode=new Node(val);
        Node temp=this.head;
        if(temp==null){////   3 >null//
            newNode.next=null;
            head=newNode;
        }
        else{
            newNode.next=head;  // 2-> 4>6> 3 ->null
            head=newNode;
        }
    }
    public void addlast(int val){
        Node newNode=new Node(val);//
        Node temp=head;
        if(temp==null){
            newNode.next=null;
            head=newNode;
        }
        else {
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.next = null;
        }

    }
    public void deletefirst(){//3>null
        Node temp=head;
        if(temp==null){
            System.out.println("list is empty");
        }
        else if(temp.next==null){
            temp=null;
            head=temp;

        }
        else{
           temp=temp.next;
           head=temp;


        }
    }
    public void deletelast(){
        Node temp=head;
        if(temp==null){
            System.out.print("list is empty");
        }
        else if(temp.next==null){
            temp=null;
            head=temp;
        }
        else{
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;

        }
    }
    public void addatposfromfirst(int k,int data){
        Node newNode=new Node(data);
        Node temp=head;
        if(k==1){
            newNode.next=head;
            head=newNode;
        }
//        else if(count<k){
//
//        }
        else if(k==2){
            newNode.next=temp.next;
            temp.next=newNode;
        }
        else {
            for (int i = 2; i < k; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }

    }
    public void addatposfromlast(int k,int data){
        Node newNode=new Node(data);
        Node first=head;
        Node second=head;
        for(int i=0;i<k;i++){// 1 2 3 4 5 6 7 8- null
            first=first.next;// 1 2 3 4 5 6 7 8-null
        }                    // 1 2 3
        while (first!=null){
            first=first.next;
            second=second.next;
        }
        newNode.next=second.next;
        second.next=newNode;

    }
    public void deleteNthNodeFromfirst(int k){ // 1 2 3 4 5 6 7 8
        Node temp=head;
        if(k==1){
            temp=temp.next;
            head=temp;
        }
        else if(k==2){
            temp.next=temp.next.next;
        }
        else{
            for(int i=2;i<k;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }

    }
    public void deleteNthNodeFromlast(int k){// 1 2 3 4 5 6 7-null
        Node temp=head;
        Node first=head;
        Node second=head;

        for(int i=0;i<k;i++){
            first=first.next;
        }
        if(first==null){
            temp=temp.next;
            head=temp;
//            head=head.next;
        }
        else {
            while (first.next!=null){
                first=first.next;
                second=second.next;
            }
            second.next=second.next.next;
        }

    }

    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+">");
            temp=temp.next;
        }
        System.out.print("null");
    }


    public static void main(String[] args) {


        nLinkedlist linklist=new nLinkedlist();

        linklist.addfirst(20);
        linklist.addfirst(30);
        linklist.addfirst(40);
        linklist.addfirst(50);
        linklist.addfirst(70);
        linklist.addfirst(80);
        linklist.addfirst(90);
        linklist.print();
//
//        System.out.println();
//        linklist.addlast(60);
//        linklist.print();
//
//        System.out.println();
//        linklist.deletefirst();
//        linklist.print();
//
//        System.out.println();
//        linklist.deletelast();
//        linklist.print();

//        System.out.println();
//        linklist.addatposfromfirst(4,10);
//        linklist.print();

//        System.out.println();
//        linklist.addatposfromlast(3,10);
//        linklist.print();

//        System.out.println();
//        linklist.deleteNthNodeFromfirst(7);
//        linklist.print();

        System.out.println();
        linklist.deleteNthNodeFromlast(7);
        linklist.print();
        

    }

}