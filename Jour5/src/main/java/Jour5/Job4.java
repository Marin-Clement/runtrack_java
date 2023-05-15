package Jour5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Job4 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label nameLabel = new Label("Name :");
        TextField nameField = new TextField();
        Button sendButton = new Button("Send");

        FlowPane layout = new FlowPane();
        layout.getChildren().addAll(nameLabel, nameField, sendButton);

        nameLabel.setStyle("-fx-font-size: 18pt; -fx-text-fill: #F00;");
        nameField.setStyle("-fx-font-size: 18pt; -fx-background-color: #0F0;");
        sendButton.setStyle("-fx-font-size: 18pt; -fx-background-color: #00F; -fx-text-fill: #FFF;");
        layout.setStyle("-fx-background-color: #CCC; -fx-padding: 20px;");

        Scene scene = new Scene(layout);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Job4");
        primaryStage.show();

        sendButton.setOnAction(e -> {
            System.out.println("Nom : " + nameField.getText());
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
