public class Demo {

    public static void main(String[] args) {

        // A1 - QUEUE
        

        StudentQueue queue = new StudentQueue(10);

        // Six students arrive

        queue.enqueue(new Student(
            221045678,
            "Maria",
            "Registration",
            12
        ));

        queue.enqueue(new Student(
            222034512,
            "Tomas",
            "Student Card",
            5
        ));

        queue.enqueue(new Student(
            223041876,
            "Ndapewa",
            "Fees",
            8
        ));

        queue.enqueue(new Student(
            221067341,
            "Simon",
            "Documents",
            4
        ));

        queue.enqueue(new Student(
            224012345,
            "Anna",
            "Academic Enquiry",
            10
        ));

        queue.enqueue(new Student(
            225056789,
            "Peter",
            "Registration",
            7
        ));

        // Display waiting queue

        queue.displayQueue();

        // Serve three students

        System.out.println("\n===== SERVING STUDENTS =====");

        Student served1 = queue.dequeue();
        served1.display();

        Student served2 = queue.dequeue();
        served2.display();

        Student served3 = queue.dequeue();
        served3.display();

        // Display remaining students

        queue.displayQueue();


        // A2 - SINGLY LINKED List

        System.out.println("\n\n===== A2: SINGLY LINKED LIST =====");

        StudentLinkedList list = new StudentLinkedList();

        // Insert at beginning

        list.insertAtBeginning(
            new Student(
                221045678,
                "Maria",
                "Registration",
                12
            )
        );

        // Insert at end

        list.insertAtEnd(
            new Student(
                222034512,
                "Tomas",
                "Student Card",
                5
            )
        );

        list.insertAtEnd(
            new Student(
                221067341,
                "Simon",
                "Documents",
                4
            )
        );

        // Display current list

        list.displayStudents();

        // Insert at position 3

        list.insertAtPosition(
            new Student(
                223041876,
                "Ndapewa",
                "Fees",
                8
            ),
            3
        );

        System.out.println("\nAfter inserting Ndapewa at position 3:");

        list.displayStudents();

        // Search for student

        System.out.println("\n===== SEARCH RESULT =====");

        Student found = list.searchStudent(223041876);

        if (found != null) {

            System.out.println("Student found:");

            found.display();

        } else {

            System.out.println("Student not found.");
        }

        // Delete student

        System.out.println("\n===== DELETE STUDENT =====");

        list.deleteStudent(222034512);

        // Display after deletion

        System.out.println("\nAfter deleting Tomas:");

        list.displayStudents();
        
// A3 - POSTFIX STACK

System.out.println("\n\n===== A3: POSTFIX EXPRESSION =====");

String expression = "5 3 + 2 *";

int result = PostfixEvaluator.evaluate(expression);

System.out.println("Expression: " + expression);
System.out.println("Final Result: " + result);

    }
}