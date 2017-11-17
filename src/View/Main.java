package View;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


    public class Main extends Application {

        @Override
        public void start(Stage stage1) throws Exception {

            Scene loginScene = LoginScene.createScene(stage1);

            stage1.setScene(loginScene);
            stage1.show();
        }

        public static void main(String[] args) {
            launch(args);
        }

    }
