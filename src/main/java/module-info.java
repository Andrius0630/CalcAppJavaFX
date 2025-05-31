module vu.oop.calcappjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens vu.oop.calcappjavafx to javafx.fxml;
    exports vu.oop.calcappjavafx;
}