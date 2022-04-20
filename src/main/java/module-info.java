module com.example.happybird {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.happybird to javafx.fxml;
    exports com.example.happybird;
}