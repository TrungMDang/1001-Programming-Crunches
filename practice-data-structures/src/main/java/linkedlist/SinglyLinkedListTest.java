package linkedlist;

public class SinglyLinkedListTest {

    public static void main(String[] args) {
//        testInsertStart();
//        System.out.println("1 - ***********************************");
//        testInsert();
//        System.out.println("2 - ***********************************");
//        testInsertAtIndex();
//        System.out.println("3 - ***********************************");
//        testDelete();
//        System.out.println("4 - ***********************************");
//        testDeleteAtIndex();
//        System.out.println("5 - ***********************************");
//        testDeleteList();
//        System.out.println("6 - ***********************************");
//        testGetLengthIterative();
//        System.out.println("7 - ***********************************");
//        testGetLengthRecursive();
//        System.out.println("8 - ***********************************");
//        testContainIterative();
//        System.out.println("9 - ***********************************");
//        testContainRecursive();
//        System.out.println("10 - ***********************************");
//        testGetNthNode();
//        System.out.println("11 - ***********************************");
//        testGetNthNodeFromLast();
//        System.out.println("12 - ***********************************");
//        testGetNthNodeFromLastUsing2Pointers();
//        System.out.println("13 - ***********************************");
//        testGetMiddleNode();
//        System.out.println("14 - ***********************************");
//        testFrequency();
//        System.out.println("15 - ***********************************");
//        testIsLooped();
//        System.out.println("16 - ***********************************");
//        testIsLooped();
//        System.out.println("17 - ***********************************");
//        testCountNodesInLoop();
    }

    private static void testInsertStart() {
        System.out.println("Testing insert start with empty list:");
        SinglyLinkedList testListEmpty = new SinglyLinkedList();
        System.out.println("Initial list size: " + testListEmpty.getSize());
        System.out.println("Insert -1:");
        testListEmpty.insertStart(-1);
        System.out.println(testListEmpty.toString());
        System.out.println("Insert -2:");
        testListEmpty.insertStart(-2);
        System.out.println(testListEmpty.toString());
        System.out.println("Insert -3:");
        testListEmpty.insertStart(-3);
        System.out.println(testListEmpty.toString());
        System.out.println("Final list size: " + testListEmpty.getSize());

        System.out.println("Testing insert start:");
        SinglyLinkedList testList = createRandomListForTest();
        System.out.println("Initial list size: " + testList.getSize());
        System.out.println("Insert -1:");
        testList.insertStart(-1);
        System.out.println(testList.toString());
        System.out.println("Insert -2:");
        testList.insertStart(-2);
        System.out.println(testList.toString());
        System.out.println("Insert -3:");
        testList.insertStart(-3);
        System.out.println(testList.toString());
        System.out.println("Final list size: " + testList.getSize());
    }

    private static void testInsert() {
        System.out.println("Testing insert:");
        SinglyLinkedList testList = createRandomListForTest();
        System.out.println("Insert -1:");
        testList.insert(-1);
        System.out.println(testList.toString());
        System.out.println("Insert -1:");
        testList.insert(-1);
        System.out.println(testList.toString());
        System.out.println("Insert -1:");
        testList.insert(-1);
        System.out.println(testList.toString());
    }

    private static void testInsertAtIndex() {
        System.out.println("Testing insert at index:");
        SinglyLinkedList testList = createRandomListForTest();
        System.out.println("LinkedList initial size: " + testList.getSize());

        System.out.println("Insert -1 at index 0:");
        testList.insert(-1, 0);
        System.out.println(testList.toString());

        System.out.println("Insert -1 at last index:");
        testList.insert(-1, testList.getSize());
        System.out.println(testList.toString());

        System.out.println("Insert -1 at negative index:");
        testList.insert(-1, -1);
        System.out.println(testList.toString());

        System.out.println("Insert -1 at out of bounds index:");
        testList.insert(-1, testList.getSize() + 1);
        System.out.println(testList.toString());

        System.out.println("Insert -1 at index 5:");
        testList.insert(-1, 5);
        System.out.println(testList.toString());

        System.out.println("Testing insert at index with empty list:");
        SinglyLinkedList testListE = new SinglyLinkedList();
        System.out.println("LinkedList initial size: " + testListE.getSize());

        System.out.println("Insert -1 at negative index:");
        testListE.insert(-1, -1);
        System.out.println(testListE.toString());

        System.out.println("Insert -1 at out of bounds index:");
        testListE.insert(-1, testListE.getSize() - 1);
        System.out.println(testListE.toString());

        System.out.println("Insert -1 at index 0:");
        testListE.insert(-1, 0);
        System.out.println(testListE.toString());

        System.out.println("Insert -2 at index 1:");
        testListE.insert(-2, 1);
        System.out.println(testListE.toString());

        System.out.println("Insert -3 at index 1:");
        testListE.insert(-3, 1);
        System.out.println(testListE.toString());

    }

