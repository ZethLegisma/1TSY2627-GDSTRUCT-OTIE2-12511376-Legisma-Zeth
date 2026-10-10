public class DoublyLinkedList {
    private DNode head;
    private DNode tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void add(String data) {
        DNode newNode = new DNode(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
        size++;
    }

    public void printForward() {
        DNode current = head;
        System.out.print("HEAD <-> ");
        while (current != null) {
            System.out.print(current.getData() + " <-> ");
            current = current.getNext();
        }
        System.out.println("NULL");
    }
}