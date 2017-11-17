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
        Scene scene = new Scene(rootPane, 800, 600);
        scene.getStylesheets().add("style.css");

        Label label = new Label();
        label.setText("Sign-up today!");
        label.setId("signup_header_text");
        label.setLayoutX(10);
        label.setLayoutY(10);
        rootPane.getChildren().add(label);

        // Username TextField Settings //
        TextField txtfield = new TextField();
        txtfield.setLayoutX(170);
        txtfield.setLayoutY(150);
        txtfield.setPrefWidth(300);
        txtfield.setPrefHeight(30);
        txtfield.setPromptText("Username");
        rootPane.getChildren().add(txtfield);

        // Password Box Settings
        PasswordField passfield = new PasswordField();
        passfield.setLayoutX(170);
        passfield.setLayoutY(200);
        passfield.setPrefWidth(300);
        passfield.setPrefHeight(30);
        passfield.setPromptText("Password");
        rootPane.getChildren().add(passfield);

        // Password Confirm-Box Settings
        PasswordField passfield1 = new PasswordField();
        passfield.setLayoutX(170);
        passfield.setLayoutY(250);
        passfield.setPrefWidth(300);
        passfield.setPrefHeight(30);
        passfield.setPromptText("Please re-enter password");
        rootPane.getChildren().add(passfield1);

        // Button Settings //
        Button btn = new Button();
        btn.setText("Register");
        btn.setLayoutX(170);
        btn.setLayoutY(300);
        btn.setPrefWidth(60);
        btn.setPrefHeight(30);
        btn.setOnAction((ae) -> controller.doValidation());
        rootPane.getChildren().add(btn);

        return scene;
    }

}
