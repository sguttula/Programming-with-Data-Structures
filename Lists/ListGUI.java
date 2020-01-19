package hw3;

import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class ListGUI extends BorderPane{
	GridPane gp = new GridPane();
	public void qwerty() {
		HBox one = new HBox();
		one.getStyleClass().add("hbox1");
		Label l = new Label("Test");		
		one.getChildren().add(l);
	}
}
