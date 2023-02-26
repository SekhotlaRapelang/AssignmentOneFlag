module com.example.exciseflag {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exciseflag to javafx.fxml;
    exports com.example.exciseflag;
}