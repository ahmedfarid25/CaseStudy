package university;

import db.DataAccessLayer;
import dto.Course;
import dto.Student;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class FXMLDocumentBase extends BorderPane {

    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final ColumnConstraints columnConstraints2;
    protected final ColumnConstraints columnConstraints3;
    protected final RowConstraints rowConstraints;
    protected final Button btnSelect;
    protected final Button btnInsert;
    protected final Button btnUpdate;
    protected final Button btnDelete;
    protected final Button btnNextPage;
    protected final GridPane gridPane0;
    protected final ColumnConstraints columnConstraints4;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final RowConstraints rowConstraints4;
    protected final RowConstraints rowConstraints5;
    protected final Label Label_id;
    protected final Label Label_fname;
    protected final Label Label_deptid;
    protected final Label Label_email;
    protected final Label Label_phone;
    protected final Label Label_lname;
    protected final GridPane gridPane1;
    protected final ColumnConstraints columnConstraints5;
    protected final RowConstraints rowConstraints6;
    protected final RowConstraints rowConstraints7;
    protected final RowConstraints rowConstraints8;
    protected final RowConstraints rowConstraints9;
    protected final RowConstraints rowConstraints10;
    protected final RowConstraints rowConstraints11;
    protected final TextField txtID;
    protected final TextField txtLname;
    protected final TextField txtPhone;
    protected final TextField txtDeptid;
    protected final TextField txtEmail;
    protected final TextField txtFname;
    protected final Label label;

    public FXMLDocumentBase() {

        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        columnConstraints2 = new ColumnConstraints();
        columnConstraints3 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        btnSelect = new Button();
        btnInsert = new Button();
        btnUpdate = new Button();
        btnDelete = new Button();
        btnNextPage = new Button();
        gridPane0 = new GridPane();
        columnConstraints4 = new ColumnConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        rowConstraints4 = new RowConstraints();
        rowConstraints5 = new RowConstraints();
        Label_id = new Label();
        Label_fname = new Label();
        Label_deptid = new Label();
        Label_email = new Label();
        Label_phone = new Label();
        Label_lname = new Label();
        gridPane1 = new GridPane();
        columnConstraints5 = new ColumnConstraints();
        rowConstraints6 = new RowConstraints();
        rowConstraints7 = new RowConstraints();
        rowConstraints8 = new RowConstraints();
        rowConstraints9 = new RowConstraints();
        rowConstraints10 = new RowConstraints();
        rowConstraints11 = new RowConstraints();
        txtID = new TextField();
        txtLname = new TextField();
        txtPhone = new TextField();
        txtDeptid = new TextField();
        txtEmail = new TextField();
        txtFname = new TextField();
        label = new Label();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(542.0);
        setPrefWidth(848.0);
        getStylesheets().add("/university/styles.css");

        BorderPane.setAlignment(gridPane, javafx.geometry.Pos.CENTER);
        gridPane.setPrefHeight(47.0);
        gridPane.setPrefWidth(755.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(100.0);

        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMinWidth(10.0);
        columnConstraints3.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(btnSelect, 3);
        btnSelect.setMnemonicParsing(false);
        btnSelect.setText("Select");
        GridPane.setMargin(btnSelect, new Insets(0.0, 0.0, 10.0, 0.0));

        btnInsert.setAlignment(javafx.geometry.Pos.CENTER);
        btnInsert.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        btnInsert.setMnemonicParsing(false);
        btnInsert.setPrefHeight(31.0);
        btnInsert.setText("Insert");
        GridPane.setMargin(btnInsert, new Insets(0.0, 0.0, 10.0, 20.0));

        GridPane.setColumnIndex(btnUpdate, 1);
        btnUpdate.setMnemonicParsing(false);
        btnUpdate.setPrefHeight(31.0);
        btnUpdate.setText("Update");
        GridPane.setMargin(btnUpdate, new Insets(0.0, 0.0, 10.0, 0.0));

        GridPane.setColumnIndex(btnDelete, 2);
        btnDelete.setAlignment(javafx.geometry.Pos.CENTER);
        btnDelete.setMnemonicParsing(false);
        btnDelete.setText("Delete");
        btnDelete.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        GridPane.setMargin(btnDelete, new Insets(0.0, 0.0, 10.0, 0.0));

        GridPane.setColumnIndex(btnNextPage, 5);
        btnNextPage.setMnemonicParsing(false);
        btnNextPage.setText("Next Page");
        GridPane.setMargin(btnNextPage, new Insets(0.0, 20.0, 10.0, 0.0));
        setBottom(gridPane);

        BorderPane.setAlignment(gridPane0, javafx.geometry.Pos.CENTER);
        gridPane0.setPrefHeight(344.0);
        gridPane0.setPrefWidth(149.0);

        columnConstraints4.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints4.setMinWidth(10.0);
        columnConstraints4.setPrefWidth(100.0);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(30.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(30.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPrefHeight(30.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints5.setMinHeight(10.0);
        rowConstraints5.setPrefHeight(30.0);
        rowConstraints5.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        Label_id.setText("ID");
        GridPane.setMargin(Label_id, new Insets(0.0, 0.0, 0.0, 20.0));

        GridPane.setRowIndex(Label_fname, 1);
        Label_fname.setText("First Name");
        GridPane.setMargin(Label_fname, new Insets(0.0, 0.0, 0.0, 20.0));

        GridPane.setRowIndex(Label_deptid, 3);
        Label_deptid.setText("Department id");
        GridPane.setMargin(Label_deptid, new Insets(0.0, 0.0, 0.0, 20.0));

        GridPane.setRowIndex(Label_email, 4);
        Label_email.setText("Email");
        GridPane.setMargin(Label_email, new Insets(0.0, 0.0, 0.0, 20.0));

        GridPane.setRowIndex(Label_phone, 5);
        Label_phone.setText("Phone");
        GridPane.setMargin(Label_phone, new Insets(0.0, 0.0, 0.0, 20.0));

        GridPane.setRowIndex(Label_lname, 2);
        Label_lname.setText("Last Name");
        GridPane.setMargin(Label_lname, new Insets(0.0, 0.0, 0.0, 20.0));
        setLeft(gridPane0);

        BorderPane.setAlignment(gridPane1, javafx.geometry.Pos.CENTER);
        gridPane1.setPrefHeight(412.0);
        gridPane1.setPrefWidth(535.0);

        columnConstraints5.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints5.setMinWidth(10.0);
        columnConstraints5.setPrefWidth(100.0);

        rowConstraints6.setMinHeight(10.0);
        rowConstraints6.setPrefHeight(30.0);
        rowConstraints6.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints7.setMinHeight(10.0);
        rowConstraints7.setPrefHeight(30.0);
        rowConstraints7.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints8.setMinHeight(10.0);
        rowConstraints8.setPrefHeight(30.0);
        rowConstraints8.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints9.setMinHeight(10.0);
        rowConstraints9.setPrefHeight(30.0);
        rowConstraints9.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints10.setMinHeight(10.0);
        rowConstraints10.setPrefHeight(30.0);
        rowConstraints10.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints11.setMinHeight(10.0);
        rowConstraints11.setPrefHeight(30.0);
        rowConstraints11.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setRowIndex(txtLname, 2);

        GridPane.setRowIndex(txtPhone, 5);

        GridPane.setRowIndex(txtDeptid, 3);

        GridPane.setRowIndex(txtEmail, 4);

        GridPane.setRowIndex(txtFname, 1);
        setCenter(gridPane1);

        BorderPane.setAlignment(label, javafx.geometry.Pos.CENTER);
        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setPrefHeight(51.0);
        label.setPrefWidth(207.0);
        label.setText("Student's Informations");
        label.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label.setFont(new Font("Calibri Bold Italic", 80.0));
        setTop(label);

        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getColumnConstraints().add(columnConstraints2);
        gridPane.getColumnConstraints().add(columnConstraints3);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getChildren().add(btnSelect);
        gridPane.getChildren().add(btnInsert);
        gridPane.getChildren().add(btnUpdate);
        gridPane.getChildren().add(btnDelete);
        gridPane.getChildren().add(btnNextPage);
        gridPane0.getColumnConstraints().add(columnConstraints4);
        gridPane0.getRowConstraints().add(rowConstraints0);
        gridPane0.getRowConstraints().add(rowConstraints1);
        gridPane0.getRowConstraints().add(rowConstraints2);
        gridPane0.getRowConstraints().add(rowConstraints3);
        gridPane0.getRowConstraints().add(rowConstraints4);
        gridPane0.getRowConstraints().add(rowConstraints5);
        gridPane0.getChildren().add(Label_id);
        gridPane0.getChildren().add(Label_fname);
        gridPane0.getChildren().add(Label_deptid);
        gridPane0.getChildren().add(Label_email);
        gridPane0.getChildren().add(Label_phone);
        gridPane0.getChildren().add(Label_lname);
        gridPane1.getColumnConstraints().add(columnConstraints5);
        gridPane1.getRowConstraints().add(rowConstraints6);
        gridPane1.getRowConstraints().add(rowConstraints7);
        gridPane1.getRowConstraints().add(rowConstraints8);
        gridPane1.getRowConstraints().add(rowConstraints9);
        gridPane1.getRowConstraints().add(rowConstraints10);
        gridPane1.getRowConstraints().add(rowConstraints11);
        gridPane1.getChildren().add(txtID);
        GridPane.setMargin(txtID, new Insets(0.0, 450, 0.0, 0.0));
        gridPane1.getChildren().add(txtLname);
        GridPane.setMargin(txtLname, new Insets(0.0, 300, 0.0, 0.0));
        gridPane1.getChildren().add(txtPhone);
        GridPane.setMargin(txtPhone, new Insets(0.0, 300, 0.0, 0.0));
        gridPane1.getChildren().add(txtDeptid);
        GridPane.setMargin(txtDeptid, new Insets(0.0, 450, 0.0, 0.0));
        gridPane1.getChildren().add(txtEmail);
        GridPane.setMargin(txtEmail, new Insets(0.0, 200, 0.0, 0.0));
        gridPane1.getChildren().add(txtFname);
        GridPane.setMargin(txtFname, new Insets(0.0, 300, 0.0, 0.0));
        
        Button btnSelectAll = new Button();
        btnSelectAll.setMnemonicParsing(false);
        btnSelectAll.setText("Select All");
        GridPane.setMargin(btnSelectAll, new Insets(0.0, 0.0, 10.0, 0.0));
        gridPane.add(btnSelectAll, 4, 0); // Add at column index 5 (adjust as needed)
        

        
       
        
         try {
            DataAccessLayer.connect();
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentBase.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
        btnInsert.addEventHandler(ActionEvent.ACTION,new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    
            String studentid = txtID.getText();
            String studentfname = txtFname.getText();
            String studentlname = txtLname.getText();
            String departmentid = txtDeptid.getText();
            String studentemail = txtEmail.getText();
            String studentphone = txtPhone.getText();
           
            if (studentid.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please enter the Student ID.");
                return;
            }
             if (studentfname.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please enter the Student First Name.");
                return;
            }
            if (studentlname.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please enter the Student Last Name.");
                return;
            }
            if (departmentid.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please enter the Department ID.");
                return;
            }
            if (studentemail.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please enter the Email.");
                return;
            }
            if (studentphone.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please enter the Phone.");
                return;
            }
                    Student student = new Student(txtID.getText(),txtFname.getText(),txtLname.getText(),txtDeptid.getText(), txtEmail.getText(), txtPhone.getText());
                   int result= DataAccessLayer.addStudent(student);
                    
                    if (result > 0) {
                showAlert(AlertType.INFORMATION, "Success", "Student inserted successfully.");
            } else {
                showAlert(AlertType.ERROR, "Error", "Failed to insert student.");
            }
                } catch (SQLException ex) {
                    Logger.getLogger(FXMLDocumentBase.class.getName()).log(Level.SEVERE, null, ex);
                    showAlert(AlertType.ERROR, "Error", "An error occurred during student insertion.");
                }
            }
        });
        
        btnUpdate.addEventHandler(ActionEvent.ACTION,new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    
            String studentid = txtID.getText();
            String studentfname = txtFname.getText();
            String studentlname = txtLname.getText();
            String departmentid = txtDeptid.getText();
            String studentemail = txtEmail.getText();
            String studentphone = txtPhone.getText();
           
            if (studentid.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please enter the Student ID.");
                return;
            }
             if (studentfname.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please enter the Student First Name.");
                return;
            }
            if (studentlname.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please enter the Student Last Name.");
                return;
            }
            if (departmentid.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please enter the Department ID.");
                return;
            }
            if (studentemail.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please enter the Email.");
                return;
            }
            if (studentphone.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please enter the Phone.");
                return;
            }
                    Student student = new Student(txtID.getText(),txtFname.getText(),txtLname.getText(),txtDeptid.getText(), txtEmail.getText(), txtPhone.getText());
                   int result= DataAccessLayer.updateStudent(student);
                    
                    if (result > 0) {
                showAlert(AlertType.INFORMATION, "Success", "Student updated successfully.");
            } else {
                showAlert(AlertType.ERROR, "Error", "Failed to update student.");
            }
                } catch (SQLException ex) {
                    Logger.getLogger(FXMLDocumentBase.class.getName()).log(Level.SEVERE, null, ex);
                    showAlert(AlertType.ERROR, "Error", "An error occurred during student update.");
                }
            }
        });
               
        
        
  btnDelete.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        try {
            String studentIdText = txtID.getText();

            if (studentIdText.isEmpty()) {
                showAlert(AlertType.ERROR, "Error", "Please enter the student ID.");
                return;
            }

            int studentId = Integer.parseInt(studentIdText);

            // Show confirmation dialog
            Alert confirmationAlert = new Alert(AlertType.CONFIRMATION);
            confirmationAlert.setTitle("Confirmation");
            confirmationAlert.setHeaderText(null);
            confirmationAlert.setContentText("Are you sure you want to delete the student with ID " + studentId + "?");

            Optional<ButtonType> result = confirmationAlert.showAndWait();

            if (result.isPresent() && result.get() == ButtonType.OK) {
                // User clicked OK, proceed with deletion
                int deleteResult = DataAccessLayer.deleteStudent(studentId);

                if (deleteResult > 0) {
                    showAlert(AlertType.INFORMATION, "Success", "Student deleted successfully.");
                } else {
                    showAlert(AlertType.ERROR, "Error", "Failed to delete student.");
                }
            } else {
                // User clicked Cancel or closed the dialog, do nothing
            }
        } catch (NumberFormatException ex) {
            showAlert(AlertType.ERROR, "Error", "Invalid student ID format.");
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentBase.class.getName()).log(Level.SEVERE, null, ex);
            showAlert(AlertType.ERROR, "Error", "An error occurred during student deletion.");
        }
    }
});


         
  btnSelect.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        try {
            String studentIdText = txtID.getText();

            if (studentIdText.isEmpty()) {
                showAlert(AlertType.ERROR, "Error", "Please enter the student ID.");
                return;
            }

            int studentId = Integer.parseInt(studentIdText);
            ResultSet resultSet = DataAccessLayer.selectStudent(studentId);

            if (resultSet != null && resultSet.next()) {
                // Student found, display details
                String studentDetails = "Student ID: " + resultSet.getInt("STUDENT_ID")
                        + "\nFirst Name: " + resultSet.getString("FNAME")
                        + "\nLast Name: " + resultSet.getString("LNAME")
                        + "\nDepartment ID: " + resultSet.getInt("DEPARTMENT_ID")
                        + "\nEmail: " + resultSet.getString("EMAIL")
                        + "\nPhone: " + resultSet.getString("PHONE");

                showAlert(AlertType.INFORMATION, "Student Details", studentDetails);
            } else {
                showAlert(AlertType.WARNING, "Not Found", "Student with ID " + studentId + " not found.");
            }
        } catch (NumberFormatException ex) {
            showAlert(AlertType.ERROR, "Error", "Invalid student ID format.");
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentBase.class.getName()).log(Level.SEVERE, null, ex);
            showAlert(AlertType.ERROR, "Error", "An error occurred during student selection: " + ex.getMessage());
        }
    }
});

  btnSelectAll.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        try {
            List<Student> students = DataAccessLayer.getAllStudents();
            displayStudents(students);
        } catch (SQLException ex) {
            Logger.getLogger(FXML2Base.class.getName()).log(Level.SEVERE, null, ex);
            showAlert(Alert.AlertType.ERROR, "Error", "An error occurred while retrieving students.");
        }
    }

    private void displayStudents(List<Student> students) {
    Stage studentsStage = new Stage();
    studentsStage.initModality(Modality.APPLICATION_MODAL);
    studentsStage.setTitle("Students");

    TableView<Student> tableView = new TableView<>();
    tableView.getStyleClass().add("table-view");

    TableColumn<Student, Integer> idColumn = new TableColumn<>("STUDENT ID");
    idColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getStudentId()));

    TableColumn<Student, String> fnameColumn = new TableColumn<>("FIRST NAME");
    fnameColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getFirstName()));

    TableColumn<Student, String> lnameColumn = new TableColumn<>("LAST NAME");
    lnameColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getLastName()));

    TableColumn<Student, Integer> departmentidColumn = new TableColumn<>("DEPARTMENT ID");
    departmentidColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getDepartmentId()));

    TableColumn<Student, String> emailColumn = new TableColumn<>("EMAIL");
    emailColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEmail()));

    TableColumn<Student, String> phoneColumn = new TableColumn<>("PHONE");
    phoneColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getPhone()));

    tableView.getColumns().addAll(idColumn, fnameColumn, lnameColumn, departmentidColumn, emailColumn, phoneColumn);
    
    // Create an ObservableList of students
    ObservableList<Student> observableStudents = FXCollections.observableArrayList(students);
    
    // Set the items in the TableView
    tableView.setItems(observableStudents);
    
    

    VBox vBox = new VBox(tableView);
    Scene scene = new Scene(vBox, 750, 400);
    

    studentsStage.setScene(scene);
    studentsStage.show();
}
  });

 
  
  btnNextPage.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Create a new instance of DepartmentsScene
                FXML2Base departmentsScene = new FXML2Base();

                // Get the current stage (assuming it is created in your main class)
                Stage stage = (Stage) getScene().getWindow();

                // Create a new scene with the DepartmentsScene and set it to the stage
                Scene scene = new Scene(departmentsScene, 848, 542);
                stage.setScene(scene);
            }
        });
  
  
  

    }
    private void showAlert(AlertType alertType, String title, String content) {
    Alert alert = new Alert(alertType);
    alert.setTitle(title);
    alert.setHeaderText(null);
    alert.setContentText(content);

    
    DialogPane dialogPane = alert.getDialogPane();
    dialogPane.setStyle("-fx-background-color: #DDE6ED;");

    // Show the alert
    alert.showAndWait();
   

}
    
 
  
}

