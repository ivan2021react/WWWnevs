module com.example.wwwnevs {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.wwwnevs to javafx.fxml;
    exports com.example.wwwnevs;
}