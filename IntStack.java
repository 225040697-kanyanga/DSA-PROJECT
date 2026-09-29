public class IntStack {

    private int[] stack;
    private int top;

    IntStack(int size) {
        stack = new int[size];
        top = -1;
    }


    void push(int value) {

        if (top == stack.length - 1) {
            System.out.println("Stack is full.");
            return;
        }

        top++;
        stack[top] = value;
    }

    
    int pop() {

        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        }

        int value = stack[top];
        top--;

        return value;
    }


    int peek() {

        if (top == -1) {
            return -1;
        }

        return stack[top];
    }


    boolean isEmpty() {
        return top == -1;
    }
    
    void display() {

        System.out.print("Stack: ");

        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }

        System.out.println();
    }
}