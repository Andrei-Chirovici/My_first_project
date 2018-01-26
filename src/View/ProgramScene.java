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


        // Upload Image //
        Button btn_upload = new Button();
        btn_upload.setText("Register");
        btn_upload.setLayoutX(80);
        btn_upload.setLayoutY(310);
        btn_upload.setPrefWidth(70);
        btn_upload.setPrefHeight(35);
       // btn.setOnAction((ae) ->
        rootPane.getChildren().add(btn_upload);

        // View Image Portfolio //
        Button btn_portfolio = new Button();
        btn_portfolio.setText("Register");
        btn_portfolio.setLayoutX(80);
        btn_portfolio.setLayoutY(310);
        btn_portfolio.setPrefWidth(70);
        btn_portfolio.setPrefHeight(35);
        // btn.setOnAction((ae) ->
        rootPane.getChildren().add(btn_portfolio);

        return scene;
    }

}
