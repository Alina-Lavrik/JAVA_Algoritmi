package Lessons;

// Необходимо реализовать метод разворота односвязного списка

class Node {
    int value;
    Node next;
    Node head;
    
    Node(int value) {
        this.value = value;
    }
}

public class ReverseMetod {   

    public Node reverse(Node head) {
        Node previous = null;
        Node current = head;
        Node next = null;

        
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        
        return previous;
    }


    public static void main(String[] args) {

        ReverseMetod reversemetod = new ReverseMetod();

        Node head = new Node(11);
        head.next = new Node(22);
        head.next.next = new Node(34);
        head.next.next.next = new Node(46);
        head.next.next.next.next = new Node(57);
        head.next.next.next.next.next = new Node(111);
        head.next.next.next.next.next.next = new Node(888);

        // Выводим список
        System.out.print("Список: " + head.value + " " + head.next.value + " " + head.next.next.value + " " +
            head.next.next.next.value + " " + head.next.next.next.next.value + " " + head.next.next.next.next.next.value + " " + 
            head.next.next.next.next.next.next.value + "\n");
    
        Node reversedList = reversemetod.reverse(head);

        // Выводим развернутый список
        System.out.print("Развернутый список: ");
        while (reversedList != null) {
            System.out.print(reversedList.value + " ");
            reversedList = reversedList.next;
        }
    }
    
}