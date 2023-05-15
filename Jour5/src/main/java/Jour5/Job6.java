package Jour5;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Job6 extends Application {

    @Override
    public void start(Stage primaryStage) {
        ObservableList<String> choices = FXCollections.observableArrayList("Choice 1", "Choice 2", "Choice 3");
        ChoiceBox<String> choiceBox = new ChoiceBox<>(choices);

        ColorPicker colorPicker = new ColorPicker(Color.BLACK);

        Button button = new Button("OK");
        button.setOnAction(e -> {
            String selectedChoice = choiceBox.getSelectionModel().getSelectedItem();
            Color selectedColor = colorPicker.getValue();
            System.out.println("Selected choice : " + selectedChoice);
            System.out.println("Selected color : " + selectedColor);
        });

        VBox root = new VBox(10, choiceBox, colorPicker, button);

        Scene scene = new Scene(root, 250, 150);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Job6");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
