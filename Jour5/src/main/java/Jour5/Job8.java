package Jour5;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Job8 extends Application {

    @Override
    public void start(Stage primaryStage) {

        VBox pane1 = new VBox();
        pane1.setSpacing(10);
        pane1.setPadding(new Insets(10));
        pane1.getChildren().addAll(new Label("Pane 1"), new Label("This is the first pane"));

        HBox pane2 = new HBox();
        pane2.setSpacing(10);
        pane2.setPadding(new Insets(10));
        pane2.getChildren().addAll(new Label("Pane 2"), new Label("This is the second pane"));

        VBox pane3 = new VBox();
        pane3.setSpacing(10);
        pane3.setPadding(new Insets(10));
        pane3.getChildren().addAll(new Label("Pane 3"), new Label("This is the third pane"));

        TabPane tabPane = new TabPane();
        Tab tab1 = new Tab("Pane 1", pane1);
        Tab tab2 = new Tab("Pane 2", pane2);
        Tab tab3 = new Tab("Pane 3", pane3);
        tabPane.getTabs().addAll(tab1, tab2, tab3);
        tabPane.setTabClosingPolicy(TabPane.TabClosingPolicy.UNAVAILABLE);

        Scene scene = new Scene(tabPane, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
