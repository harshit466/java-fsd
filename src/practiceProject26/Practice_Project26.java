package practiceProject26;
import java.util.*;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;

    DoublyLinkedList() {
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
            newNode.prev = current;
        }
    }

    void traverseForward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        System.out.println("Forward traversal:");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    void traverseBackward() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        System.out.println("Backward traversal:");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}

public class Practice_Project26 {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        list.traverseForward();
        list.traverseBackward();
    }
}
