package Jour5;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Job2 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();

        Button btn = new Button("Quit");
        btn.setOnAction(e -> {
            primaryStage.close();
        });

        root.setBottom(btn);
        BorderPane.setAlignment(btn, Pos.CENTER);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Job2");
        primaryStage.show();
    }
}
