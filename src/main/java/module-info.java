module com.example.labelejemplo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.labelejemplo to javafx.fxml;
    exports com.example.labelejemplo;
}