package Jour5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Job5 extends Application {

    @Override
    public void start(Stage primaryStage) {
        TextField textField = new TextField();
        Button sendButton = new Button("Send");

        sendButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String name = textField.getText();
                System.out.println("Name : " + name);
            }
        });

        FlowPane root = new FlowPane();
        root.getChildren().addAll(textField, sendButton);

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Job5");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
