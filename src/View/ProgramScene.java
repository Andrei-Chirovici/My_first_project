package View;

import Controller.ProgramController;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ProgramScene {

    public static Scene createScene(Stage stage) {

        ProgramController controller = new ProgramController();

        Pane rootPane = new Pane();
        Scene scene = new Scene(rootPane, 710, 600);
        scene.getStylesheets ().add("style.css");

        // Label (Header) //
        Label label = new Label();
        label.setText("Picture Suite by Andrei ");
        label.setId("program_header_text");
        label.setLayoutX(20);
        label.setLayoutY(10);
        rootPane.getChildren().add(label);

        // Label (Copyright) //
        Label label_c = new Label();
        label_c.setText("© Picture Suite by Andrei / Copyright 2018");
        label_c.setId("copyright_text");
        label_c.setLayoutX(475);
        label_c.setLayoutY(580);
        rootPane.getChildren().add(label_c);

        // BACK - Button Settings //
        Button backBtn = new Button();
        backBtn.setText("Back");
        backBtn.setLayoutX(340);
        backBtn.setLayoutY(12);
        backBtn.setPrefWidth(70);
        backBtn.setPrefHeight(35);
        backBtn.setOnAction((ae) -> controller.setBackBtn(backBtn, stage));
        rootPane.getChildren().add(backBtn);


        // Upload Image Button //
        Button btn_upload = new Button();
        btn_upload.setText("Upload");
        btn_upload.setLayoutX(20);
        btn_upload.setLayoutY(290);
        btn_upload.setPrefWidth(100);
        btn_upload.setPrefHeight(75);
       // btn.setOnAction((ae) ->
        rootPane.getChildren().add(btn_upload);

        // View Image Portfolio Button //
        Button btn_portfolio = new Button();
        btn_portfolio.setText("View Images");
        btn_portfolio.setLayoutX(150);
        btn_portfolio.setLayoutY(290);
        btn_portfolio.setPrefWidth(130);
        btn_portfolio.setPrefHeight(75);
       // btn.setOnAction((ae) -> controller.viewImages();
        rootPane.getChildren().add(btn_portfolio);


        // Settings Button //
        Button btn_settings = new Button();
        btn_settings.setText("Settings");
        btn_settings.setLayoutX(450);
        btn_settings.setLayoutY(290);
        btn_settings.setPrefWidth(100);
        btn_settings.setPrefHeight(75);
        // btn.setOnAction((ae) ->
        rootPane.getChildren().add(btn_settings);

        return scene;
    }

}
