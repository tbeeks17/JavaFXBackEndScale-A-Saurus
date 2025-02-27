module com.scaleasaurus {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.controllers to javafx.fxml; 
    opens com.model to javafx.fxml;
    
    exports com;
    exports com.controllers;
    exports com.model;
}
