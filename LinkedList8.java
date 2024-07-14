import java.util.*;

class Linkedlist8 {
    Node head;

    // Inner class representing a node in the linked list
    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    Linkedlist8() {
        head = null;
    }

    public void insertend(int val) {
        Node newnode = new Node(val);

        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    public void sort() {
        if (head == null || head.next == null)
            return;
        else {
            Node current, index;
            int temp;
            for (current = head; current != null; current = current.next) {
                for (index = current.next; index != null; index = index.next) {
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                }
            }
        }
    }

    public void dup() {
        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public void insertbegin(int s) {
        Node newnode = new Node(s);

        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
    }

    public void position(int pos, int k) {
        Node newnode = new Node(k);

        if (pos <= 0) {
            System.out.println("Invalid position");
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds");
        } else {
            newnode.next = temp.next;
            temp.next = newnode;
        }
    }

    public void deletebegin() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete");
            return;
        }
        head = head.next;
    }

    public void deleteposition(int d) {
        if (head == null) {
            System.out.println("List is empty, nothing to delete");
            return;
        }
        
        if (d == 1) {
            head = head.next;
            return;
        }

        Node temp = head;
        Node prev = null;
        int count = 1;

        while (temp != null && count < d) {
            prev = temp;
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("Position out of bounds");
        } else {
            prev.next = temp.next;
        }
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Linkedlist8 list = new Linkedlist8();

        System.out.println("Enter integers to insert into the linked list (-1 to stop): ");
        int val;
        while ((val = sc.nextInt()) != -1) {
            list.insertend(val);
        }

        list.sort();
        System.out.println("Sorted list:");
        list.display();

        System.out.println("Enter position to insert a value: ");
        int pos = sc.nextInt();
        System.out.println("Enter value to insert: ");
        int k = sc.nextInt();
        list.position(pos, k);
        System.out.println("Updated list after insertion:");
        list.display();

        System.out.println("Enter position to delete: ");
        int d = sc.nextInt();
        list.deleteposition(d);
        System.out.println("Updated list after deletion:");
        list.display();

        System.out.println("Enter value to insert at the beginning: ");
        int s = sc.nextInt();
        list.insertbegin(s);
        System.out.println("Updated list after insertion at beginning:");
        list.display();

        System.out.println("Removing duplicates from the list:");
        list.dup();
        list.display();

        sc.close();
    }
}
