module com.example.dz_krest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dz_krest to javafx.fxml;
    exports com.example.dz_krest;
}