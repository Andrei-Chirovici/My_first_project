package View;

import Controller.SignupController;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SignupScene {

    public static Scene createScene(Stage stage) {

        SignupController controller = new SignupController();

        Pane rootPane = new Pane();
        Scene scene = new Scene(rootPane, 710, 600);
        scene.getStylesheets().add("style.css");

        Label label = new Label();
        label.setText("Sign-up today!");
        label.setId("signup_header_text");
        label.setLayoutX(10);
        label.setLayoutY(10);
        rootPane.getChildren().add(label);

        // Username TextField Settings //
        TextField txtfield = new TextField();
        txtfield.setLayoutX(190);
        txtfield.setLayoutY(150);
        txtfield.setPrefWidth(300);
        txtfield.setPrefHeight(30);
        txtfield.setPromptText("Username");
        rootPane.getChildren().add(txtfield);

        // Password Box Settings
        PasswordField passfield = new PasswordField();
        passfield.setLayoutX(190);
        passfield.setLayoutY(200);
        passfield.setPrefWidth(300);
        passfield.setPrefHeight(30);
        passfield.setPromptText("Password");
        rootPane.getChildren().add(passfield);

        // Password (Confirm-Box) Settings
        PasswordField passfield1 = new PasswordField();
        passfield1.setLayoutX(190);
        passfield1.setLayoutY(250);
        passfield1.setPrefWidth(300);
        passfield1.setPrefHeight(30);
        passfield1.setPromptText("Please re-enter password");
        rootPane.getChildren().add(passfield1);

        // REGISTER - Button Settings //
        Button btn = new Button();
        btn.setText("Register");
        btn.setLayoutX(280);
        btn.setLayoutY(300);
        btn.setPrefWidth(70);
        btn.setPrefHeight(35);
        btn.setOnAction((ae) -> controller.doValidation(btn, stage));
        rootPane.getChildren().add(btn);


        // BACK - Button Settings //
        Button backBtn = new Button();
        backBtn.setText("Back");
        backBtn.setLayoutX(190);
        backBtn.setLayoutY(300);
        backBtn.setPrefWidth(70);
        backBtn.setPrefHeight(35);
        backBtn.setOnAction((ae) -> controller.doValidation(backBtn, stage));
        rootPane.getChildren().add(backBtn);

        return scene;
    }

}
