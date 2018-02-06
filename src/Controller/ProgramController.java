package Controller;

import View.ImageSlideshow;
import View.LoginScene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ProgramController {


    public ProgramController() {
    }

    public void setBackBtn(Button backBtn, Stage stage) {

        if (backBtn.getText() == "Back") {
            System.out.println("Back button selected");
            stage.setScene(LoginScene.createScene(stage));
        }


        
}
}

