package singlylinkedlist2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pccorner
 */
public class ListTester {

    public static void main(String[] args) {
        SinglyLinkedList2 sll = new SinglyLinkedList2();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.remove();
        sll.remove();
        sll.add(33);
        sll.add(77);
        sll.printValues();
    }

}
