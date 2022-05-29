package Controller_Files;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import AlertMessageBox.Message;
import DataBaseConnection.dbconnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class AddEmployeeController implements Initializable {
	
	String path = "D:\\Files\\Semester 3\\03.CSC2123 Object Oriented Programming\\Java Project 1\\RPPC\\MouseClickSound.mp3";
	
	javafx.scene.media.Media media = new javafx.scene.media.Media(new File(path).toURI().toString());

	MediaPlayer mediaplayer  = new MediaPlayer(media);
		

	
	
    @FXML
    private Button AdminEmpStatus;

    @FXML
    private Button AdminHomebtn;

    @FXML
    private Button AdminLogoutbtn;

    @FXML
    private Button AdminOverviewbtn;

    @FXML
    private Button AdminPermissionsbtn;

    @FXML
    private Button AdminRemoveEmpbtn;

    @FXML
    private Button AdminSalaryStatusbtn;
    
    @FXML
    private TextField EmpNotxt;

    @FXML
    private Pane Pane1;

    @FXML
    private Pane Pane2;

    @FXML
    private Pane Pane3;

    @FXML
    private Button SelectedAdminAddEmpbtn;
    
    @FXML
    private Button AdminSelectedPermissionsbtn;

    @FXML
    private TextField addresstxt;

    @FXML
    private TextField agetxt;

    @FXML
    private TextField cousintelnotxt;

    @FXML
    private TextField fnametxt;

    @FXML
    private TextField nictxt;

    @FXML
    private Button submitempbtn;

    @FXML
    private TextField telnotxt;
        
    @FXML
    private TextField designationtxt;
        
    dbconnection conDB2 = new dbconnection();
    Connection con;
    
    private PreparedStatement ps;
    
    Message msg =new Message();
    
    @FXML
    void Empinfosubmit(ActionEvent event) throws ClassNotFoundException, SQLException, InterruptedException {
    	
    	mediaplayer.play();
    	con = conDB2.getConnection();
    	
    	String insert = "INSERT INTO employee(EmpNo, Name, Age, NIC, Designation, Mobile, Contact, Address)"+"Values (?, ?, ?, ?, ?, ?, ?, ?)";
    	ps = con.prepareStatement(insert);
   
    	
    	ps.setString(1, EmpNotxt.getText());
    	ps.setString(2, fnametxt.getText());
    	ps.setString(3, agetxt.getText());
    	ps.setString(4, nictxt.getText());
    	ps.setString(5, designationtxt.getText());
    	ps.setString(6, telnotxt.getText());
    	ps.setString(7, cousintelnotxt.getText());
    	ps.setString(8, addresstxt.getText());
    	
    	ps.executeUpdate();
    	
    	msg.setMessage("Data Inserted!");
    	System.out.println("Data Inserted!"); 
    	/*
    	Alert a = new Alert(AlertType.NONE);
    	a.setAlertType(AlertType.CONFIRMATION);
    	a.show();
    	*/

    }
    
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
    	AdminOverviewbtn.getScene().getWindow().hide();
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
    	SelectedAdminAddEmpbtn.getScene().getWindow().hide();
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
    

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		// TODO Auto-generated method stub
		
	}
	
	
	@FXML
    void EmpAddress(ActionEvent event) {
		mediaplayer.play();
    }

    @FXML
    void EmpAge(ActionEvent event) {
    	mediaplayer.play();
    }

    @FXML
    void EmpCousinNo(ActionEvent event) {
    	mediaplayer.play();
    }

    @FXML
    void EmpDesignation(ActionEvent event) {
    	mediaplayer.play();
    }

    @FXML
    void EmpFname(ActionEvent event) {
    	mediaplayer.play();
    }

    @FXML
    void EmpMNo(ActionEvent event) {
    	mediaplayer.play();
    }

    @FXML
    void EmpNIC(ActionEvent event) {
    	mediaplayer.play();
    }

    @FXML
    void EmpNo(ActionEvent event) {
    	mediaplayer.play();
    }
    @FXML
    void test(MouseEvent event) {
    	mediaplayer.play();
    }
    @FXML
    void test1(MouseEvent event) {
    	mediaplayer.play();
    }
    

}
