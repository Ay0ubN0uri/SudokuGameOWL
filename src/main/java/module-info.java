module com.a00n.sudokugameowl {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires lombok;
//    requires org.projectlombok;
    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

//    requires eu.hansolo.tilesfx;

    opens com.a00n.sudokugameowl to javafx.fxml;
    exports com.a00n.sudokugameowl;
}