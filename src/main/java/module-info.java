module com.example.financaspessoais {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.financaspessoais to javafx.fxml;
    exports com.example.financaspessoais;
}