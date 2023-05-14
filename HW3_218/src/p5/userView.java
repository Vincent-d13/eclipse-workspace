package p5;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class userView {
	
	static VBox root;
	
	public userView(Stage primaryStage) {
		Applicant app = Main.appMap.getValue(signUpView.userName());
		
		HBox btnBox = new HBox();
		Button logOut = new Button("LogOut");
		
		Label label2 = new Label();
		Label label = new Label();
		Label label3 = new Label();
		
		Button btn = new Button("Finsish app");
		
		
		
		logOut.setOnAction(e -> {
			this.root = new loginView(primaryStage).getRoot();
			primaryStage.getScene().setRoot(this.root);
		});
		
		
		
		
		btnBox.setAlignment(Pos.CENTER);
		btnBox.getChildren().addAll(logOut, btn);
		
		root = new VBox(10);
		root.setAlignment(Pos.CENTER);
		root.setPadding(new Insets(100));
		root.getChildren().addAll(label2, label, btnBox, label3);
		
		
	}
	
	public static VBox getRoot() {
		return root;
	}

}
