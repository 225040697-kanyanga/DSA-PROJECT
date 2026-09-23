public class StudentLinkedList {

    private Node head;

    void insertAtBeginning(Student student) {

        Node newNode = new Node(student);

        newNode.next = head;
        head = newNode;

        System.out.println(student.name + " inserted at beginning.");
    }

    void insertAtEnd(Student student) {

        Node newNode = new Node(student);

        if (head == null) {
            head = newNode;
            System.out.println(student.name + " inserted at end.");
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;

        System.out.println(student.name + " inserted at end.");
    }

    void insertAtPosition(Student student, int position) {

        if (position <= 1) {
            insertAtBeginning(student);
            return;
        }

        Node newNode = new Node(student);
        Node current = head;

        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Invalid position.");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;

        System.out.println(
            student.name + " inserted at position " + position + "."
        );
    }

    Student searchStudent(int studentNo) {

        Node current = head;

        while (current != null) {

            if (current.data.studentNo == studentNo) {
                return current.data;
            }

            current = current.next;
        }

        return null;
    }

    void deleteStudent(int studentNo) {

        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data.studentNo == studentNo) {

            System.out.println(head.data.name + " deleted.");
            head = head.next;
            return;
        }

        Node current = head;

        while (current.next != null) {

            if (current.next.data.studentNo == studentNo) {

                System.out.println(current.next.data.name + " deleted.");

                current.next = current.next.next;
                return;
            }

            current = current.next;
        }

        System.out.println("Student not found.");
    }

    // Display all students
    void displayStudents() {

        if (head == null) {
            System.out.println("No student records.");
            return;
        }

        System.out.println("\n===== STUDENT SERVICE RECORDS =====");

        Node current = head;

        while (current != null) {

            current.data.display();

            current = current.next;
        }
    }
}
