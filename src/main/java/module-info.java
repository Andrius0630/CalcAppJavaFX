module vu.oop.calcappjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;

    opens vu.oop.calcappjavafx to javafx.fxml;
    exports vu.oop.calcappjavafx;
}