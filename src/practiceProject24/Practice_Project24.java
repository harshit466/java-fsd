package practiceProject24;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    Node head;

    SinglyLinkedList() {
        this.head = null;
    }

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void delete(int key) {
        Node current = head;
        Node prev = null;

        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Key not found in the list");
            return;
        }

        if (prev == null) {
            head = current.next;
        } else {
            prev.next = current.next;
        }
    }

    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Practice_Project24 {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(3);
        System.out.println("Original List:");
        list.display();
        int keyToDelete = 3;
        System.out.println("Deleting first occurrence of key " + keyToDelete);
        list.delete(keyToDelete);
        System.out.println("List after deletion:");
        list.display();
    }
}
