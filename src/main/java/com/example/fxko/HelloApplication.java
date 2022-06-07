package com.example.fxko;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Collections;
import java.util.Stack;

public class HelloApplication extends Application{
  StringBuilder lab = new StringBuilder();
          Label label1 = new Label();
          double q, h, s;
          String op;

          /*
           *************************************************************************************************************
                                    SIMPLE JAVAFX CALCULATOR MADE BY DOBBY && PROMETHEUS
           *************************************************************************************************************
           */

@Override
public void start(Stage primaryStage) {
//        String[] button=new String[24];
//        for(int i=0;i<24;i++){
////            Button button[i]=new Button();
////        }

        GridPane pane1 = new GridPane();
        pane1.setAlignment(Pos.CENTER);
        //Add node
        Button button0 = new Button("mc");
        button0.setPrefSize(200, 100);button0.setFont(Font.font(50));
        Button button2 = new Button("(");
        button2.setPrefSize(200, 100);button2.setFont(Font.font(50));
        Button button3 = new Button(")");
        button3.setPrefSize(200, 100);button3.setFont(Font.font(50));
        Button button1 = new Button("mr");
        button1.setPrefSize(200, 100);button1.setFont(Font.font(50));

        Button button4 = new Button("C");
        button4.setPrefSize(200, 100);button4.setFont(Font.font(50));
        Button button5 = new Button("/");
        button5.setPrefSize(200, 100);button5.setFont(Font.font(50));
        Button button6 = new Button("*");
        button6.setPrefSize(200, 100);button6.setFont(Font.font(50));
        Button button7 = new Button("D");
        button7.setPrefSize(200, 100);button7.setFont(Font.font(50));

        Button button8 = new Button("7");
        button8.setPrefSize(200, 100);button8.setFont(Font.font(50));
        Button button9 = new Button("8");
        button9.setPrefSize(200, 100);button9.setFont(Font.font(50));
        Button button11 = new Button("9");
        button11.setPrefSize(200, 100);button11.setFont(Font.font(50));
        Button button12 = new Button("-");
        button12.setPrefSize(200, 100);button12.setFont(Font.font(50));

        Button button13 = new Button("4");
        button13.setPrefSize(200, 100);button13.setFont(Font.font(50));
        Button button14 = new Button("5");
        button14.setPrefSize(200, 100);button14.setFont(Font.font(50));
        Button button15 = new Button("6");
        button15.setPrefSize(200, 100);button15.setFont(Font.font(50));
        Button button16 = new Button("+");
        button16.setPrefSize(200, 100);button16.setFont(Font.font(50));

        Button button17 = new Button("1");
        button17.setPrefSize(200, 100);button17.setFont(Font.font(50));
        Button button18 = new Button("2");
        button18.setPrefSize(200, 100);button18.setFont(Font.font(50));
        Button button19 = new Button("3");
        button19.setPrefSize(200, 100);button19.setFont(Font.font(50));
        Button button21 = new Button("^");
        button21.setPrefSize(200, 100);button21.setFont(Font.font(50));

        Button button22 = new Button("%");
        button22.setPrefSize(200, 100);button22.setFont(Font.font(50));
        Button button23 = new Button("0");
        button23.setPrefSize(200, 100);button23.setFont(Font.font(50));
        Button button24 = new Button(".");
        button24.setPrefSize(200, 100);button24.setFont(Font.font(50));
        Button button25 = new Button("=");
        button25.setPrefSize(200, 100);button25.setFont(Font.font(50));

        pane1.add(button0, 0, 0);
        pane1.add(button1, 1, 0);
        pane1.add(button2, 2, 0);
        pane1.add(button3, 3, 0);

        pane1.add(button4, 0, 1);
        pane1.add(button5, 1, 1);
        pane1.add(button6, 2, 1);
        pane1.add(button7, 3, 1);

        pane1.add(button8, 0, 2);
        pane1.add(button9, 1, 2);
        pane1.add(button11, 2, 2);
        pane1.add(button12, 3, 2);

        pane1.add(button13, 0, 3);
        pane1.add(button14, 1, 3);
        pane1.add(button15, 2, 3);
        pane1.add(button16, 3, 3);

        pane1.add(button17, 0, 4);
        pane1.add(button18, 1, 4);
        pane1.add(button19, 2, 4);
        pane1.add(button21, 3, 4);

        pane1.add(button22, 0, 5);
        pane1.add(button23, 1, 5);
        pane1.add(button24, 2, 5);
        pane1.add(button25, 3, 5);
//        button0.setOnAction(event -> label1.setText("/"+""));
//        button1.setOnAction(event -> label1.setText("/"+""));
//        button2.setOnAction(event -> label1.setText("/"+""));
//        button3.setOnAction(event -> label1.setText("/"+""));

//        //Button4. Setonaction (event - > label1. Settext ("/ +" "); clear operation
//        button5.setOnAction(event -> label1.setText(label1.getText()+"/"));
//        button6.setOnAction(event -> label1.setText(label1.getText()+"*"));
//        //Button7.setonaction (event - > label1. Settext ("/ +" "); / / delete operation
//
//        button8.setOnAction(event -> label1.setText(label1.getText()+"7"));
//        button9.setOnAction(event -> label1.setText(label1.getText()+"8"));
//        button11.setOnAction(event -> label1.setText(label1.getText()+"9"));
//        button12.setOnAction(event -> label1.setText(label1.getText()+"-"));
//
//        button13.setOnAction(event -> label1.setText(label1.getText()+"4"));
//        button14.setOnAction(event -> label1.setText(label1.getText()+"5"));
//        button15.setOnAction(event -> label1.setText(label1.getText()+"6"));
//        button16.setOnAction(event -> label1.setText(label1.getText()+"+"));
//
//        button17.setOnAction(event -> label1.setText(label1.getText()+"1"));
//        button18.setOnAction(event -> label1.setText(label1.getText()+"2"));
//        button19.setOnAction(event -> label1.setText(label1.getText()+"3"));
//        button21.setOnAction(event -> label1.setText(label1.getText()+"^"));
//
//        button22.setOnAction(event -> label1.setText(label1.getText()+"%"));
//        button23.setOnAction(event -> label1.setText(label1.getText()+"0"));
//        button24.setOnAction(event -> label1.setText(label1.getText()+"."));
//        button25.setOnAction(event -> label1.setText(label1.getText()+"=
        button0.setOnAction((EventHandler<ActionEvent>) new action());
        button1.setOnAction(new action());
        button2.setOnAction(new action());
        button3.setOnAction(new action());

        button4.setOnAction(new action());//clear operation
        button5.setOnAction(new action());
        button6.setOnAction(new action());
        button7.setOnAction(new action());//delete operation

        button8.setOnAction(new action());
        button9.setOnAction(new action());
        button11.setOnAction(new action());
        button12.setOnAction(new action());

        button13.setOnAction(new action());
        button14.setOnAction(new action());
        button15.setOnAction(new action());
        button16.setOnAction(new action());

        button17.setOnAction(new action());
        button18.setOnAction(new action());
        button19.setOnAction(new action());
        button21.setOnAction(new action());

        button22.setOnAction(new action());
        button23.setOnAction(new action());
        button24.setOnAction(new action());
        button25.setOnAction(new action());

        label1.setPrefSize(800, 400);
        label1.setFont(Font.font(50));
        label1.setTextAlignment(TextAlignment.LEFT);
        //VBox pane2=new VBox(label1);
        //pane2.setAlignment(Pos.BASELINE_LEFT);

        VBox pane = new VBox(10, label1, pane1);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
        }

class action implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent event) {
        String a = event.toString();
        String e = a.substring(a.length() - 3, a.length() - 2);
        char c = a.charAt(a.length() - 3);
        //System.out.println(c);

