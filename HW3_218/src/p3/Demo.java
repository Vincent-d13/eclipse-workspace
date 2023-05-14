package p3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Demo extends Application{
	
	public static applicantStorage apps = new applicantStorage();
	public static appWaitingList waitList = new appWaitingList();

	public static void main(String[] args) {

		launch(args);
		
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane root = new userView(primaryStage).getRoot();
		Scene scene = new Scene(root, 1000, 600);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