    private static void testDelete() {
        System.out.println("Testing deletion of given node:");
        SinglyLinkedList testList = createDeterminedListForTest();
        System.out.println("Initial list: " + testList.toString());

        System.out.println("Delete node with data == 2:");
        testList.delete(new SinglyNode(2));
        System.out.println(testList.toString());

        System.out.println("Delete node with data == 0:");
        testList.delete(new SinglyNode(0));
        System.out.println(testList.toString());

        System.out.println("Delete node with data == 9:");
        testList.delete(new SinglyNode(9));
        System.out.println(testList.toString());
        System.out.println("Final list size: " + testList.getSize());

        System.out.println("Testing deletion of empty list:");
        SinglyLinkedList emptyList = new SinglyLinkedList();
        System.out.println("Initial list: " + emptyList.toString());
        System.out.println("Delete node with data == 0:");
        emptyList.delete(new SinglyNode(0));
        System.out.println(emptyList.toString());
        System.out.println("Final list size: " + emptyList.getSize());

    }

    private static void testDeleteAtIndex() {
        System.out.println("Testing deletion of node at given index:");
        SinglyLinkedList testList = createRandomListForTest();
        System.out.println("Initial list: " + testList.toString());
        System.out.println("Initial size: " + testList.getSize());

        System.out.println("Delete node at index 10:");
        testList.deleteAt(10);
        System.out.println(testList.toString());

        System.out.println("Delete node at index 0:");
        testList.deleteAt(0);
        System.out.println(testList.toString());

        System.out.println("Delete node at index 3:");
        testList.deleteAt(3);
        System.out.println(testList.toString());

    }

    private static void testDeleteList() {
        System.out.println("Testing deletion of entire list:");
        SinglyLinkedList list = createRandomListForTest();
        System.out.println("List initial size: " + list.getSize());
        System.out.println("List: " + list.toString());
        list.deleteList();
        System.out.println("List size after deleting list: " + list.getSize());
        System.out.println("List: " + list.toString());

    }

    private static void testGetLengthIterative() {
        System.out.println("Testing get list length iterative:");
        SinglyLinkedList list = createRandomListForTest();
        System.out.println("Initial list size: " + list.getSize());
        System.out.println("Length of list iteratively: " + list.listSizeIterative());
        SinglyLinkedList list2 = new SinglyLinkedList();
        System.out.println("Initial list 2 size: " + list2.getSize());
        System.out.println("Length of list 2 iteratively: " + list2.listSizeIterative());
    }

    private static void testGetLengthRecursive() {
        System.out.println("Testing get list length recursive:");
        SinglyLinkedList list = createRandomListForTest();
        System.out.println("Initial list size: " + list.getSize());
        System.out.println("Length of list recursively: " + list.listSizeRecursive());
        SinglyLinkedList list2 = new SinglyLinkedList();
        System.out.println("Initial list 2 size: " + list2.getSize());
        System.out.println("Length of list 2 recursively: " + list2.listSizeRecursive());
    }

    private static void testContainIterative() {
        System.out.println("Testing contain iteratively");
        SinglyLinkedList list = createDeterminedListForTest();
        System.out.println("List: " + list);
        System.out.println("Does list have 5: " + list.containIterative(5));
        System.out.println("Does list have -10: " + list.containIterative(-10));
        System.out.println("Does list have 20: " + list.containIterative(20));
    }

    private static void testContainRecursive() {
        System.out.println("Testing contain recursively");
        SinglyLinkedList list = createDeterminedListForTest();
        System.out.println("List: " + list);
        System.out.println("Does list have 4: " + list.containRecursive(4));
        System.out.println("Does list have -5: " + list.containRecursive(-5));
        System.out.println("Does list have 15: " + list.containRecursive(15));
    }

    private static void testGetNthNode() {
        System.out.println("Testing get Nth node from list:");
        SinglyLinkedList list = createRandomListForTest();
        System.out.println("Initial list: " + list.toString() + " - Size: " + list.getSize());
        System.out.println("Get node at index -1: " + list.getNthNode(-1));
        System.out.println("Get node at index equals size of list: " + list.getNthNode(list.getSize()));
        System.out.println("Get node at index 4: " + list.getNthNode(4));
        System.out.println("Get node at index 1 less than size of list: " + list.getNthNode(list.getSize() - 1));
        System.out.println("Get node at index 1 more than size of list: " + list.getNthNode(list.getSize() + 1));
    }

