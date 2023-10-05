module com.rgga.converter{
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.rgga.converter to javafx.fxml;
    exports com.rgga.converter;
    exports com.rgga.converter.controller;
    opens com.rgga.converter.controller to javafx.fxml;
}