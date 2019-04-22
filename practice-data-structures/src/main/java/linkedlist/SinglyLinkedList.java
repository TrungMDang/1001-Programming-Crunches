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
	
	
	public void deleteList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public int listSizeIterative() {
		SinglyNode curr = head;
		int count = 0;
		while (curr != null) {
			count++;
			curr = curr.next;
		}
		return count;
	}
	
	public int listSizeRecursive() {
		return recursiveGetSize(head, 0);
		
	}
	
	private int recursiveGetSize(SinglyNode curr, int count) {
		if (curr == null) {
			return 0;
		} else {
			return count + recursiveGetSize(curr.next, count++);
		}
	}

	public boolean containIterative(int x) {
		SinglyNode curr = head;
		while (curr != null) {
			if (curr.data == x) {
				return true;
			}
			curr = curr.next;
		}
		return false;
	}
	
	
	public boolean containRecursive(int x) {
		return containRecursiveHelper(head, x);
	}
	
	private boolean containRecursiveHelper(SinglyNode node, int x) {
		SinglyNode curr = node;
		if (curr != null) {
			if (curr.data == x) {
				return true;
			} else {
				return containRecursiveHelper(curr.next, x);
			}
		} else {
			return false;
		}
	}
	
	public int getNthNode(int index) {
		SinglyNode curr = head;
		index--; //turn 1-based index into 0-based index
		while (curr != null && index > 0) {
		   curr = curr.next;
		   index--;
		}
		if (curr != null && index == 0) {
		   return curr.data;
		}
		return -1;
	}
	
	public SinglyNode getNthNode(int index, boolean getNodeOrNot) {
		if (getNodeOrNot) {
			SinglyNode curr = head;
			index--; //turn 1-based index into 0-based index
			while (curr != null && index > 0) {
			   curr = curr.next;
			   index--;
			}
			if (curr != null && index == 0) {
			   return curr;
			}
		}
		return null;
	}
	
	public int getNthNodeFromLast(int index) {
		if (index > size) {
			return -1;
		} else {
			SinglyNode curr = head;
			int nodesToTravel = size - index;
			while (nodesToTravel > 0 && curr != null) {
				nodesToTravel--;
				curr = curr.next;
			}
			if (curr != null) {
				return curr.data;
			} else {
				return -1;
			}
		}
		
	}
	
	public SinglyNode getNthNodeFromLast(int index, boolean getNode) {
		if (getNode) {
			if (index > size) {
				return null;
			} else {
				SinglyNode curr = head;
				int nodesToTravel = size - index;
				while (nodesToTravel > 0 && curr != null) {
					nodesToTravel--;
					curr = curr.next;
				}
				if (curr != null) {
					return curr;
				} else {
					return null;
				}
			}
		}
		return null;	
	}
	
	
	public int getNthNodeFromLastUsing2Pointers(int index) {
		if (index > size) {
			return -1;
		} else {
			SinglyNode fast = head;
			SinglyNode slow = head;
			while (index > 0 && fast != null) {
				index--;
				fast = fast.next;
			}
			while (fast != null && slow != null) {
				fast = fast.next;
				slow = slow.next;
			}
			if (slow != null) {
				return slow.data;
			} else {
				return -1;
			}
		}
	}
	
	public int getMiddleNode() {
		SinglyNode fast = head;
		SinglyNode slow = head;
		while (fast != null && slow != null) {
			fast = fast.next;
			if (fast != null ) {
				slow = slow.next;
				if (fast.next != null) {
					fast = fast.next;
				}
			}
    	}
    	if (slow != null) {
    	    return slow.data;
    	} else {
    	    return -1;
    	}
	}
	
	public int frequency(int data) {
		SinglyNode curr = head;
		int count = 0;
		while (curr != null) {
			if (curr.data == data) {
				count++;
			}
			curr = curr.next;
		}
		return count;
	}
	
	public int isLooped() {
		SinglyNode slow = head;
		SinglyNode fast = head;
		while (fast != null && slow != null) {
			fast = fast.next;
			if (fast != null && fast.next != null) {
				fast = fast.next;
			}
			if (fast == slow) {
				return 1;
			}
			slow = slow.next;
		}
		return 0;
	}

    @Override
    public String toString() {
		if (isLooped() == 1) {
			return "Looped";
		} else {
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

}
