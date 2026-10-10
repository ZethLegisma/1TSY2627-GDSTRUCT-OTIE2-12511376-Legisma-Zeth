import java.util.EmptyStackException;

public class CardStack {
    private class Node {
        Card card;
        Node next;

        Node(Card card) {
            this.card = card;
            this.next = null;
        }
    }

    private Node top;
    private int size;

    public CardStack() {
        this.top = null;
        this.size = 0;
    }

    public void push(Card card) {
        Node newNode = new Node(card);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public Card pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Card card = top.card;
        top = top.next;
        size--;
        return card;
    }

    public Card peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.card;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public String getItemsAsString() {
        if (isEmpty()) {
            return "Empty";
        }
        StringBuilder sb = new StringBuilder();
        Node current = top;
        while (current != null) {
            sb.append(current.card.getName());
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        return sb.toString();
    }
}