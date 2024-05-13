package university;

import db.DataAccessLayer;
import dto.Course;
import dto.Department;
import dto.Student;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class FXML2Base extends BorderPane {

    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final ColumnConstraints columnConstraints2;
    protected final ColumnConstraints columnConstraints3;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final Button btnAdddept;
    protected final Button btnDeletecourse;
    protected final Button btnDeletedept;
    protected final Button btnShowcourses;
    protected final Button btnAddscore;
    protected final Button btnShowDepts;
    protected final Button btnUpdatescore;
    protected final Button btnAddcourse;
    protected final Button btnCalcGPA;
    protected final Button btnUpdatecourse;
    protected final Button btnCourseGPA;
    protected final Button btnback;
    protected final GridPane gridPane0;
    protected final ColumnConstraints columnConstraints4;
    protected final RowConstraints rowConstraints3;
    protected final RowConstraints rowConstraints4;
    protected final RowConstraints rowConstraints5;
    protected final RowConstraints rowConstraints6;
    protected final RowConstraints rowConstraints7;
    protected final RowConstraints rowConstraints8;
    protected final RowConstraints rowConstraints9;
    protected final RowConstraints rowConstraints10;
    protected final Label Label_StudentID;
    protected final Label Label_deptID;
    protected final Label Label_deptName;
    protected final Label Label_courseID;
    protected final Label Label_courseName;
    protected final Label Label_semesters;
    protected final Label Label_scores;
    protected final Label Label_courseDegree;
    protected final GridPane gridPane1;
    protected final ColumnConstraints columnConstraints5;
    protected final RowConstraints rowConstraints11;
    protected final RowConstraints rowConstraints12;
    protected final RowConstraints rowConstraints13;
    protected final RowConstraints rowConstraints14;
    protected final RowConstraints rowConstraints15;
    protected final RowConstraints rowConstraints16;
    protected final RowConstraints rowConstraints17;
    protected final RowConstraints rowConstraints18;
    protected final TextField txtStudentID;
    protected final TextField txtDeptID;
    protected final TextField txtDeptName;
    protected final TextField txtCourseID;
    protected final TextField txtCourseName;
    protected final TextField txtSemesters;
    protected final TextField txtScores;
    protected final TextField txtCourseDegree;

    public FXML2Base() {

        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        columnConstraints2 = new ColumnConstraints();
        columnConstraints3 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        btnAdddept = new Button();
        btnDeletecourse = new Button();
        btnDeletedept = new Button();
        btnShowcourses = new Button();
        btnAddscore = new Button();
        btnShowDepts = new Button();
        btnUpdatescore = new Button();
        btnAddcourse = new Button();
        btnCalcGPA = new Button();
        btnUpdatecourse = new Button();
        btnCourseGPA = new Button();
        btnback = new Button();
        gridPane0 = new GridPane();
        columnConstraints4 = new ColumnConstraints();
        rowConstraints3 = new RowConstraints();
        rowConstraints4 = new RowConstraints();
        rowConstraints5 = new RowConstraints();
        rowConstraints6 = new RowConstraints();
        rowConstraints7 = new RowConstraints();
        rowConstraints8 = new RowConstraints();
        rowConstraints9 = new RowConstraints();
        rowConstraints10 = new RowConstraints();
        Label_StudentID = new Label();
        Label_deptID = new Label();
        Label_deptName = new Label();
        Label_courseID = new Label();
        Label_courseName = new Label();
        Label_semesters = new Label();
        Label_scores = new Label();
        Label_courseDegree = new Label();
        gridPane1 = new GridPane();
        columnConstraints5 = new ColumnConstraints();
        rowConstraints11 = new RowConstraints();
        rowConstraints12 = new RowConstraints();
        rowConstraints13 = new RowConstraints();
        rowConstraints14 = new RowConstraints();
        rowConstraints15 = new RowConstraints();
        rowConstraints16 = new RowConstraints();
        rowConstraints17 = new RowConstraints();
        rowConstraints18 = new RowConstraints();
        txtStudentID = new TextField();
        txtDeptID = new TextField();
        txtDeptName = new TextField();
        txtCourseID = new TextField();
        txtCourseName = new TextField();
        txtSemesters = new TextField();
        txtScores = new TextField();
        txtCourseDegree = new TextField();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(542.0);
        setPrefWidth(848.0);
        getStylesheets().add("/university/styles.css");

        BorderPane.setAlignment(gridPane, javafx.geometry.Pos.CENTER);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(166.0);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(166.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(174.0);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(174.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMaxWidth(171.0);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(165.0);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMaxWidth(147.0);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(140.0);

        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMaxWidth(215.0);
        columnConstraints3.setMinWidth(10.0);
        columnConstraints3.setPrefWidth(167.0);

        rowConstraints.setMaxHeight(42.0);
        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(38.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMaxHeight(31.0);
        rowConstraints0.setMinHeight(0.0);
        rowConstraints0.setPrefHeight(0.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMaxHeight(52.0);
        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(52.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMaxHeight(52.0);
        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(52.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        btnAdddept.setMnemonicParsing(false);
        btnAdddept.setText("Add Department");
        GridPane.setMargin(btnAdddept, new Insets(0.0, 0.0, 0.0, 20.0));

        GridPane.setRowIndex(btnDeletecourse, 2);
        btnDeletecourse.setMnemonicParsing(false);
        btnDeletecourse.setText("Delete Course");
        GridPane.setMargin(btnDeletecourse, new Insets(0.0, 0.0, 0.0, 20.0));

        GridPane.setColumnIndex(btnDeletedept, 1);
        btnDeletedept.setMnemonicParsing(false);
        btnDeletedept.setText("Delete Department");
        GridPane.setMargin(btnDeletedept, new Insets(0.0, 0.0, 0.0, 20.0));

        GridPane.setColumnIndex(btnShowcourses, 1);
        GridPane.setRowIndex(btnShowcourses, 2);
        btnShowcourses.setMnemonicParsing(false);
        btnShowcourses.setText("Show Courses");
        GridPane.setMargin(btnShowcourses, new Insets(0.0, 0.0, 0.0, 20.0));

        GridPane.setColumnIndex(btnAddscore, 2);
        GridPane.setRowIndex(btnAddscore, 2);
        btnAddscore.setMnemonicParsing(false);
        btnAddscore.setText("Add Score");
        GridPane.setMargin(btnAddscore, new Insets(0.0, 0.0, 0.0, 40.0));

        GridPane.setColumnIndex(btnShowDepts, 2);
        btnShowDepts.setMnemonicParsing(false);
        btnShowDepts.setText("Show Departments");
        GridPane.setMargin(btnShowDepts, new Insets(0.0, 0.0, 0.0, 20.0));

        GridPane.setColumnIndex(btnUpdatescore, 3);
        GridPane.setRowIndex(btnUpdatescore, 2);
        btnUpdatescore.setMnemonicParsing(false);
        btnUpdatescore.setText("Update Score");
        GridPane.setMargin(btnUpdatescore, new Insets(0.0, 0.0, 0.0, 10.0));

        GridPane.setColumnIndex(btnAddcourse, 3);
        btnAddcourse.setMnemonicParsing(false);
        btnAddcourse.setText("Add Course");
        GridPane.setMargin(btnAddcourse, new Insets(0.0, 0.0, 0.0, 30.0));

        GridPane.setColumnIndex(btnCalcGPA, 4);
        GridPane.setRowIndex(btnCalcGPA, 2);
        btnCalcGPA.setMnemonicParsing(false);
        btnCalcGPA.setText("StudentGPA");
        GridPane.setMargin(btnCalcGPA, new Insets(0.0, 0.0, 0.0, 30.0));

        GridPane.setColumnIndex(btnUpdatecourse, 4);
        btnUpdatecourse.setMnemonicParsing(false);
        btnUpdatecourse.setText("Update Course");
        GridPane.setMargin(btnUpdatecourse, new Insets(0.0, 0.0, 0.0, 30.0));

        GridPane.setColumnIndex(btnCourseGPA, 2);
        GridPane.setRowIndex(btnCourseGPA, 3);
        btnCourseGPA.setMnemonicParsing(false);
        btnCourseGPA.setText("CourseGPA");
        GridPane.setMargin(btnCourseGPA, new Insets(0.0, 0.0, 0.0, 50.0));

        GridPane.setColumnIndex(btnback, 4);
        GridPane.setRowIndex(btnback, 3);
        btnback.setMnemonicParsing(false);
        btnback.setPrefHeight(31.0);
        btnback.setPrefWidth(97.0);
        btnback.setText("Back");
        GridPane.setMargin(btnback, new Insets(0.0, 0.0, 0.0, 60.0));
        setBottom(gridPane);

        BorderPane.setAlignment(gridPane0, javafx.geometry.Pos.CENTER);
        gridPane0.setPrefHeight(439.0);
        gridPane0.setPrefWidth(175.0);

        columnConstraints4.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints4.setMinWidth(10.0);
        columnConstraints4.setPrefWidth(100.0);

        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(30.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPrefHeight(30.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints5.setMinHeight(10.0);
        rowConstraints5.setPrefHeight(30.0);
        rowConstraints5.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

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

        Label_StudentID.setText("Student ID");
        GridPane.setMargin(Label_StudentID, new Insets(0.0, 0.0, 0.0, 20.0));

        GridPane.setRowIndex(Label_deptID, 1);
        Label_deptID.setText("Department ID");
        GridPane.setMargin(Label_deptID, new Insets(0.0, 0.0, 0.0, 20.0));

        GridPane.setRowIndex(Label_deptName, 2);
        Label_deptName.setText("Department Name");
        GridPane.setMargin(Label_deptName, new Insets(0.0, 0.0, 0.0, 20.0));

        GridPane.setRowIndex(Label_courseID, 3);
        Label_courseID.setText("Course ID");
        GridPane.setMargin(Label_courseID, new Insets(0.0, 0.0, 0.0, 20.0));

        GridPane.setRowIndex(Label_courseName, 4);
        Label_courseName.setText("Course Name");
        GridPane.setMargin(Label_courseName, new Insets(0.0, 0.0, 0.0, 20.0));

        GridPane.setRowIndex(Label_semesters, 6);
        Label_semesters.setText("Semesters");
        GridPane.setMargin(Label_semesters, new Insets(0.0, 0.0, 0.0, 20.0));

        GridPane.setRowIndex(Label_scores, 7);
        Label_scores.setText("Scores");
        GridPane.setMargin(Label_scores, new Insets(0.0, 0.0, 0.0, 20.0));

        GridPane.setRowIndex(Label_courseDegree, 5);
        Label_courseDegree.setText("Course Degree");
        GridPane.setMargin(Label_courseDegree, new Insets(0.0, 0.0, 0.0, 20.0));
        setLeft(gridPane0);

        BorderPane.setAlignment(gridPane1, javafx.geometry.Pos.CENTER);
        gridPane1.setPrefHeight(444.0);
        gridPane1.setPrefWidth(614.0);

        columnConstraints5.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints5.setMinWidth(10.0);
        columnConstraints5.setPrefWidth(100.0);

        rowConstraints11.setMinHeight(10.0);
        rowConstraints11.setPrefHeight(30.0);
        rowConstraints11.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints12.setMinHeight(10.0);
        rowConstraints12.setPrefHeight(30.0);
        rowConstraints12.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints13.setMinHeight(10.0);
        rowConstraints13.setPrefHeight(30.0);
        rowConstraints13.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints14.setMinHeight(10.0);
        rowConstraints14.setPrefHeight(30.0);
        rowConstraints14.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints15.setMinHeight(10.0);
        rowConstraints15.setPrefHeight(30.0);
        rowConstraints15.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints16.setMinHeight(10.0);
        rowConstraints16.setPrefHeight(30.0);
        rowConstraints16.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints17.setMinHeight(10.0);
        rowConstraints17.setPrefHeight(30.0);
        rowConstraints17.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints18.setMinHeight(10.0);
        rowConstraints18.setPrefHeight(30.0);
        rowConstraints18.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setMargin(txtStudentID, new Insets(0.0, 450.0, 0.0, 0.0));

        GridPane.setRowIndex(txtDeptID, 1);
        GridPane.setMargin(txtDeptID, new Insets(0.0, 450.0, 0.0, 0.0));

        GridPane.setRowIndex(txtDeptName, 2);
        GridPane.setMargin(txtDeptName, new Insets(0.0, 400.0, 0.0, 0.0));

        GridPane.setRowIndex(txtCourseID, 3);
        GridPane.setMargin(txtCourseID, new Insets(0.0, 450.0, 0.0, 0.0));

        GridPane.setRowIndex(txtCourseName, 4);
        GridPane.setMargin(txtCourseName, new Insets(0.0, 400.0, 0.0, 0.0));

        GridPane.setRowIndex(txtSemesters, 6);
        GridPane.setMargin(txtSemesters, new Insets(0.0, 400.0, 0.0, 0.0));

        GridPane.setRowIndex(txtScores, 7);
        GridPane.setMargin(txtScores, new Insets(0.0, 550.0, 0.0, 0.0));

        GridPane.setRowIndex(txtCourseDegree, 5);
        GridPane.setMargin(txtCourseDegree, new Insets(0.0, 550.0, 0.0, 0.0));
        setCenter(gridPane1);

        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getColumnConstraints().add(columnConstraints2);
        gridPane.getColumnConstraints().add(columnConstraints3);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getRowConstraints().add(rowConstraints2);
        gridPane.getChildren().add(btnAdddept);
        gridPane.getChildren().add(btnDeletecourse);
        gridPane.getChildren().add(btnDeletedept);
        gridPane.getChildren().add(btnShowcourses);
        gridPane.getChildren().add(btnAddscore);
        gridPane.getChildren().add(btnShowDepts);
        gridPane.getChildren().add(btnUpdatescore);
        gridPane.getChildren().add(btnAddcourse);
        gridPane.getChildren().add(btnCalcGPA);
        gridPane.getChildren().add(btnUpdatecourse);
        gridPane.getChildren().add(btnCourseGPA);
        gridPane.getChildren().add(btnback);
        gridPane0.getColumnConstraints().add(columnConstraints4);
        gridPane0.getRowConstraints().add(rowConstraints3);
        gridPane0.getRowConstraints().add(rowConstraints4);
        gridPane0.getRowConstraints().add(rowConstraints5);
        gridPane0.getRowConstraints().add(rowConstraints6);
        gridPane0.getRowConstraints().add(rowConstraints7);
        gridPane0.getRowConstraints().add(rowConstraints8);
        gridPane0.getRowConstraints().add(rowConstraints9);
        gridPane0.getRowConstraints().add(rowConstraints10);
        gridPane0.getChildren().add(Label_StudentID);
        gridPane0.getChildren().add(Label_deptID);
        gridPane0.getChildren().add(Label_deptName);
        gridPane0.getChildren().add(Label_courseID);
        gridPane0.getChildren().add(Label_courseName);
        gridPane0.getChildren().add(Label_semesters);
        gridPane0.getChildren().add(Label_scores);
        gridPane0.getChildren().add(Label_courseDegree);
        gridPane1.getColumnConstraints().add(columnConstraints5);
        gridPane1.getRowConstraints().add(rowConstraints11);
        gridPane1.getRowConstraints().add(rowConstraints12);
        gridPane1.getRowConstraints().add(rowConstraints13);
        gridPane1.getRowConstraints().add(rowConstraints14);
        gridPane1.getRowConstraints().add(rowConstraints15);
        gridPane1.getRowConstraints().add(rowConstraints16);
        gridPane1.getRowConstraints().add(rowConstraints17);
        gridPane1.getRowConstraints().add(rowConstraints18);
        gridPane1.getChildren().add(txtStudentID);
        gridPane1.getChildren().add(txtDeptID);
        gridPane1.getChildren().add(txtDeptName);
        gridPane1.getChildren().add(txtCourseID);
        gridPane1.getChildren().add(txtCourseName);
        gridPane1.getChildren().add(txtSemesters);
        gridPane1.getChildren().add(txtScores);
        gridPane1.getChildren().add(txtCourseDegree);
        
        
        Button btnReport = new Button();
        btnReport.setMnemonicParsing(false);
        btnReport.setText("Report");
        GridPane.setMargin(btnReport, new Insets(0.0, 0.0, 0.0, 0.0));
        gridPane.add(btnReport, 1, 3); // Add at column index 2 and row index 3

        
        try {
            DataAccessLayer.connect();
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        btnback.setOnAction(new EventHandler<ActionEvent>() {
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
        
    btnAdddept.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        

        try {
            String departmentIdText = txtDeptID.getText();
            String departmentName = txtDeptName.getText();

            if (departmentIdText.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please enter the department ID.");
                return;
            }

            // Check if the department ID is a valid integer
            int departmentId;
            try {
                departmentId = Integer.parseInt(departmentIdText);
            } catch (NumberFormatException e) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please enter a valid integer for the department ID.");
                return;
            }

            if (departmentName.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please enter the department name.");
                return;
            }

            Department department = new Department(Integer.toString(departmentId), departmentName);
            int result = DataAccessLayer.addDepartment(department);

            if (result > 0) {
                showAlert(Alert.AlertType.INFORMATION, "Success", "Department added successfully.");
            } else {
                showAlert(Alert.AlertType.ERROR, "Error", "Failed to add department.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentBase.class.getName()).log(Level.SEVERE, null, ex);
            showAlert(Alert.AlertType.ERROR, "Error", "An error occurred during department addition.");
        }
    }
});

        
    btnDeletedept.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        try {
            String departmenttext = txtDeptID.getText();

            if (departmenttext.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please enter the department ID.");
                return;
            }

            int departmentid = Integer.parseInt(departmenttext);

            // Show confirmation dialog
            Alert confirmationAlert = new Alert(Alert.AlertType.CONFIRMATION);
            confirmationAlert.setTitle("Confirmation");
            confirmationAlert.setHeaderText(null);
            confirmationAlert.setContentText("Are you sure you want to delete the department with ID " + departmentid + " ?");

            Optional<ButtonType> result = confirmationAlert.showAndWait();

            if (result.isPresent() && result.get() == ButtonType.OK) {
                // User clicked OK, proceed with deletion
                int deleteResult = DataAccessLayer.deleteDepartment(departmentid);

                if (deleteResult > 0) {
                    showAlert(Alert.AlertType.INFORMATION, "Success", "Department deleted successfully.");
                } else {
                    showAlert(Alert.AlertType.ERROR, "Error", "Failed to delete department.");
                }
            } else {
                // User clicked Cancel or closed the dialog, do nothing
            }
        } catch (NumberFormatException ex) {
            showAlert(Alert.AlertType.ERROR, "Error", "Invalid department ID format.");
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentBase.class.getName()).log(Level.SEVERE, null, ex);
            showAlert(Alert.AlertType.ERROR, "Error", "An error occurred during department deletion.");
        }
    }
});
      
    
   btnShowDepts.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        try {
            List<Department> departments = DataAccessLayer.getAllDepartments();
            displayDepartments(departments);
        } catch (SQLException ex) {
            Logger.getLogger(FXML2Base.class.getName()).log(Level.SEVERE, null, ex);
            showAlert(Alert.AlertType.ERROR, "Error", "An error occurred while retrieving departments.");
        }
    }
});

    
    btnShowcourses.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        try {
            List<Course> courses = DataAccessLayer.getAllCourses();
            displayCourses(courses);
        } catch (SQLException ex) {
            Logger.getLogger(FXML2Base.class.getName()).log(Level.SEVERE, null, ex);
            showAlert(Alert.AlertType.ERROR, "Error", "An error occurred while retrieving courses.");
        }
    }

    private void displayCourses(List<Course> courses) {
        Stage coursesStage = new Stage();
        coursesStage.initModality(Modality.APPLICATION_MODAL);
        coursesStage.setTitle("Courses");

        TableView<Course> tableView = new TableView<>();
        
        // Assuming CourseId and DepartmentId are integers in your Course class
        TableColumn<Course, Integer> idColumn = new TableColumn<>("ID");
        idColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getCourseId()));

        TableColumn<Course, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCourseName()));

        // Assuming DepartmentId is an integer
        TableColumn<Course, Integer> deptIdColumn = new TableColumn<>("Department ID");
        deptIdColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getDepartmentId()));

        TableColumn<Course, String> degreeColumn = new TableColumn<>("Degree");
        degreeColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCourseDegree()));

        TableColumn<Course, String> semestersColumn = new TableColumn<>("Semesters");
        semestersColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getSemesters()));

        tableView.getColumns().addAll(idColumn, nameColumn, deptIdColumn, degreeColumn, semestersColumn);
        tableView.getItems().addAll(courses);

        VBox vBox = new VBox(tableView);
        Scene scene = new Scene(vBox, 600, 400);
        coursesStage.setScene(scene);
        coursesStage.show();
    }
});
    
     btnAddcourse.addEventHandler(ActionEvent.ACTION,new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
            String coursename = txtCourseName.getText();
            String courseIdText = txtCourseID.getText();
            String departmentid = txtDeptID.getText();
            String coursedegree = txtCourseDegree.getText();
            String semestertext = txtSemesters.getText();
           
            if (courseIdText.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please enter the Course ID.");
                return;
            }
             if (coursename.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please enter the Course Name.");
                return;
            }
            if (departmentid.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please enter the Department ID.");
                return;
            }
            if (coursedegree.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please enter the Course Degree.");
                return;
            }
            if (!coursedegree.equals("150")) {
                showAlert(Alert.AlertType.ERROR, "Error", "Course Degree must be 150.");
                return;
            }
            if (semestertext.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please enter the semester.");
                return;
            }
             if (!semestertext.equalsIgnoreCase("First Semester") && !semestertext.equalsIgnoreCase("Second Semester")) {
                showAlert(Alert.AlertType.ERROR, "Error", "Invalid semester. Please enter 'First Semester' or 'Second Semester'.");
                return;
            }
                    Course course = new Course(txtCourseID.getText(),txtCourseName.getText(),txtDeptID.getText(),txtCourseDegree.getText(), txtSemesters.getText());
                   int result= DataAccessLayer.addCourse(course);
                    
                    if (result > 0) {
                showAlert(Alert.AlertType.INFORMATION, "Success", "Course added successfully.");
            } else {
                showAlert(Alert.AlertType.ERROR, "Error", "Failed to add course.");
            }
                } catch (SQLException ex) {
                    Logger.getLogger(FXMLDocumentBase.class.getName()).log(Level.SEVERE, null, ex);
                    showAlert(Alert.AlertType.ERROR, "Error", "An error occurred during course addition.");
                }
            }
        });
     
      btnUpdatecourse.addEventHandler(ActionEvent.ACTION,new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    
                     String coursename = txtCourseName.getText();
            String courseIdText = txtCourseID.getText();
            String departmentid = txtDeptID.getText();
            String coursedegree = txtCourseDegree.getText();
            String semestertext = txtSemesters.getText();
           
            if (courseIdText.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please enter the Course ID.");
                return;
            }
             if (coursename.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please enter the Course Name.");
                return;
            }
            if (departmentid.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please enter the Department ID.");
                return;
            }
            if (coursedegree.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please enter the Course Degree.");
                return;
            }
            if (semestertext.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please enter the semester.");
                return;
            }
                     Course course = new Course(txtCourseID.getText(),txtCourseName.getText(),txtDeptID.getText(),txtCourseDegree.getText(), txtSemesters.getText());
                   int result= DataAccessLayer.updateCourse(course);
                    
                    if (result > 0) {
                showAlert(Alert.AlertType.INFORMATION, "Success", "Course updated successfully.");
            } else {
                showAlert(Alert.AlertType.ERROR, "Error", "Failed to update course.");
            }
                } catch (SQLException ex) {
                    Logger.getLogger(FXMLDocumentBase.class.getName()).log(Level.SEVERE, null, ex);
                    showAlert(Alert.AlertType.ERROR, "Error", "An error occurred during course update.");
                }
            }
        });

      
       btnDeletecourse.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        try {
            String courseText = txtCourseID.getText();

            if (courseText.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please enter the course ID.");
                return;
            }

            int courseId = Integer.parseInt(courseText);

            // Show confirmation dialog
            Alert confirmationAlert = new Alert(Alert.AlertType.CONFIRMATION);
            confirmationAlert.setTitle("Confirmation");
            confirmationAlert.setHeaderText(null);
            confirmationAlert.setContentText("Are you sure you want to delete the course with ID " + courseId + " ?");

            Optional<ButtonType> result = confirmationAlert.showAndWait();

            if (result.isPresent() && result.get() == ButtonType.OK) {
                // User clicked OK, proceed with deletion
                int deleteResult = DataAccessLayer.deleteCourse(courseId);

                if (deleteResult > 0) {
                    showAlert(Alert.AlertType.INFORMATION, "Success", "Course deleted successfully.");
                } else {
                    showAlert(Alert.AlertType.ERROR, "Error", "Failed to delete Course.");
                }
            } else {
                // User clicked Cancel or closed the dialog, do nothing
            }
        } catch (NumberFormatException ex) {
            showAlert(Alert.AlertType.ERROR, "Error", "Invalid Course ID format.");
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentBase.class.getName()).log(Level.SEVERE, null, ex);
            showAlert(Alert.AlertType.ERROR, "Error", "An error occurred during Course deletion.");
        }
    }
});
  
       
    btnCalcGPA.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        try {
            String studentIdText = txtStudentID.getText();

            if (studentIdText.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please enter the student ID.");
                return;
            }

            // Check if the student ID is a valid integer
            int studentId;
            try {
                studentId = Integer.parseInt(studentIdText);
            } catch (NumberFormatException e) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please enter a valid integer for the student ID.");
                return;
            }

            // Check if the student exists in the database
            if (!DataAccessLayer.isStudentExists(studentId)) {
                showAlert(Alert.AlertType.ERROR, "Error", "Student ID not found.");
                return;
            }

            double gpa = DataAccessLayer.calculateGPA(studentId);

            if (gpa >= 0) {
                showAlert(Alert.AlertType.INFORMATION, "Success", "GPA calculated successfully. GPA: " + gpa);
            } else {
                showAlert(Alert.AlertType.ERROR, "Error", "Failed to calculate GPA for the student.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(FXML2Base.class.getName()).log(Level.SEVERE, null, ex);
            showAlert(Alert.AlertType.ERROR, "Error", "An error occurred during GPA calculation.");
        }
    }
});

    
    btnCourseGPA.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        try {
            String courseIdText = txtCourseID.getText();

            if (courseIdText.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please enter the course ID.");
                return;
            }

            // Check if the course ID is a valid integer
            int courseId;
            try {
                courseId = Integer.parseInt(courseIdText);
            } catch (NumberFormatException e) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please enter a valid integer for the course ID.");
                return;
            }

           boolean isCourseExists = DataAccessLayer.isCourseExists(courseId);

            if (isCourseExists) {
                double courseGPA = DataAccessLayer.calculateCourseGPA(courseId);
                showAlert(Alert.AlertType.INFORMATION, "Success", "Course GPA calculated successfully. GPA: " + courseGPA);
            } else {
                showAlert(Alert.AlertType.ERROR, "Error", "Course ID not found.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(FXML2Base.class.getName()).log(Level.SEVERE, null, ex);
            showAlert(Alert.AlertType.ERROR, "Error", "An error occurred during GPA calculation.");
        }
    }
});

    
    btnAddscore.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        try {
            
            String studentIdText = txtStudentID.getText();
            String courseIdText = txtCourseID.getText();
            String scoresText = txtScores.getText();

            // Check if any field is empty
            if (studentIdText.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please Enter Student ID.");
                return;
            }
             if (courseIdText.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please Enter Course ID.");
                return;
            }
              if (scoresText.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please Enter The Score.");
                return;
            }
            // Get user input from text fields or other UI components
            int studentId = Integer.parseInt(txtStudentID.getText());
            int courseId = Integer.parseInt(txtCourseID.getText());
            double score = Double.parseDouble(txtScores.getText());

            // Call the addScore method
            int result = DataAccessLayer.addScore(studentId, courseId, score);

            // Check the result and show an appropriate alert
            if (result > 0) {
                showAlert(Alert.AlertType.INFORMATION, "Success", "Score added successfully.");
            } else {
                showAlert(Alert.AlertType.ERROR, "Error", "Failed to add score.");
            }
        } catch (NumberFormatException | SQLException ex) {
            Logger.getLogger(FXML2Base.class.getName()).log(Level.SEVERE, null, ex);
            showAlert(Alert.AlertType.ERROR, "Error", "An error occurred while adding the score.");
        } 
       
    }
});


    
    btnUpdatescore.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        try {
            
            String studentIdText = txtStudentID.getText();
            String courseIdText = txtCourseID.getText();
            String scoresText = txtScores.getText();

            // Check if any field is empty
            if (studentIdText.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please Enter Student ID.");
                return;
            }
             if (courseIdText.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please Enter Course ID.");
                return;
            }
              if (scoresText.isEmpty()) {
                showAlert(Alert.AlertType.ERROR, "Error", "Please Enter The Score.");
                return;
            }
            // Get user input from text fields or other UI components
            int studentId = Integer.parseInt(txtStudentID.getText());
            int courseId = Integer.parseInt(txtCourseID.getText());
            double newScore = Double.parseDouble(txtScores.getText());

            // Call the updateScore method
            int result = DataAccessLayer.updateScore(studentId, courseId, newScore);

            // Check the result and show an appropriate alert
            if (result > 0) {
                showAlert(Alert.AlertType.INFORMATION, "Success", "Score updated successfully.");
            } else {
                showAlert(Alert.AlertType.ERROR, "Error", "Failed to update score. Student ID or Course ID not found.");
            }
        } catch (NumberFormatException | SQLException ex) {
            Logger.getLogger(FXML2Base.class.getName()).log(Level.SEVERE, null, ex);
            showAlert(Alert.AlertType.ERROR, "Error", "An error occurred while updating the score.");
        }
    }
});

