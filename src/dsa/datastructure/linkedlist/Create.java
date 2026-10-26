package dsa.datastructure.linkedlist;

public class Create {
    public static void main(String[] args) {
        Node node1 = new Node(5);
        Node node2 = new Node(10);
        Node node3 = new Node(15);
        node1.next = node2;
        node2.next = node3;
        Node head = node1;

        print(head);

        System.out.println("Head still at --> " +
                head.val); // since java is call by value, local variable changes inside the method
        //but what if I did changes in main itself? then yes, you lose access to head. Therefore keep head and temp separate
        //while traversing, only move head unless intentionally modifying structure.

        head = insertBeginning(head, 1);
        System.out.println("After insertion at beginning");
        print(head);
        System.out.println("After insertion at end");
        head = insertEnd(head, 20);
        print(head);
        head = insertAtPos(head, 3, 50);
        print(head);
    }
    static void print(Node head){
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    static Node insertBeginning(Node head, int val){
        Node node = new Node(val);
        node.next = head;
        //but till this point head still points to 5. Move the head
        head = node;
        return head;
    }
    static Node insertEnd(Node head, int val){
        Node newNode = new Node(val);
        if(head == null){
            return newNode;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }
    static Node insertAtPos(Node head, int pos, int val){
        Node node = new Node(val);

        // Invalid position
        if (pos <= 0) {
            return head;
        }

        // Insert at beginning
        if (pos == 1) {
            node.next = head;
            return node;
        }

        Node curr = head;
        int count = 1;

        // Move to the node just before the desired position
        while (curr != null && count < pos - 1) {
            curr = curr.next;
            count++;
        }

        // Position is out of bounds
        if (curr == null) {
            return head;
        }

        node.next = curr.next;
        curr.next = node;

        return head;
        // you can also use prev technique like in delete, but for insert at position we usually go with this code. Infact you can
        // write delete at position also without prev, but the prev technique is better for that question.
    }
}
