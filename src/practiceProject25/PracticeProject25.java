package practiceProject25;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    Node head;

    CircularLinkedList() {
        this.head = null;
    }

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head; 
        } else if (data <= head.data) {
            Node last = getLastNode();
            newNode.next = head;
            head = newNode;
            last.next = head;
        } else {
            Node current = head;
            while (current.next != head && current.next.data < data) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    Node getLastNode() {
        Node last = head;
        while (last.next != head) {
            last = last.next;
        }
        return last;
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}

public class PracticeProject25 {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insert(1);
        list.insert(3);
        list.insert(5);
        list.insert(7);
        list.insert(9);
        System.out.println("Original List:");
        list.display();
        int newData = 6;
        System.out.println("Inserting " + newData + " into the list");
        list.insert(newData);
        System.out.println("List after insertion:");
        list.display();
    }
}
