import java.util.Scanner;

public class Linkedlist1{
    Node head;
    
    class Node{
        int data;
        Node next;
        //Node head;
        
        Node(int val){
            data = val;
            next = null;
            //head = null;
        }
    }
    Linkedlist1(){
        head = null;
    } 
    public void insertend(int val){
        Node newnode = new Node(val);
         
        if (head==null){
            head = newnode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp =  temp.next;       
            }
            temp.next = newnode;
        }
    }
    public void insertbegin(int s){
        Node newnode = new Node(s);
        
        if (head == null){
            head = newnode;
        }
        else{
            newnode.next = head;
            head = newnode; 
        }
        
    }
    public void display(){
        Node temp = head;
        
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.print("Null");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        Linkedlist1 list = new Linkedlist1();
        
        int m = sc.nextInt();
        for (int i =0 ;i<m;i++){
            int val = sc.nextInt();
            list.insertend(val);
        }
        int s =sc.nextInt();
        list.insertbegin(s);
        list.display();
    }
}