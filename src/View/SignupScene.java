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

        // Sign-up Header //
        Label label = new Label();
        label.setText("Sign-up today!");
        label.setId("program_header_text");
        label.setLayoutX(80);
        label.setLayoutY(25);
        rootPane.getChildren().add(label);

        Label label_details = new Label();
        label_details.setText("Please fill in the following details:");
        label_details.setId("standard_text");
        label_details.setLayoutX(80);
        label_details.setLayoutY(122);
        rootPane.getChildren().add(label_details);

        // Label (Copyright) //
        Label label_c = new Label();
        label_c.setText("© Picture Suite by Andrei / Copyright 2018");
        label_c.setId("copyright_text");
        label_c.setLayoutX(475);
        label_c.setLayoutY(580);
        rootPane.getChildren().add(label_c);

        // Username TextField Settings //
        TextField txtfield = new TextField();
        txtfield.setLayoutX(80);
        txtfield.setLayoutY(160);
        txtfield.setPrefWidth(300);
        txtfield.setPrefHeight(30);
        txtfield.setPromptText("Username");
        rootPane.getChildren().add(txtfield);

        // Password Box Settings
        PasswordField passfield = new PasswordField();
        passfield.setLayoutX(80);
        passfield.setLayoutY(210);
        passfield.setPrefWidth(300);
        passfield.setPrefHeight(30);
        passfield.setPromptText("Password");
        rootPane.getChildren().add(passfield);

        // Password (Confirm-Box) Settings
        PasswordField passfield1 = new PasswordField();
        passfield1.setLayoutX(80);
        passfield1.setLayoutY(260);
        passfield1.setPrefWidth(300);
        passfield1.setPrefHeight(30);
        passfield1.setPromptText("Please re-enter password");
        rootPane.getChildren().add(passfield1);

        // REGISTER - Button Settings //
        Button btn = new Button();
        btn.setText("Register");
        btn.setLayoutX(80);
        btn.setLayoutY(310);
        btn.setPrefWidth(70);
        btn.setPrefHeight(35);
        btn.setOnAction((ae) -> controller.setRegisterBtn(btn, stage, passfield, passfield1, txtfield));
        rootPane.getChildren().add(btn);


        // BACK - Button Settings //
        Button backBtn = new Button();
        backBtn.setText("Back");
        backBtn.setLayoutX(170);
        backBtn.setLayoutY(310);
        backBtn.setPrefWidth(70);
        backBtn.setPrefHeight(35);
        backBtn.setOnAction((ae) -> controller.setBackBtn(backBtn, stage));
        rootPane.getChildren().add(backBtn);

        return scene;
    }

}
