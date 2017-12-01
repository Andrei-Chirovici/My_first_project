package Controller;


import View.LoginScene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SignupController {

    public SignupController() {
    }

    public void doValidation(Button btn, Stage stage) {

        System.out.println("DO VALIDATION!");
        if(btn.getText()=="Back") {
            System.out.println("Back button selected");
            stage.setScene(LoginScene.createScene(stage));
        }
    }

}
