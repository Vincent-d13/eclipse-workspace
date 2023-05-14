package p1;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


	public class test extends Application {
		
		private static Stage stage;

	@Override
	public void start(Stage primarystage) throws Exception{

		stage = primarystage;
		stage = primarystage;
        Pane root = FXMLLoader.load(getClass().getResource("Main.fxml"));
        Scene scene = new Scene (root);
        stage.setScene(scene);
        stage.setTitle("stonks");
        stage.show();
		
	}

}
