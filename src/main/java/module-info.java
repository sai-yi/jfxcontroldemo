module zero.saiyi.jfxcontroldemo {
    requires javafx.controls;
    requires javafx.fxml;

    opens zero.saiyi.jfxcontroldemo to javafx.fxml;
    exports zero.saiyi.jfxcontroldemo;
}