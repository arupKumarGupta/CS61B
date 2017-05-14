package linkedlists;

/**
 * Created by ArupPc on 14-05-2017.
 */
public class Driver {
    public static void main(String[] args) {
        MyLinkedList x = new MyLinkedList(1, new MyLinkedList(2, new MyLinkedList("Arup")));
        x.traverse();
        System.out.println();
        MyLinkedList t = x.next;
        t.insertAfter("Awesome");
        t = t.next.next;
        t.insertAfter(true);
        x.traverse();
    }
}
