module com.example.td12 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.td12 to javafx.fxml;
    exports com.example.td12;
}