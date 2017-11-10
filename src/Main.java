import java.awt.*;
import java.util.Scanner;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.event.*;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javax.swing.text.StyledEditorKit;


    public class Main extends Application {

        @Override
        public void start(Stage stage1) throws Exception {

            stage1.setScene(loginScene());
            stage1.show();

        public static void main(String[] args) {
            launch(args);
        }


        private static Scene loginScene() {

            Pane rootPane = new Pane();
            Scene scene = new Scene(rootPane);
            scene.getStylesheets().add("style.css");

            // Label //
            Label label = new Label();
            label.setText("Welcome to the Login Portal");
            label.setId("fancytext");
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
            btn1.setOnAction((ActionEvent ae) -> stage1.setScene(signupScene()) & stage1.show());

            rootPane.getChildren().add(btn1);

            // Login Button Settings //
            Button btn2 = new Button();
            btn2.setText("Login");
            btn2.setLayoutX(170);
            btn2.setLayoutY(300);
            btn2.setPrefWidth(60);
            btn2.setPrefHeight(30);
            btn2.setOnAction((ActionEvent ae) -> mainScreen());
            rootPane.getChildren().add(btn2);

            return scene;
        }

      }
        public static Scene signupScene() {

            Pane rootPane = new Pane();
            Scene scene = new Scene(rootPane);
            scene.getStylesheets().add("style.css");

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
            btn.setOnAction((ActionEvent ae) -> validation());
            rootPane.getChildren().add(btn);

            return signupScene();
        }

        private static void validation() {

            //Check if passwords match


        }

        private static void mainScreen() {


        }
    }
