package ch.makery.address.view;

import java.io.File;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.FileChooser;
import ch.makery.address.MainApp;

public class RootLayoutController {

    // Reference to the main application
    private MainApp mainApp;

    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
    }

    @FXML
    private void handleNew(){
    	
    }
    
    @FXML 
    private void handleSave(){
    	
    }
    @FXML
    private void handleSaveAs(){
    	
    }
    @FXML
    private void handleOpen(){
    	
    }
    @FXML
    private void handleAbout(){
    	
    }
    @FXML
    private void handleShowBirthdayStatistics(){
    	
    }
    @FXML
    private void handleExit() {
        System.exit(0);
    }
    

}