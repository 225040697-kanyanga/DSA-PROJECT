public class PostfixEvaluator {

    static int evaluate(String expression) {

        IntStack stack = new IntStack(100);

        String[] tokens = expression.split(" ");

        for (int i = 0; i < tokens.length; i++) {

            String token = tokens[i];

            System.out.println("\nToken: " + token);

            
            if (token.equals("+") ||
                token.equals("-") ||
                token.equals("*") ||
                token.equals("/")) {

                int operand2 = stack.pop();
                int operand1 = stack.pop();

                int result = 0;

                if (token.equals("+")) {
                    result = operand1 + operand2;
                }
                else if (token.equals("-")) {
                    result = operand1 - operand2;
                }
                else if (token.equals("*")) {
                    result = operand1 * operand2;
                }
                else if (token.equals("/")) {
                    result = operand1 / operand2;
                }

                stack.push(result);

            }
            
            else {

                int number = Integer.parseInt(token);

                stack.push(number);
            }

            
            stack.display();
        }

        return stack.pop();
    }
}