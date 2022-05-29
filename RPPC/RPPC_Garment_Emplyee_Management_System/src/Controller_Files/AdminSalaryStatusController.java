package Controller_Files;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class AdminSalaryStatusController implements Initializable{

	String path = "D:\\Files\\Semester 3\\03.CSC2123 Object Oriented Programming\\Java Project 1\\RPPC\\MouseClickSound.mp3";
	
	javafx.scene.media.Media media = new javafx.scene.media.Media(new File(path).toURI().toString());

	MediaPlayer mediaplayer  = new MediaPlayer(media);	
	
    @FXML
    private Button AdminAddEmpbtn;

    @FXML
    private Button AdminEmpStatus;
    
    @FXML
    private TextField MonthPay;

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
    private Button AdminSalarySelectedStatusbtn;

    @FXML
    private TableColumn<Salary, String> EmpNo;

    @FXML
    private TextField GeneralPay;

    @FXML
    private TableColumn<Salary, String> Month;

    @FXML
    private TableColumn<Salary, String> Name;

    @FXML
    private TextField OTPay;

    @FXML
    private Pane Pane1;

    @FXML
    private Pane Pane2;

    @FXML
    private TableColumn<Salary, String> Total_Hours;

    @FXML
    private TableColumn<Salary, String> Total_OT_Hours;

    @FXML
    private TableColumn<Salary, String> Total_Salary;

    @FXML
    private TableView<Salary> tablet;
    
    
    public void initialize(URL arg0, ResourceBundle arg1) {
    	
    	EmpNo.setCellValueFactory(new PropertyValueFactory<Salary, String>("EmpNo"));
    	Name.setCellValueFactory(new PropertyValueFactory<Salary, String>("Name"));
    	Month.setCellValueFactory(new PropertyValueFactory<Salary, String>("Month"));
    	Total_Hours.setCellValueFactory(new PropertyValueFactory<Salary, String>("Total_Hours"));
    	Total_OT_Hours.setCellValueFactory(new PropertyValueFactory<Salary, String>("Total_OT_Hours"));
    	Total_Salary.setCellValueFactory(new PropertyValueFactory<Salary, String>("Total_Salary"));
    
    }
    

    @FXML
    private Button viewinfo;

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
    void AdminSalaryStatus(ActionEvent event) throws IOException{
    	
    	mediaplayer.play();
    	AdminSalarySelectedStatusbtn.getScene().getWindow().hide();
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
    
    Connection con;
    PreparedStatement pst;
    dbconnection conObj =new dbconnection();
    

    @FXML
    void CalSalary(ActionEvent event) throws SQLException, ClassNotFoundException {
    	   	
    	
    	con = conObj.getConnection();
        
        ObservableList<Salary> data = FXCollections.observableArrayList();
        
        tablet.setItems(data);      
        String str = "";
    
        String month = MonthPay.getText();
        String input = month.toLowerCase();
        String may = "may";
        
        String month2 = MonthPay.getText();
        String input2 = month2.toLowerCase();
        String august = "august";
                 
        if(input.equals(may)) {
        	str = "select EmpNo, Name, Month, Total_Hours, Total_OT_Hours, Total_Hours * ? + Total_OT_Hours * ? as Total_Salary from may_salary";        	
        	pst = con.prepareStatement(str);
        	int general = Integer.parseInt(GeneralPay.getText());
            int OT = Integer.parseInt(OTPay.getText());        	       
            pst.setInt(1, general);
            pst.setInt(2, OT);
        	
        	
        }else if(input2.equals(august)) {       
        	str = "select EmpNo, Name, Month, Total_Hours, Total_OT_Hours, Total_Hours * ? + Total_OT_Hours * ? as Total_Salary from august_salary";        	
        	pst = con.prepareStatement(str);
        	int general = Integer.parseInt(GeneralPay.getText());
            int OT = Integer.parseInt(OTPay.getText());        	       
            pst.setInt(1, general);
            pst.setInt(2, OT);
        }else {
        	System.out.println("Enter Valid details!");
        }
                
        ResultSet rs = pst.executeQuery();
        
        while(rs.next()) {
        	Salary s = new Salary(rs.getString("EmpNo"), rs.getString("Name"), rs.getString("Month"), rs.getString("Total_Hours"), rs.getString("Total_OT_Hours"), rs.getString("Total_Salary"));
        	data.add(s);
        }

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
    void GeneralPayment(ActionEvent event) {

    }

    @FXML
    void OTPayment(ActionEvent event) {

    }
    
    @FXML
    void PaymentMonth(ActionEvent event) {

    }

    @FXML
    void test(MouseEvent event) {

    }

}
