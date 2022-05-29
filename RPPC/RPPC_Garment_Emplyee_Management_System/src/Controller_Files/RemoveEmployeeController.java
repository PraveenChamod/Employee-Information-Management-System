package Controller_Files;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import AlertMessageBox.Message;
import DataBaseConnection.dbconnection;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.scene.control.cell.PropertyValueFactory;

public class RemoveEmployeeController implements Initializable{

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
    private Button AdminPermissionsbtn;

    @FXML
    private Button AdminSalaryStatusbtn;

    @FXML
    private Pane Pane1;

    @FXML
    private Pane Pane2;

    @FXML
    private Pane Pane3;

    @FXML
    private Button SelectedAdminRemoveEmpbtn;

    @FXML
    private TextField checkEmpNotxt;

    @FXML
    private TextField checkdesignationtxt;

    @FXML
    private Button checkempbtn;

    @FXML
    private TextField checknictxt;
    
    @FXML
    private AnchorPane removeEmpPane;

    @FXML
    private Button removeEmpbtn;

    @FXML
    private ScrollPane removeempscrollpane;    


    @FXML
    private TableView<Employee> table;
    
    Connection conn;
    dbconnection conObj =new dbconnection();
    private PreparedStatement ps;
    
    
    @FXML
    void showdata(ActionEvent event) throws ClassNotFoundException, SQLException, InterruptedException {
    	
    conn = conObj.getConnection();
    
    ObservableList<Employee> data = FXCollections.observableArrayList();
    
    table.setItems(data);
    
    
    String mystr = "SELECT * from employee where EmpNo = ?";
    ps = conn.prepareStatement(mystr);
    String empNo = checkEmpNotxt.getText();
    ps.setString(1, empNo);
  
    ResultSet rs = ps.executeQuery();
    
    
	while(rs.next()) {
    	Employee s = new Employee(rs.getString("EmpNo"), rs.getString("Name"), rs.getString("Age"), rs.getString("NIC"), rs.getString("Designation"), rs.getString("Mobile"), rs.getString("Contact"), rs.getString("Address"));
    	data.add(s);
    }
 
    
    }
    Message msg =new Message();
    
    @FXML
    void RemoveAmp(ActionEvent event) throws ClassNotFoundException, SQLException, InterruptedException {
    	
    	msg.setMessage("Data Removed!");
    	System.out.println("Data Removed!");
    	
        conn = conObj.getConnection();
        
        ObservableList<Employee> data = FXCollections.observableArrayList();
        
        table.setItems(data);
        
        
        String query = "DELETE FROM employee WHERE EmpNo = ?";
        PreparedStatement preparedStmt = conn.prepareStatement(query);
        preparedStmt.setString(1, checkEmpNotxt.getText());
        
        preparedStmt.execute();
      
        String mystr = "SELECT * FROM employee";
        ps = conn.prepareStatement(mystr);
      
        ResultSet rs = ps.executeQuery();
        
        
    	while(rs.next()) {
        	Employee s = new Employee(rs.getString("EmpNo"), rs.getString("Name"), rs.getString("Age"), rs.getString("NIC"), rs.getString("Designation"), rs.getString("Mobile"), rs.getString("Contact"), rs.getString("Address"));
        	data.add(s);
        }
        

    }
    
    @FXML
    private TableColumn<Employee, String> Address;

    @FXML
    private TableColumn<Employee, String> Age;

    @FXML
    private TableColumn<Employee, String> Contact;

    @FXML
    private TableColumn<Employee, String> Designation;

    @FXML
    private TableColumn<Employee, String> EmpNo;

    @FXML
    private TableColumn<Employee, String> Name;

    @FXML
    private TableColumn<Employee, String> NIC;

    @FXML
    private TableColumn<Employee, String> Mobile;
    
    public void initialize(URL arg0, ResourceBundle arg1) {
    	
    	EmpNo.setCellValueFactory(new PropertyValueFactory<Employee,String>("EmpNo"));
    	Name.setCellValueFactory(new PropertyValueFactory<Employee,String>("Name"));
    	Age.setCellValueFactory(new PropertyValueFactory<Employee,String>("Age"));
    	NIC.setCellValueFactory(new PropertyValueFactory<Employee,String>("NIC"));
    	Designation.setCellValueFactory(new PropertyValueFactory<Employee,String>("Designation"));
    	Mobile.setCellValueFactory(new PropertyValueFactory<Employee,String>("Mobile"));
    	Contact.setCellValueFactory(new PropertyValueFactory<Employee,String>("Contact"));
    	Address.setCellValueFactory(new PropertyValueFactory<Employee,String>("Address"));
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
    	SelectedAdminRemoveEmpbtn.getScene().getWindow().hide();
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
