package Boot;

import Model.applicantMap;
import Model.applicantTree;
import Utilities.criteria;
import Utilities.dictionaryHashSet;
import View.applyView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

	public static applicantMap appMap = new applicantMap();
	public static applicantTree appTree = new applicantTree();
	public static dictionaryHashSet dic = new dictionaryHashSet();
	public static criteria ai = new criteria();

	public static void main(String[] args) {

		launch(args);
	}

	@Override
	public void start(Stage primaryStage) {	
		Utilities.saveData.restoreDictionary();
		Utilities.saveData.restoreMap();
		Utilities.saveData.restoreTree();
		Pane root = new applyView(primaryStage).getRoot();
		Scene scene = new Scene(root, 1200, 800);
		primaryStage.setScene(scene);
		primaryStage.show();

		primaryStage.setOnCloseRequest(e -> {
			Utilities.saveData.backUpMap();
			Utilities.saveData.backUpTree();
			Utilities.saveData.saveDictionary();
		});

	}

}
