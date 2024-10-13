module com.example.taskmanagerapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.taskmanagerapp to javafx.fxml;
    exports com.example.taskmanagerapp;
    exports com.example.taskmanager;
    opens com.example.taskmanager to javafx.fxml;
}