package Jour5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Job3 extends Application{

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();

        FlowPane flowPane = new FlowPane();
        flowPane.setPadding(new Insets(10));
        flowPane.setHgap(10);
        flowPane.getChildren().add(new Label("Name :"));
        TextField textField = new TextField();
        flowPane.getChildren().add(textField);
        Button button = new Button("Send");
        button.setOnAction(event -> System.out.println(textField.getText()));
        flowPane.getChildren().add(button);

        root.setCenter(flowPane);

        Button closeButton = new Button("Quit");
        closeButton.setOnAction(event -> primaryStage.close());
        root.setBottom(closeButton);

        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("Job3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
