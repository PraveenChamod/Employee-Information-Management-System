package AlertMessageBox;

import javafx.scene.control.Alert;

public class Message {
	
	public void setMessage(String str) {
		
		Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
		alert.setHeaderText("Alert Message");
		alert.setContentText(str);
		alert.show();
		
		
	}

}
