package Controller;

import View.SignupScene;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginController {

    public LoginController() {

    }

    public void openSignupScene(Stage stage) {

        System.out.println("OPEN SIGNUP SCENE!");

        Scene signupScene = SignupScene.createScene(stage);
        stage.setScene(signupScene);

    }

    public void openMainMenu(Stage stage) {

        System.out.println("OPEN MAIN MENU!");

    }


}
