public class DNode {
    private String data;
    private DNode next;
    private DNode prev;

    public DNode(String data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public DNode getNext() {
        return next;
    }

    public void setNext(DNode next) {
        this.next = next;
    }

    public DNode getPrev() {
        return prev;
    }

    public void setPrev(DNode prev) {
        this.prev = prev;
    }
}