// bahar topkaya 240446001 17.10.2026
public class DeleteMiddleDemo {
    public static void main(String[] args){

        System.out.println("=== Delete Middle Node Demo ===");
        System.out.println();

        SinglyLinkedList list1 = new SinglyLinkedList();
        for (int i = 1; i<=5; i++){
            list1.add(i);
        }
        System.out.println("Original List 1:");
        list1.display();
        list1.deleteMiddle();
        System.out.println("After deleting middle:");
        list1.display();
        System.out.println();

        SinglyLinkedList list2 = new SinglyLinkedList();
        for (int i = 10; i <= 60; i += 10) {
            list2.add(i);
        }
        System.out.println("Original List 2:");
        list2.display();
        list2.deleteMiddle();
        System.out.println("After deleting middle:");
        list2.display();
        System.out.println();

        // Test 3: One node
        SinglyLinkedList list3 = new SinglyLinkedList();
        list3.add(999);

        System.out.println("Original List 3:");
        list3.display();
        list3.deleteMiddle();
        System.out.println("After deleting middle:");
        list3.display();
    }
}
