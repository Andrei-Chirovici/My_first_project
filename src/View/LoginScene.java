package View;

import Controller.LoginController;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LoginScene {

    public static Scene createScene(Stage stage) {

        LoginController controller = new LoginController();

        Pane rootPane = new Pane();
        Scene scene = new Scene(rootPane, 800, 600);
        scene.getStylesheets().add("style.css");

        // Label //
        Label label = new Label();
        label.setText("Welcome to the Login Portal");
        label.setId("headertext");
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

        // Sign-Up Button Settings //
        Button btn1 = new Button();
        btn1.setText("Sign-Up");
        btn1.setLayoutX(170);
        btn1.setLayoutY(350);
        btn1.setPrefWidth(60);
        btn1.setPrefHeight(30);
        btn1.setOnAction((ae) -> controller.openSignupScene(stage));

        rootPane.getChildren().add(btn1);

        // Login Button Settings //
        Button btn2 = new Button();
        btn2.setText("Login");
        btn2.setLayoutX(170);
        btn2.setLayoutY(300);
        btn2.setPrefWidth(60);
        btn2.setPrefHeight(30);
        btn2.setOnAction((ae) -> controller.openMainMenu(stage));
        rootPane.getChildren().add(btn2);

        return scene;
    }


}
