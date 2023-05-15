module com.example.jour5 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.jour5 to javafx.fxml;
    exports Jour5;
    opens Jour5 to javafx.fxml;
}