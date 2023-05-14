package p5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application{

	public static applicantMapStorage appMap = new applicantMapStorage();
	
	public static void main(String[] args) {

		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {	
		Pane root = new loginView(primaryStage).getRoot();
		Scene scene = new Scene(root, 1000, 600);
		primaryStage.setScene(scene);
		primaryStage.show();

}
}