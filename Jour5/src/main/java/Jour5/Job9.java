package Jour5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

public class Job9 extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button exitButton = new Button("Exit");
        exitButton.setOnAction(event -> {
            Alert confirmation = new Alert(AlertType.CONFIRMATION);
            confirmation.setTitle("Confirmation");
            confirmation.setHeaderText("Are you sure you want to exit?");
            confirmation.setContentText("Any unsaved changes will be lost.");
            confirmation.showAndWait().ifPresent(response -> {
                if (response == javafx.scene.control.ButtonType.OK) {
                    primaryStage.close();
                }
            });
        });

        Button errorButton = new Button("Show Error");
        errorButton.setOnAction(event -> {
            Alert error = new Alert(AlertType.ERROR);
            error.setTitle("Error");
            error.setHeaderText("Invalid input");
            error.setContentText("Please enter a valid input.");
            error.showAndWait();
        });

        VBox container = new VBox();
        container.getChildren().addAll(exitButton, errorButton);
        container.alignmentProperty().set(javafx.geometry.Pos.CENTER);
        container.setSpacing(10);


        StackPane root = new StackPane();
        root.getChildren().add(container);

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

