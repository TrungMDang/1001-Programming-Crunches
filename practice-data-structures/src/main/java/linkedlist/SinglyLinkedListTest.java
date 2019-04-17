package linkedlist;

public class SinglyLinkedListTest {

    public static void main(String[] args) {
//        testInsertStart();
//        System.out.println("***********************************");
//        testInsert();
//        System.out.println("***********************************");
//        testInsertAtIndex();
//        System.out.println("***********************************");
//        testDelete();
//        System.out.println("***********************************");
//        testDeleteAtIndex();
//        System.out.println("***********************************");
//        testDeleteList();
//        System.out.println("***********************************");
//        testGetLengthIterative();
//        System.out.println("***********************************");
//        testGetLengthRecursive();
        System.out.println("***********************************");
        testContainIterative();
        System.out.println("***********************************");
        testContainRecursive();
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
