package Controller_Files;

import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class CommonBackgroundController {
	
	String path = "D:\\Files\\Semester 3\\03.CSC2123 Object Oriented Programming\\Java Project 1\\RPPC\\MouseClickSound.mp3";
	
	javafx.scene.media.Media media = new javafx.scene.media.Media(new File(path).toURI().toString());

	MediaPlayer mediaplayer  = new MediaPlayer(media);

    @FXML
    private Button AdminAddEmpbtn; 

    @FXML
    private Button AdminEmpStatus;

    @FXML
    private Button AdminHomebtn;

    @FXML
    private Button AdminLogoutbtn;

    @FXML
    private Button AdminPermissionsbtn;

    @FXML
    private Button AdminRemoveEmpbtn;

    @FXML
    private Button AdminSalaryStatusbtn;

    @FXML
    private AnchorPane OverviewPane;

    @FXML
    private Pane Pane1;

    @FXML
    private Pane Pane2;

    @FXML
    private Pane Pane3;

    @FXML
    private Button SelectedOverviewbtn;

    @FXML
    private BorderPane border1;

    @FXML
    private BorderPane border2;

    @FXML
    private BorderPane border3;

    @FXML
    private Pane border4;
    
    @FXML
    void AdminHome(ActionEvent event) throws IOException {
    	
    	mediaplayer.play();
    	AdminHomebtn.getScene().getWindow().hide();
    	Stage navtohome = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/AdminHomeDetails.fxml"));
			Scene scene = new Scene(root);
			navtohome.setResizable(false);
			navtohome.setScene(scene);
			navtohome.show();

    }

    @FXML
    void AdminOverview(ActionEvent event) throws IOException {
    	
    	mediaplayer.play();
    	SelectedOverviewbtn.getScene().getWindow().hide();
    	Stage navtooverview = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/CommonBackground.fxml"));
			Scene scene = new Scene(root);
			navtooverview.setResizable(false);
			navtooverview.setScene(scene);
			navtooverview.show();

    }
    
    @FXML
    void AdminEmpStatus(ActionEvent event) throws IOException {
    	
    	mediaplayer.play();
    	AdminEmpStatus.getScene().getWindow().hide();
    	Stage navtoempstatus = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/EmployeeStatus.fxml"));
			Scene scene = new Scene(root);
			navtoempstatus.setResizable(false);
			navtoempstatus.setScene(scene);
			navtoempstatus.show();

    }
    
    @FXML
    void AdminAddEmp(ActionEvent event) throws IOException {
    	
    	mediaplayer.play();
    	AdminAddEmpbtn.getScene().getWindow().hide();
    	Stage navtoaddemp = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/AddEmployee.fxml"));
			Scene scene = new Scene(root);
			navtoaddemp.setResizable(false);
			navtoaddemp.setScene(scene);
			navtoaddemp.show();

    }

    @FXML
    void AdminRemoveEmp(ActionEvent event) throws IOException {
    	
    	mediaplayer.play();
    	AdminRemoveEmpbtn.getScene().getWindow().hide();
    	Stage navtoremoveemp = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/RemoveEmployee.fxml"));
			Scene scene = new Scene(root);
			navtoremoveemp.setResizable(false);
			navtoremoveemp.setScene(scene);
			navtoremoveemp.show();


    }
    
    @FXML
    void AdminSalaryStatus(ActionEvent event) throws IOException {
    	
    	mediaplayer.play();
    	AdminSalaryStatusbtn.getScene().getWindow().hide();
    	Stage navtoremoveemp = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/AdminSalaryStatus.fxml"));
			Scene scene = new Scene(root);
			navtoremoveemp.setResizable(false);
			navtoremoveemp.setScene(scene);
			navtoremoveemp.show();

    }
    
    
    @FXML
    void AdminPermissionsAction(ActionEvent event) throws IOException {
    	
    	mediaplayer.play();
    	AdminPermissionsbtn.getScene().getWindow().hide();
    	Stage navtoremoveemp = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/AdminPermissions.fxml"));
			Scene scene = new Scene(root);
			navtoremoveemp.setResizable(false);
			navtoremoveemp.setScene(scene);
			navtoremoveemp.show();

    }

    
    @FXML
    void LogoutAction(ActionEvent event) throws IOException {
    	
    	mediaplayer.play();
    	AdminLogoutbtn.getScene().getWindow().hide();
    	Stage navtoremoveemp = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/Login.fxml"));
			Scene scene = new Scene(root);
			navtoremoveemp.setResizable(false);
			navtoremoveemp.setScene(scene);
			navtoremoveemp.show();    	

    }
}
