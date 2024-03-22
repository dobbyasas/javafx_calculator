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

public class CalculatorApp extends Application{
  StringBuilder lab = new StringBuilder();
          Label label1 = new Label();

          public static void main(String[] args) {
            launch(args);
        }

@Override
public void start(Stage primaryStage) {

        GridPane pane1 = new GridPane();
        pane1.setAlignment(Pos.CENTER);
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

        button0.setOnAction((EventHandler<ActionEvent>) new action());
        button1.setOnAction(new action());
        button2.setOnAction(new action());
        button3.setOnAction(new action());

        button4.setOnAction(new action());
        button5.setOnAction(new action());
        button6.setOnAction(new action());
        button7.setOnAction(new action());

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

        label1.setPrefSize(400, 200);
        label1.setFont(Font.font(50));
        label1.setTextAlignment(TextAlignment.LEFT);

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

        if (e.equals("0") || e.equals("1") || e.equals("2") || e.equals("3")
                || e.equals("4") || e.equals("5") || e.equals("6") || e.equals("7")
                || e.equals("8") || e.equals("9") || e.equals(".")|| e.equals("+")
                || e.equals("-") || e.equals("*") || e.equals("/")|| e.equals("^")|| e.equals("(")|| e.equals(")")
        )
        {
            lab.append(e);//Record characters
            label1.setText(lab.toString());
            System.out.println(e);
        }
        else if (e.equals("D")) {
            lab.deleteCharAt(lab.length() - 1);
            label1.setText(lab.toString());
            System.out.println("D");
        }
        else if (e.equals("C")) {
            lab = new StringBuilder();
            label1.setText(lab.toString());
        }
        else if (e.equals("=")){

            String expression = lab.toString();
            double result = com.example.fxko.Calculator.conversion(expression);
            System.out.println(expression+"="+result);
            label1.setText(String.valueOf(result));
        }
    }
}
}
