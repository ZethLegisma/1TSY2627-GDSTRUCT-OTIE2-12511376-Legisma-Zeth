public class SinglyLinkedList {
    private Node head;
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    public String removeFirst() {
        if (head == null) {
            return null;
        }
        String removedData = head.getData();
        head = head.getNext();
        size--;
        return removedData;
    }

    public int size() {
        return this.size;
    }

    public boolean contains(String target) {
        Node current = head;
        while (current != null) {
            if (current.getData().equals(target)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public int indexOf(String target) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.getData().equals(target)) {
                return index;
            }
            current = current.getNext();
            index++;
        }
        return -1;
    }
}