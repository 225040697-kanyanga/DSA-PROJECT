public class StudentQueue {

    private Student[] queue;
    private int front;
    private int rear;

    StudentQueue(int size) {
        queue = new Student[size];
        front = -1;
        rear = -1;
    }

    void enqueue(Student student) {

        if (rear == queue.length - 1) {
            System.out.println("Queue is full.");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear++;
        queue[rear] = student;
        System.out.println(student.name + " added to the queue.");
    } 

    Student dequeue() {

        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        }

        Student student = queue[front];
        front++;

        if (front > rear) {
            front = -1;
            rear = -1;
        }
        return student;
    }

    Student peek() {
        if (isEmpty()) {
            return null;
        }
        return queue[front];
    }

    boolean isEmpty() {
        return front == -1;
    }

    void displayQueue() {

        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("\n===== WAITING QUEUE =====");

        for (int i = front; i <= rear; i++) {
            queue[i].display();
        }
    }
}