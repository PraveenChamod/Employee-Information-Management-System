package Controller_Files;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import AlertMessageBox.Message;
import DataBaseConnection.dbconnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class AdminPermissions {
	
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
    private Button AdminOverviewbtn;

    @FXML
    private Button AdminRemoveEmpbtn;

    @FXML
    private Button AdminSalaryStatusbtn;

    @FXML
    private Button AdminSelectedPermissionsbtn;

    @FXML
    private Button ApplyPermit;

    @FXML
    private Button DenyPermit;

    @FXML
    private TextField EmpPermissionNotxt;

    @FXML
    private Pane Pane1;

    @FXML
    private Pane Pane2;

    @FXML
    private TextField UserName;

    @FXML
    private PasswordField UserPwd;

    @FXML
    private TextField fnamePermissiontxt;

    @FXML
    private TextField nicPermissiontxt;

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
    	AdminSelectedPermissionsbtn.getScene().getWindow().hide();
    	Stage navtoremoveemp = new Stage();
    	
			Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/AdminPermissions.fxml"));
			Scene scene = new Scene(root);
			navtoremoveemp.setResizable(false);
			navtoremoveemp.setScene(scene);
			navtoremoveemp.show();

    }

    @FXML
    void EmpFname(ActionEvent event) {

    }

    @FXML
    void EmpNIC(ActionEvent event) {

    }

    @FXML
    void EmpNo(ActionEvent event) {

    }
    
    dbconnection conDB2 = new dbconnection();
    Connection con;
    
    private PreparedStatement ps;
    Message msg =new Message();

    @FXML
    void Empinfosubmit(ActionEvent event) throws ClassNotFoundException, SQLException {
    	
    	mediaplayer.play();
    	con = conDB2.getConnection();
    	
    	String insert = "INSERT INTO permissions(EmpNo, Name, NIC, Username, Password, Access)"+"Values (?, ?, ?, ?, ?, 'Permit')";
    	ps = con.prepareStatement(insert);
       	
    	ps.setString(1, EmpPermissionNotxt.getText());
    	ps.setString(2, fnamePermissiontxt.getText());
    	ps.setString(3, nicPermissiontxt.getText());
    	ps.setString(4, UserName.getText());
    	ps.setString(5, UserPwd.getText());

    	ps.executeUpdate();
    	
    	msg.setMessage("Permission Granted!");
    	System.out.println("Permission Granted!");
    	

    }
    
    
    @FXML
    void DenyPermission(ActionEvent event) throws ClassNotFoundException, SQLException {
    	
    	mediaplayer.play();
    	con = conDB2.getConnection();
   	
    	String update = "UPDATE permissions SET Access = 'Deny' WHERE EmpNo = ?";
    	ps = con.prepareStatement(update);
    	ps.setString(1, EmpPermissionNotxt.getText());
    	ps.executeUpdate();
    	
    	msg.setMessage("Permission Denied!");
    	System.out.println("Permission Denied!");

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

    @FXML
    void test(MouseEvent event) {

    }

    @FXML
    void test1(MouseEvent event) {

    }

}


