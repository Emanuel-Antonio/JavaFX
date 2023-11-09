module com.example.conversorunidade {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.conversorunidade to javafx.fxml;
    exports com.example.conversorunidade;
}