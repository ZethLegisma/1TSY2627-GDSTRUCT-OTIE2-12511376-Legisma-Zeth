public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.add("Heathcliff");
        list.add("Asuna");
        list.add("LethalBacon");
        list.add("HPDeskjet");

        System.out.println("Initial Size: " + list.size());
        System.out.println("Contains 'Asuna'? " + list.contains("Asuna"));
        System.out.println("Index of 'LethalBacon': " + list.indexOf("LethalBacon"));

        String removed = list.removeFirst();
        System.out.println("Removed First: " + removed);
        System.out.println("New Size after removal: " + list.size());
        System.out.println("Contains 'Heathcliff' now? " + list.contains("Heathcliff"));

        DoublyLinkedList dList = new DoublyLinkedList();
        dList.add("Heathcliff");
        dList.add("Asuna");
        dList.add("LethalBacon");
        dList.add("HPDeskjet");

        dList.printForward();
    }
}