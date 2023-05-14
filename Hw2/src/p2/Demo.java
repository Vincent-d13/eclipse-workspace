package p2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Demo extends Application{

	public static void main(String[] args) {

		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Pane root = new classView().getInstructorPane();
		Scene scene = new Scene(root, 1000, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
