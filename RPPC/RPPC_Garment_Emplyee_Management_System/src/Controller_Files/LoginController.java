package Controller_Files;

import java.io.File;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class LoginController {
	
	
	String path = "D:\\Files\\Semester 3\\03.CSC2123 Object Oriented Programming\\Java Project 1\\RPPC\\MouseClickSound.mp3";
	
	javafx.scene.media.Media media = new javafx.scene.media.Media(new File(path).toURI().toString());

	MediaPlayer mediaplayer  = new MediaPlayer(media);

    @FXML
    private ImageView login;

    @FXML
    private Button loginbutton;

    @FXML
    private AnchorPane loginpane;

    @FXML
    private PasswordField pwdfield;

    @FXML
    private TextField uname;

    @FXML
    void loginaction(ActionEvent event) throws IOException {
    	
    	mediaplayer.play();
    	loginbutton.getScene().getWindow().hide();
    	Stage navtooverview = new Stage();
    	
    	String unameg = uname.getText();
    	String loweruname = unameg.toLowerCase();
    	String pwd = pwdfield.getText();
    	
    	String originaluname = "admin";
    	String originalpwd = "123456";
    	
    	if(loweruname.equals(originaluname) && pwd.equals(originalpwd)) {
    		
    		Parent root = FXMLLoader.load(getClass().getResource("/FXML_Files/AdminHomedetails.fxml"));
			Scene scene = new Scene(root);
			navtooverview.setResizable(false);
			navtooverview.setScene(scene);
			navtooverview.show();
    		
    		
    	}else {
    		  		
    		System.out.println("Enter Valid Data!");
    		
    	}
    	
    	
			
    	
    	
    	
    	

    }
	
	

}
