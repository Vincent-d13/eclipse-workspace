package View;

import Boot.Main;
import Model.Applicant;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class loginView {

	static VBox root;

	private static String userName2;

	public loginView(Stage primaryStage) {

		TextField userName = new TextField();
		PasswordField passWord = new PasswordField();

		userName.setPromptText("Username");
		passWord.setPromptText("Password");

		Button Continue = new Button("Continue");
		Label label = new Label();
		Label label2 = new Label();

		Continue.setOnAction(e -> {
			boolean map = Main.appMap.searchByUserNameAndPassword(userName.getText(), passWord.getText());
			if (map == true) {
				userName2 = userName.getText();
				this.root = new userView(primaryStage).getRoot();
				primaryStage.getScene().setRoot(this.root);
				System.out.println(userName2);
			} else {

				label.setText("Wrong Username or Password");
			}
		});

		Button back = new Button("Back");
		back.setOnAction(e -> {
			this.root = new applyView(primaryStage).getRoot();
			primaryStage.getScene().setRoot(this.root);
		});

		HBox btnBox = new HBox(30);
		btnBox.setAlignment(Pos.CENTER);
		btnBox.getChildren().addAll(Continue, back);

		root = new VBox(20);
		root.setAlignment(Pos.CENTER);
		root.setPadding(new Insets(100));
		root.getChildren().addAll(userName, passWord, btnBox, label, label2);
	}
	
	public static VBox getRoot() {
		return root;
	}

	public Applicant getPersonLogged() {
		return Main.appMap.getValue(getUserName());
	}

	public static String getUserName() {
		return userName2;
	}
}
