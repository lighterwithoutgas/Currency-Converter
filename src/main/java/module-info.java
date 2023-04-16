module com.example.javafxnumber1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxnumber1 to javafx.fxml;
    exports com.example.javafxnumber1;
}