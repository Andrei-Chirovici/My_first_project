package Controller;


import View.LoginScene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

public class SignupController {

    public SignupController() {
    }

    public void doValidation(Button btn, Stage stage, PasswordField passfield, PasswordField passfield1, TextField txtfield) {

        System.out.println("DO VALIDATION!");

        if(btn.getText()=="Back") {
            System.out.println("Back button selected");
            stage.setScene(LoginScene.createScene(stage));
        }

        if(passfield.getText() != passfield1.getText()) {
                System.out.println("Passwords do not match");
        }

    }

}
