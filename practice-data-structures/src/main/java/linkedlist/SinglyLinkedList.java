package linkedlist;

public class SinglyLinkedList {

    private SinglyNode head;
    private SinglyNode tail;
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public SinglyNode getHead() {
        return head;
    }

    public int getSize() {
        return this.size;
    }
	
	public void insertStart(int data) {
		SinglyNode newNode = new SinglyNode(data);
		SinglyNode curr = head;
		if (curr == null) {
			head = newNode;
		} else {
			newNode.next = curr;
			head = newNode;
		}
		size++;
	}
	
	/**
	* <p>Insert a node at the end of the list.</p>	* 
	*/
    public void insert(int data) {
        SinglyNode newNode = new SinglyNode(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            this.tail.next = newNode;
        }
        this.tail = newNode;
        this.size++;
    }

    public void insert(int data, int index) {
        if (index < 0 || index > size) {
            System.out.println("IndexOutOfBoundsException: " + index);
        } else if (index == 0) {                          //Insert at head
            SinglyNode newNode = new SinglyNode(data);
            newNode.next = this.head;
            this.head = newNode;
            if (this.size == 0) {
                this.tail = newNode;
            }
            this.size++;
        } else if (index == this.size) {                  //Insert at tail
            SinglyNode newNode = new SinglyNode(data);
            this.tail.next = newNode;
            this.size++;
        } else {
            SinglyNode newNode = new SinglyNode(data);
            SinglyNode curr = head;
            int i = 0;
            while (curr != null && i + 1 != index) {

                curr = curr.next;
                i++;
            }
            newNode.next = curr.next;
            curr.next = newNode;
            size++;
        }
    }


    public void delete(SinglyNode node) {
        SinglyNode curr = head;
        SinglyNode prev = null;
        if (curr != null && curr.data == node.data) {
            head = head.next;
            this.size--;
        } else {
            while (curr != null && curr.data != node.data) {
                prev = curr;
                curr = curr.next;
            }
            if (prev != null && curr != null) {
                prev.next = curr.next;
                this.size--;
            } else {
                System.out.println("Node with data: " + node.data + " not found.");
            }
        }
    }

    public void deleteAt(int index) {
        if (index == 0 && head != null) {
            head = head.next;
        } else {
            SinglyNode curr = head;
            SinglyNode prev = null;
            int i = 0;
            while (curr != null && i != index) {
                prev = curr;
                curr = curr.next;
                i++;
            }
            if (prev != null && curr != null) {
                prev.next = curr.next;
                this.size--;
            } else {
                System.out.println("Node with index: " + index + " not found.");
            }
        }
    }

    public SinglyNode reverse() {
        return head;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        SinglyNode curr = head;
        while (curr != null) {
            sb.append(curr.data);
            if (curr.next != null) {
                sb.append(", ");
            }
            curr = curr.next;
        }
        sb.append("]");
        return sb.toString();
    }

}
