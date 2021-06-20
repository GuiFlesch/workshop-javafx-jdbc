module workshop.javafx.jdbc {

    requires javafx.controls;
    requires javafx.fxml;

    exports application;
    opens gui;
}