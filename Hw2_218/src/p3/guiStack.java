package p3;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class guiStack extends Application{
	

	public static void main (String[] args) {
		
		launch(args);
		
		
	}

	
	@Override
	public void start(Stage primaryStage) {
		
		Pane root = new gui(primaryStage).getRoot();
		Scene scene = new Scene(root, 1000, 600);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}

	
	
}
