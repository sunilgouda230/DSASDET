package LinkedList;

class Node{
    int data;
    Node next;

    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class LinkedList {

    public static Node convertToLinkedList(int [] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return  head;
    }

    public static void printLinkedListNumbers(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static int lengthOfll(Node head){
        int count = 0;
        Node temp = head;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static Node removeTail(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static Node middlenode(Node head){
        Node slow = head;
        Node fast = head;

        while (fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        Node head = convertToLinkedList(arr);
        printLinkedListNumbers(head);
        Node middle = middlenode(head);
        printLinkedListNumbers(middle);
        //removeTail(head);
        //printLinkedListNumbers(head);
    }
}
