module com.example.fxko {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.fxko to javafx.fxml;
    exports com.example.fxko;
}