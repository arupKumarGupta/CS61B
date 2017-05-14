package linkedlists;

/**
 * Created by ArupPc on 14-05-2017.
 */
public class MyLinkedList {

    Object data;
    MyLinkedList next;

    //initialization of a new node
    public MyLinkedList(Object i) {
        this.data = i;
        this.next = null;
    }

    //constructor for creating linked list through kind of chaining...
    public MyLinkedList(Object i, MyLinkedList node) {
        this.data = i;
        this.next = node;
    }

    //traverses all the nodes in linked list
    public void traverse() {
        MyLinkedList root = this;
        while (root != null) {
            System.out.print("->" + root.data);
            root = root.next;
        }
    }

    //method to insert a new node after a given node in the linked list
    public void insertAfter(Object i) {
        this.next = new MyLinkedList(i, this.next);
    }
}
