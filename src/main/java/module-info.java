module com.shoxxie.guiclient {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.shoxxie.guiclient to javafx.fxml;
    exports com.shoxxie.guiclient;
}