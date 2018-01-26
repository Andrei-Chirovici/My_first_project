package Controller;

import View.ProgramScene;
import View.SignupScene;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class LoginController {
    String Username = "Admin";
    String Password = "admin";

    public LoginController() {

    }

    public void openSignupScene(Stage stage) {

        System.out.println("OPEN SIGNUP SCENE!");

        Scene signupScene = SignupScene.createScene(stage);
        stage.setScene(signupScene);

    }

    public void openMainMenu(String username, String passfield, Stage stage) {

        String user = "admin";
        String pass = "admin";

        if (user .equals(username) && pass .equals(passfield)) {
            System.out.println("Username and Password correct.");
            Scene programScene = ProgramScene.createScene(stage);
            stage.setScene(programScene);
        } else {
            System.out.println("Incorrect");

        }


        // Hash Password
        // Compare to database Username and hashed password
        // If they match, open Main Menu scene
        // If not, send message "Username or password incorrect"

    }


}