        if (e.equals("0") || e.equals("1") || e.equals("2") || e.equals("3")
                || e.equals("4") || e.equals("5") || e.equals("6") || e.equals("7")
                || e.equals("8") || e.equals("9") || e.equals(".")|| e.equals("+")
                || e.equals("-") || e.equals("*") || e.equals("/")|| e.equals("^")|| e.equals("(")|| e.equals(")")
        ) {
            lab.append(e);//Record characters
            label1.setText(lab.toString());
            System.out.println(e);
        } else if (e.equals("D")) {
            lab.deleteCharAt(lab.length() - 1);
            label1.setText(lab.toString());
            System.out.println("D");
        } else if (e.equals("C")) {
            lab = new StringBuilder();
            label1.setText(lab.toString());
        } else if (e.equals("=")){

            String expression = lab.toString();
            double result = com.example.fxko.Calculator1.conversion(expression);
            System.out.println(expression + " = " + result);
            label1.setText(expression+"="+result);
        }
    }
}
}
class ArithHelper {
    // Default division precision
    private static final int DEF_DIV_SCALE = 16;

    // This class cannot be instantiated
    private ArithHelper() {
    }

    public static double add(double v1, double v2) {
        java.math.BigDecimal b1 = new java.math.BigDecimal(Double.toString(v1));
        java.math.BigDecimal b2 = new java.math.BigDecimal(Double.toString(v2));
        return b1.add(b2).doubleValue();
    }

