package dsa.datastructure.linkedlist;

public class Delete {
    public static void main(String[] args) {
        Node node1 = new Node(5);
        Node node2 = new Node(10);
        Node node3 = new Node(15);
        Node node4 = new Node(20);
        Node node5 = new Node(25);
        Node node6 = new Node(30);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        Node head = node1;
        print(head);
        head = deleteFirst(head);
        System.out.println("After delete from first");
        print(head);
        head = deleteLast(head);
        System.out.println("After delete from last");
        print(head);
        deleteByValue(head, 15);
        print(head);
    }
    static Node deleteFirst(Node head){
        if(head == null){
            return null;
        }
        return head.next;
    }
    static Node deleteLast(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    static Node deleteByValue(Node head, int target){
        Node prev = null;
        Node curr = head;
        while(curr != null){
            if(curr.val == target){
                prev.next = curr.next;
                return head;
            }
            prev = curr;
            curr = curr.next;
        }
        //value not found
        return head;
    }
    static void print(Node head){
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
