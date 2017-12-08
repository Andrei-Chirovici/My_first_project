package Controller;

import View.SignupScene;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class LoginController {

    public LoginController() {

    }

    public void openSignupScene(Stage stage) {

        System.out.println("OPEN SIGNUP SCENE!");

        Scene signupScene = SignupScene.createScene(stage);
        stage.setScene(signupScene);

    }

    public void openMainMenu(TextField txtfield, PasswordField passfield, Stage stage) {
        System.out.println("OPEN MAIN MENU!");

        String Username = txtfield.getText();
        String Password = passfield.getText();

        // Hash Password
        // Compare to database Username and hashed password
        // If they match, open Main Menu scene
        // If not, send message "Username or password incorrect"

    }


}
