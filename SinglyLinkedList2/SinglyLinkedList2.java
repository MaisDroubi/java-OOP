/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlylinkedlist2;

/**
 *
 * @author pccorner
 */
public class SinglyLinkedList2 {

    public Node head;

    public SinglyLinkedList2() {
        this.head = null;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void remove() {
        Node current = this.head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;

    }

    public void printValues() {
        Node current = this.head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }

    }

}
