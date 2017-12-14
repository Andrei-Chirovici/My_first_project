package Controller;


import View.LoginScene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

import java.sql.SQLInput;

public class SignupController {

    public SignupController() {
    }

    public void setBackBtn(Button backBtn, Stage stage) {

        if (backBtn.getText() == "Back") {
            System.out.println("Back button selected");
            stage.setScene(LoginScene.createScene(stage));
        }
    }

    public void setRegisterBtn(Button btn, Stage stage, PasswordField passfield, PasswordField passfield1, TextField username) {

        if (passfield.getText() != passfield1.getText()) {
            System.out.println("Passwords do not match");


        }



    }



}

