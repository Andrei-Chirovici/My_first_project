package View;

import Controller.LoginController;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;


import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginScene {

    public static Scene createScene(Stage stage) {

        LoginController controller = new LoginController();

        Pane rootPane = new Pane();
        Scene scene = new Scene(rootPane, 710, 600);
        scene.getStylesheets().add("style.css");

        // Label (Header) //
        Label label = new Label();
        label.setText("Welcome to the Login Portal");
        label.setId("headertext");
        label.setLayoutX(80);
        label.setLayoutY(10);
        rootPane.getChildren().add(label);


        // Label (Login) //
        Label label2 = new Label();
        label2.setText("Please enter your login details below:");
        label2.setId("standard_text");
        label2.setLayoutX(190);
        label2.setLayoutY(120);
        rootPane.getChildren().add(label2);


        // Label (Sign-up today) //
        Label label1 = new Label();
        label1.setText("Not registered yet? Sign-up today!");
        label1.setId("standard_text");
        label1.setLayoutX(190);
        label1.setLayoutY(310);
        rootPane.getChildren().add(label1);

        // Username TextField Settings //
        TextField username = new TextField();
        username.setLayoutX(190);
        username.setLayoutY(150);
        username.setPrefWidth(300);
        username.setPrefHeight(30);
        username.setPromptText("Username");
        rootPane.getChildren().add(username);

        // Password Box Settings
        PasswordField passfield = new PasswordField();
        passfield.setLayoutX(190);
        passfield.setLayoutY(200);
        passfield.setPrefWidth(300);
        passfield.setPrefHeight(30);
        passfield.setPromptText("Password");
        rootPane.getChildren().add(passfield);

        // Sign-Up Button Settings //
        Button btn1 = new Button();
        btn1.setText("Sign-Up");
        btn1.setLayoutX(190);
        btn1.setLayoutY(350);
        btn1.setPrefWidth(70);
        btn1.setPrefHeight(35);
        btn1.setOnAction((ae) -> controller.openSignupScene(stage));

        rootPane.getChildren().add(btn1);

        // Login Button Settings //
        Button btn2 = new Button();
        btn2.setText("Login");
        btn2.setLayoutX(190);
        btn2.setLayoutY(242);
        btn2.setPrefWidth(70);
        btn2.setPrefHeight(35);
        btn2.setOnAction((ae) -> controller.openMainMenu(username, passfield, stage));
        rootPane.getChildren().add(btn2);

        return scene;
    }


}
