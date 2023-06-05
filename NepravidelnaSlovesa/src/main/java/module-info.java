module com.example.nepravidelnaslovesa {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.nepravidelnaslovesa to javafx.fxml;
    exports com.example.nepravidelnaslovesa;
}