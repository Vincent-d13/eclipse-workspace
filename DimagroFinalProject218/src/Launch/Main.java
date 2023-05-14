package Launch;

import java.io.Serializable;

import Model.userLinkList;
import Model.userStorage;
import Utilities.dictionaryHashSet;
import View.commentView;
import View.homeHubView;
import View.loginView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application implements Serializable{
	
	public static userStorage userMap = new userStorage();
	public static userLinkList theList = new userLinkList();
	public static userLinkList theUserName = new userLinkList();
	public static dictionaryHashSet dictionary = new dictionaryHashSet();

	public static void main(String[] args) {

		launch(args);
		
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Utilities.saveData.restoreList();
		Utilities.saveData.restoreNameList();
		Utilities.saveData.restoreStorage();
		Pane root = new loginView(primaryStage).getRoot();
		Scene scene = new Scene (root, 1000, 600);
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setOnCloseRequest(e -> {
			Utilities.saveData.backUpList();
			Utilities.saveData.backUpnameList();
			Utilities.saveData.backUpStorage();
		});
		
		
	}

}

