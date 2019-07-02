module PS {
    requires javafx.base;
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;
    requires java.sql;
    requires itextpdf;

    opens controller;
    opens main;
    opens model.dto;
    opens resursi;
    opens view;
}