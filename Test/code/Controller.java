
package code;

import com.sun.prism.paint.Color;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {
	@FXML
	private Button b00;
	 @FXML
	 protected void handleSubmitButtonAction(ActionEvent event)
	 {
	 b00.setStyle("-fx-background-color:#965866;");

	 }
	}
