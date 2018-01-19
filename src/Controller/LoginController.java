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

    public void openMainMenu(TextField username, PasswordField passfield, Stage stage) {



        boolean user = false;
        boolean pass = false;

        if(username.getText() == Username) {
            user = true;
        }

        if(passfield.getText() == Password) {
            pass = true;
        }

        //username.getText() == Username && passfield.getText() == Password
        if (user && pass) {
            System.out.println("Username and Password correct.");
            Scene programScene = ProgramScene.createScene(stage);
            stage.setScene(programScene);
        } else {
            System.out.println("Incorrect");
            System.out.println(pass);
            System.out.println(user);

        }



        // Hash Password
        // Compare to database Username and hashed password
        // If they match, open Main Menu scene
        // If not, send message "Username or password incorrect"

    }


}
