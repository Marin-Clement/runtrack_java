package Jour5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Job7 extends Application {
    @Override
    public void start(Stage primaryStage) {
    TableView<Person> table = new TableView<>();
    TableColumn<Person, String> nameColumn = new TableColumn<>("Name");
    TableColumn<Person, Integer> ageColumn = new TableColumn<>("Age");
    nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
    ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));
    table.getColumns().addAll(nameColumn, ageColumn);
    table.getItems().addAll(
            new Person("Alice", 25),
            new Person("Bob", 30),
            new Person("Charlie", 35)
    );

    Button exportBtn = new Button("Export");
    exportBtn.setOnAction(event -> {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save Data");
        fileChooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("CSV File (*.csv)", "*.csv")
        );
        File file = fileChooser.showSaveDialog(primaryStage);
        if (file != null) {
            try {
                FileWriter writer = new FileWriter(file);
                writer.write("Name, Age\n");
                for (Person person : table.getItems()) {
                    writer.write(person.getName() + "," + person.getAge() + "\n");
                }
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    });

    VBox root = new VBox();
    root.getChildren().addAll(table, exportBtn);

    Scene scene = new Scene(root, 300, 250);
    primaryStage.setScene(scene);
    primaryStage.show();
}

public static void main(String[] args) {
    launch(args);
}

public static class Person {
        private final String name;
        private final int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}