package application;

import java.io.IOException;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.fxml.FXMLLoader;

public class Main extends Application {
		
	@Override
	public void start(Stage primaryStage) throws IOException{
		
		Parent root= FXMLLoader.load(getClass().getResource("/FXML_Files/Login.fxml"));		
		Scene scene = new Scene(root,1160,640);
		primaryStage.setResizable(false);
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setTitle("My Project!");
		Image image = new Image("D:\\Files\\Semester 3\\03.CSC2123 Object Oriented Programming\\Java Project 1\\RPPC\\RPPC_Garment_Emplyee_Management_System\\src\\application\\machine.jpg");
		primaryStage.getIcons().add(image);						
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