    public static double add(String v1, String v2) {
        java.math.BigDecimal b1 = new java.math.BigDecimal(v1);
        java.math.BigDecimal b2 = new java.math.BigDecimal(v2);
        return b1.add(b2).doubleValue();
    }

    public static double sub(double v1, double v2) {
        java.math.BigDecimal b1 = new java.math.BigDecimal(Double.toString(v1));
        java.math.BigDecimal b2 = new java.math.BigDecimal(Double.toString(v2));
        return b1.subtract(b2).doubleValue();
    }

    public static double sub(String v1, String v2) {
        java.math.BigDecimal b1 = new java.math.BigDecimal(v1);
        java.math.BigDecimal b2 = new java.math.BigDecimal(v2);
        return b1.subtract(b2).doubleValue();
    }

    public static double mul(double v1, double v2) {
        java.math.BigDecimal b1 = new java.math.BigDecimal(Double.toString(v1));
        java.math.BigDecimal b2 = new java.math.BigDecimal(Double.toString(v2));
        return b1.multiply(b2).doubleValue();
    }

    public static double mul(String v1, String v2) {
        java.math.BigDecimal b1 = new java.math.BigDecimal(v1);
        java.math.BigDecimal b2 = new java.math.BigDecimal(v2);
        return b1.multiply(b2).doubleValue();
    }

    public static double div(double v1, double v2) {
        return div(v1, v2, DEF_DIV_SCALE);
    }

    public static double div(String v1, String v2) {
        java.math.BigDecimal b1 = new java.math.BigDecimal(v1);
        java.math.BigDecimal b2 = new java.math.BigDecimal(v2);
        return b1.divide(b2, DEF_DIV_SCALE, java.math.BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static double div(double v1, double v2, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("The   scale   must   be   a   positive   integer   or   zero");
        }
        java.math.BigDecimal b1 = new java.math.BigDecimal(Double.toString(v1));
        java.math.BigDecimal b2 = new java.math.BigDecimal(Double.toString(v2));
        return b1.divide(b2, scale, java.math.BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static double round(double v, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("The   scale   must   be   a   positive   integer   or   zero");
        }
        java.math.BigDecimal b = new java.math.BigDecimal(Double.toString(v));
        java.math.BigDecimal one = new java.math.BigDecimal("1");
        return b.divide(one, scale, java.math.BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static double round(String v, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("The   scale   must   be   a   positive   integer   or   zero");
        }
        java.math.BigDecimal b = new java.math.BigDecimal(v);
        java.math.BigDecimal one = new java.math.BigDecimal("1");
        return b.divide(one, scale, java.math.BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}

class Calculator1 {
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