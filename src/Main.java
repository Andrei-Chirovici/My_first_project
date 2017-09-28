import java.awt.*;
import java.util.Scanner;
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

public class Main {

    public static void main(String[] args) {
    launchFX();

    }

    private static void launchFX()
    {
        // Initialises JavaFX
        new JFXPanel();
        // Runs initialisation on the JavaFX thread
        Platform.runLater(() -> initialiseGUI());
    }

    private static void initialiseGUI()
    {
        Stage stage = new Stage();
        Pane rootPane = new Pane();
        stage.setScene(new Scene(rootPane));
        stage.show();

        Label label = new Label();
        label.setText("Welcome to the Login Portal");
        label.setId(fancytext);

        #fancytext {
        -fx-font: 100px Tahoma;
        -fx-fill: linear-gradient(from 0% 0% to 100% 200%, repeat, aqua 0%, red 50%);
        -fx-stroke: black;
        -fx-stroke-width: 1;
    }
            rootPane.getChilden().add(label);


        // Button Settings
        Button btn = new Button();
        btn.setText("Enter");
        btn.setLayoutX(170);
        btn.setLayoutY(250);
        btn.setPrefWidth(60);
        btn.setPrefHeight(30);
        btn.setOnAction((ActionEvent ae) -> printHello());
        rootPane.getChildren().add(btn);

        // Username TextField Settings
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
    }

    private static void printHello() {


    }
}
