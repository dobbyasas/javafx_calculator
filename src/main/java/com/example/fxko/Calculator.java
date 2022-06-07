package com.example.fxko;

import java.util.Collections;
import java.util.Stack;

class Calculator1 extends CalculatorApp{
    private Stack<String> postfixStack = new Stack<String>();
    private Stack<Character> opStack = new Stack<Character>();
    private int[] operatPriority = new int[] { 0, 3, 2, 1, -1, 1, 0, 2 };// The priority of operators using ASCII-40 as index

    public static double conversion(String expression) {
        double result = 0;
        com.example.fxko.Calculator1 cal = new com.example.fxko.Calculator1();
        try {
            expression = transform(expression);
            result = cal.calculate(expression);
        } catch (Exception e) {
            // e.printStackTrace();
            // Operation error returned NaN
            return 0.0 / 0.0;
        }
        // return new String().valueOf(result);
        return result;
    }

    private static String transform(String expression) {
        char[] arr = expression.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '-') {
                if (i == 0) {
                    arr[i] = '~';
                } else {
                    char c = arr[i - 1];
                    if (c == '+' || c == '-' || c == '*' || c == '/' || c == '(' || c == 'E' || c == 'e') {
                        arr[i] = '~';
                    }
                }
            }
        }
        if(arr[0]=='~'||arr[1]=='('){
            arr[0]='-';
            return "0"+new String(arr);
        }else{
            return new String(arr);
        }
    }

    public double calculate(String expression) {
        Stack<String> resultStack = new Stack<String>();
        prepare(expression);
        Collections.reverse(postfixStack);// Reverse suffix stack
        String firstValue, secondValue, currentValue;// First value, second value and arithmetic operator involved in calculation
        while (!postfixStack.isEmpty()) {
            currentValue = postfixStack.pop();
            if (!isOperator(currentValue.charAt(0))) {// If it is not an operator, it is stored in the operand stack
                currentValue = currentValue.replace("~", "-");
                resultStack.push(currentValue);
            } else {// If it is an operator, take two values from the operand stack and participate in the operation together with the value
                secondValue = resultStack.pop();
                firstValue = resultStack.pop();

                // Change negative sign to negative sign
                firstValue = firstValue.replace("~", "-");
                secondValue = secondValue.replace("~", "-");

                String tempResult = calculate(firstValue, secondValue, currentValue.charAt(0));
                resultStack.push(tempResult);
            }
        }
        return Double.valueOf(resultStack.pop());
    }

    private void prepare(String expression) {
        opStack.push(',');// Operators are put into the comma element at the bottom of the stack, which has the lowest priority
        char[] arr = expression.toCharArray();
        int currentIndex = 0;// Current character position
        int count = 0;// The length of characters from the last arithmetic operator to the current arithmetic operator is convenient or between
        char currentOp, peekOp;// Current operator and stack top operator
        for (int i = 0; i < arr.length; i++) {
            currentOp = arr[i];
            if (isOperator(currentOp)) {// If the current character is an operator
                if (count > 0) {
                    postfixStack.push(new String(arr, currentIndex, count));// Take the number between two operators
                }
                peekOp = opStack.peek();
                if (currentOp == ')') {// Remove the element in the operator stack to the suffix stack when an anti bracket is encountered until the left bracket is encountered
                    while (opStack.peek() != '(') {
                        postfixStack.push(String.valueOf(opStack.pop()));
                    }
                    opStack.pop();
                } else {
                    while (currentOp != '(' && peekOp != ',' && compare(currentOp, peekOp)) {
                        postfixStack.push(String.valueOf(opStack.pop()));
                        peekOp = opStack.peek();
                    }
                    opStack.push(currentOp);
                }
                count = 0;
                currentIndex = i + 1;
            } else {
                count++;
            }
        }
        if (count > 1 || (count == 1 && !isOperator(arr[currentIndex]))) {// If the last character is not a bracket or other operator, it will be added to the suffix stack
            postfixStack.push(new String(arr, currentIndex, count));
        }

        while (opStack.peek() != ',') {
            postfixStack.push(String.valueOf(opStack.pop()));// Add the remaining elements in the operator stack to the suffix stack
        }
    }

    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '(' || c == ')';
    }

    public boolean compare(char cur, char peek) {// If peek priority is higher than cur, return true. By default, peek priority is lower
        boolean result = false;
        if (operatPriority[(peek) - 40] >= operatPriority[(cur) - 40]) {
            result = true;
        }
        return result;
    }

    private String calculate(String firstValue, String secondValue, char currentOp) {
        String result = "";
        switch (currentOp) {
            case '+':
                result = String.valueOf(com.example.fxko.ArithHelper.add(firstValue, secondValue));
                break;
            case '-':
                result = String.valueOf(com.example.fxko.ArithHelper.sub(firstValue, secondValue));
                break;
            case '*':
                result = String.valueOf(com.example.fxko.ArithHelper.mul(firstValue, secondValue));
                break;
            case '/':
                result = String.valueOf(ArithHelper.div(firstValue, secondValue));
                break;
        }
        return result;
    }
}