    private static void testGetNthNodeFromLast() {
        System.out.println("Testing get Nth node counting from end of list using list size:");
        SinglyLinkedList list = createRandomListForTest();
        System.out.println("Initial list: " + list.toString() + " - Size: " + list.getSize());
        System.out.println("Get node at index -1: " + list.getNthNodeFromLast(-1));
        System.out.println("Get node at index equals size of list: " + list.getNthNodeFromLast(list.getSize()));
        System.out.println("Get node at index 4: " + list.getNthNodeFromLast(4));
        System.out.println("Get node at index 1 less than size of list: " + list.getNthNodeFromLast(list.getSize() - 1));
        System.out.println("Get node at index 1 more than size of list: " + list.getNthNodeFromLast(list.getSize() + 1));
    }

    private static void testGetNthNodeFromLastUsing2Pointers() {
        System.out.println("Testing get Nth node counting from end of list using 2 pointers:");
        SinglyLinkedList list = createRandomListForTest();
        System.out.println("Initial list: " + list.toString() + " - Size: " + list.getSize());
        System.out.println("Get node at index -1: " + list.getNthNodeFromLastUsing2Pointers(-1));
        System.out.println("Get node at index equals size of list: " + list.getNthNodeFromLastUsing2Pointers(list.getSize()));
        System.out.println("Get node at index 4: " + list.getNthNodeFromLastUsing2Pointers(4));
        System.out.println("Get node at index 1 less than size of list: " + list.getNthNodeFromLastUsing2Pointers(list.getSize() - 1));
        System.out.println("Get node at index 1 more than size of list: " + list.getNthNodeFromLastUsing2Pointers(list.getSize() + 1));
    }

    private static void testGetMiddleNode() {
        System.out.println("Testing get middle node of linked list:");
        SinglyLinkedList list = createRandomListForTest();
        System.out.println("Initial list: " + list.toString() + " - Size: " + list.getSize());
        System.out.println("Get middle node: " + list.getMiddleNode());
        SinglyLinkedList list2 = createRandomListForTest();
        list2.insert(11);
        System.out.println("Initial list: " + list2.toString() + " - Size: " + list2.getSize());
        System.out.println("Get middle node: " + list2.getMiddleNode());
        SinglyLinkedList list3 = new SinglyLinkedList();
        System.out.println("Initial list: " + list3.toString() + " - Size: " + list3.getSize());
        System.out.println("Get middle node: " + list3.getMiddleNode());
       }

    private static void testFrequency() {
        System.out.println("Testing frequency of a node in singly linked list: ");
        SinglyLinkedList list = createDeterminedListForTest();
        list.insert(-1, 5);
        list.insert(-1, 9);
        list.insert(-1, 3);
        System.out.println("Initial list: " + list.toString() + " - Size: " + list.getSize());
        System.out.println("Get frequency of -1: " + list.frequency(-1));
        SinglyLinkedList listEmpty = new SinglyLinkedList();
        System.out.println("Initial list: " + listEmpty.toString() + " - Size: " + listEmpty.getSize());
        System.out.println("Get frequency of 0: " + listEmpty.frequency(0));
    }

    private static void testIsLooped() {
        System.out.println("Testing if singly linked list is looped: ");
        SinglyLinkedList list = createRandomListForTest();
        SinglyNode node = list.getNthNode(7, true);
        SinglyNode last = list.getNthNodeFromLast(list.getSize(), true);
        if (node != null && last != null) {
            node.next = last;
        }
        System.out.println("Initial list: " + list.toString() + " - Size: " + list.getSize());
        System.out.println("Is singly linked list looped: " + list.isLooped());
        SinglyLinkedList listRand = createRandomListForTest();
        System.out.println("Initial list: " + listRand.toString() + " - Size: " + listRand.getSize());
        System.out.println("Is singly linked list looped: " + listRand.isLooped());
    }

    private static void testCountNodesInLoop() {
        System.out.println("Testing count of nodes in loop of a looped singly linked list: ");
        SinglyLinkedList list = createDeterminedListForTest();
        SinglyNode node = list.getNthNode(7, true);
        SinglyNode last = list.getNthNodeFromLast(1, true);
        if (node != null && last != null) {
            last.next = node;
        }
        System.out.println("Initial list: " + list.toString() + " - Size: " + list.getSize());
        System.out.println("Number of nodes in loop: " + list.countNodesInLoop());
        SinglyLinkedList listRand = createRandomListForTest();
        System.out.println("Initial list: " + listRand.toString() + " - Size: " + listRand.getSize());
        System.out.println("Number of nodes in loop: " + listRand.countNodesInLoop());
    }
    private static SinglyLinkedList createRandomListForTest() {
        SinglyLinkedList list = new SinglyLinkedList();
        for (int i = 0; i < 10; i++) {
            list.insert((int) (Math.random() * 100));
        }
        return list;
    }


    private static SinglyLinkedList createDeterminedListForTest() {
        SinglyLinkedList list = new SinglyLinkedList();
        for (int i = 0; i < 10; i++) {
            list.insert(i);
        }
        return list;
    }

}
