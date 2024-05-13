package university;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class homepageBase extends BorderPane {

    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final RowConstraints rowConstraints4;
    protected final TextField txtpassword;
    protected final TextField txtusername;
    protected final Button btnlogin;
    protected final Button btnsignup;

    public homepageBase() {

        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        rowConstraints4 = new RowConstraints();
        txtpassword = new TextField();
        txtusername = new TextField();
        btnlogin = new Button();
        btnsignup = new Button();

        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(600.0);
        setPrefWidth(600.0);
        getStylesheets().add("/university/styles2.css");

        BorderPane.setAlignment(gridPane, javafx.geometry.Pos.CENTER);
        gridPane.setPrefHeight(600.0);
        gridPane.setPrefWidth(600.0);
        gridPane.setStyle("-fx-text-fill: white;");

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(195.0);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(162.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(333.0);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(279.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMaxWidth(182.0);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(162.0);

        rowConstraints.setMaxHeight(310.0);
        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(231.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMaxHeight(307.0);
        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(57.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMaxHeight(293.0);
        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(54.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMaxHeight(217.0);
        rowConstraints2.setMinHeight(5.0);
        rowConstraints2.setPrefHeight(54.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMaxHeight(242.0);
        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(59.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints4.setMaxHeight(194.0);
        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPrefHeight(145.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(txtpassword, 1);
        GridPane.setRowIndex(txtpassword, 2);
        txtpassword.setAlignment(javafx.geometry.Pos.CENTER);
        txtpassword.setPromptText("Password");
        txtpassword.setStyle("-fx-background-color: transparent; -fx-border-color: gray; -fx-border-width: 0 0 2 0; -fx-prompt-text-fill: rgba(255, 255, 255, 0.8); -fx-text-fill: white;");
        txtpassword.setFont(new Font(20.0));

        GridPane.setColumnIndex(txtusername, 1);
        GridPane.setRowIndex(txtusername, 1);
        txtusername.setAlignment(javafx.geometry.Pos.CENTER);
        txtusername.setPromptText("Username");
        txtusername.setStyle("-fx-prompt-text-fill: rgba(255, 255, 255, 0.8); -fx-background-color: transparent; -fx-border-color: gray; -fx-border-width: 0 0 2 0; -fx-text-fill: white;");
        txtusername.setFont(new Font(20.0));

        GridPane.setColumnIndex(btnlogin, 1);
        GridPane.setRowIndex(btnlogin, 3);
        btnlogin.setMnemonicParsing(false);
        btnlogin.setPrefHeight(40.0);
        btnlogin.setPrefWidth(200.0);
        btnlogin.setStyle("-fx-background-radius: 100;");
        btnlogin.setText("Log In");
        GridPane.setMargin(btnlogin, new Insets(0.0, 30.0, 0.0, 30.0));

        GridPane.setColumnIndex(btnsignup, 1);
        GridPane.setRowIndex(btnsignup, 4);
        btnsignup.setMnemonicParsing(false);
        btnsignup.setPrefHeight(40.0);
        btnsignup.setPrefWidth(200.0);
        btnsignup.setStyle("-fx-background-radius: 100;");
        btnsignup.setText("Sign Up");
        GridPane.setMargin(btnsignup, new Insets(0.0, 30.0, 0.0, 30.0));
        setCenter(gridPane);

        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getRowConstraints().add(rowConstraints2);
        gridPane.getRowConstraints().add(rowConstraints3);
        gridPane.getRowConstraints().add(rowConstraints4);
        gridPane.getChildren().add(txtpassword);
        gridPane.getChildren().add(txtusername);
        gridPane.getChildren().add(btnlogin);
        gridPane.getChildren().add(btnsignup);
        
        
         btnlogin.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Create a new instance of DepartmentsScene
                FXMLDocumentBase fXMLdocumentBase = new FXMLDocumentBase();

                // Get the current stage (assuming it is created in your main class)
                Stage stage = (Stage) getScene().getWindow();

                // Create a new scene with the DepartmentsScene and set it to the stage
                Scene scene = new Scene(fXMLdocumentBase, 848, 542);
                stage.setScene(scene);
            }
        });

    }
}