btnReport.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
    @Override
    public void handle(ActionEvent event) {
        try {
            List<Map<String, Object>> courseReports = DataAccessLayer.getCourseReport();
            displayCourseReport(courseReports);
        } catch (SQLException ex) {
            Logger.getLogger(FXML2Base.class.getName()).log(Level.SEVERE, null, ex);
            showAlert(Alert.AlertType.ERROR, "Error", "An error occurred while fetching course report.");
        }
    }
});



    }
    
   private void displayDepartments(List<Department> departments) {
    Stage departmentsStage = new Stage();
    departmentsStage.initModality(Modality.APPLICATION_MODAL);
    departmentsStage.setTitle("Departments");

    TableView<Department> tableView = new TableView<>();

    TableColumn<Department, Integer> idColumn = new TableColumn<>("ID");
    idColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>(cellData.getValue().getDepartmentId()));

    TableColumn<Department, String> nameColumn = new TableColumn<>("Name");
    nameColumn.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDepartmentName()));

    tableView.getColumns().addAll(idColumn, nameColumn);
    tableView.getItems().addAll(departments);

    VBox vBox = new VBox(tableView);
    Scene scene = new Scene(vBox, 400, 300);
   
    departmentsStage.setScene(scene);
    departmentsStage.show();
}

    
   

 private void showAlert(Alert.AlertType alertType, String title, String content) {
    Alert alert = new Alert(alertType);
    alert.setTitle(title);
    alert.setHeaderText(null);
    alert.setContentText(content);
    DialogPane dialogPane = alert.getDialogPane();
    dialogPane.setStyle("-fx-background-color: #DDE6ED;");

    // Show the alert
    alert.showAndWait();
    
}

 private void displayCourseReport(List<Map<String, Object>> courseReports) {
    Stage courseReportStage = new Stage();
    courseReportStage.initModality(Modality.APPLICATION_MODAL);
    courseReportStage.setTitle("Course Report");

    TableView<Map<String, Object>> tableView = new TableView<>();

    TableColumn<Map<String, Object>, Integer> courseIdColumn = new TableColumn<>("Course ID");
    courseIdColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>((Integer) cellData.getValue().get("Course_ID")));

    TableColumn<Map<String, Object>, String> courseNameColumn = new TableColumn<>("Course Name");
    courseNameColumn.setCellValueFactory(cellData -> new SimpleStringProperty((String) cellData.getValue().get("Course_Name")));

    TableColumn<Map<String, Object>, Double> gpaColumn = new TableColumn<>("GPA");
    gpaColumn.setCellValueFactory(cellData -> new SimpleObjectProperty<>((Double) cellData.getValue().get("Course_GPA")));

    TableColumn<Map<String, Object>, String> studentsIdColumn = new TableColumn<>("Students ID");
    studentsIdColumn.setCellValueFactory(cellData -> new SimpleStringProperty((String) cellData.getValue().get("Students_ID")));

    tableView.getColumns().addAll(courseIdColumn, courseNameColumn, gpaColumn, studentsIdColumn);
    tableView.getItems().addAll(courseReports);
    tableView.refresh();

    VBox vBox = new VBox(tableView);
    Scene scene = new Scene(vBox, 600, 400);
    
    courseReportStage.setScene(scene);
    courseReportStage.show();
}




    
}