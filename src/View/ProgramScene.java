package View;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ProgramScene {

    public static Scene createScene(Stage stage) {

        Pane rootPane = new Pane();
        Scene scene = new Scene(rootPane, 710, 600);
        scene.getStylesheets ().add("style.css");



        return scene;
    }

}
