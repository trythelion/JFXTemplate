module ca.tlcp.examplefxproject.fx.project {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.tlcp.examplefxproject.fx.project to javafx.fxml;
    exports ca.tlcp.examplefxproject.fx.project;
}