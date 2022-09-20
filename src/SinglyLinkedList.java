public class SinglyLinkedList {
    private Node head;
    class Node{
        Node next;
        int val;
        Node(int data){
            next = null;
            val = data;
        }
    }
    SinglyLinkedList(){
        head = null;
    }

    public void push_front(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void display(){
        if (head == null){
            System.out.println("Empty list");
            return;
        }
        Node current = head;
        while(current != null){
            System.out.print(current.val);
            if (current.next != null){
                System.out.print(", ");
            }
            current = current.next;
        }
    }

    public static void main(String[] arg){
        SinglyLinkedList TheList = new SinglyLinkedList();
        TheList.push_front(4);
        TheList.push_front(5);
        TheList.push_front(6);
        TheList.display();
    }
}
