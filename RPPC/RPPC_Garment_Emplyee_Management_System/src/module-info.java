module RPPC_Garment_Emplyee_Management_System {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	requires java.desktop;
	requires java.sql;
	requires javafx.media;
	
	
	opens application to javafx.graphics, javafx.fxml, javafx.base;
	opens Controller_Files to javafx.graphics, javafx.fxml, javafx.base;
}
