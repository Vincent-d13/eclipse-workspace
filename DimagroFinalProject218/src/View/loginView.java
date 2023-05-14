package View;

import java.io.Serializable;

import Launch.Main;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class loginView implements Serializable{

	static BorderPane root;

	private static String userName2;

	public loginView(Stage primaryStage) {

		HBox box = new HBox(20);
		HBox box2 = new HBox(20);

		TextField userNameField = new TextField();
		PasswordField passWordField = new PasswordField();

		userNameField.setPromptText("User Name");
		passWordField.setPromptText("Password");

		Button Ok = new Button("Login");
		Button signUp = new Button("Sign Up");
		Label userIndicator = new Label();

		Ok.setOnAction(e -> {
			boolean login = Main.userMap.searchByUserNameAndPassword(userNameField.getText(), passWordField.getText());
			if (login == true) {
				userName2 = userNameField.getText();
				System.out.println("true");
				this.root = new discoverView(primaryStage).getRoot();
				primaryStage.getScene().setRoot(this.root);
			} else {
				userIndicator.setText("Wrong Username or Password");
			}

		});

		signUp.setOnAction(e -> {
			this.root =  new signUpView(primaryStage).getRoot();
			primaryStage.getScene().setRoot(this.root);
		});

		HBox btnBox = new HBox(30);
		btnBox.setAlignment(Pos.CENTER);
		btnBox.getChildren().addAll(Ok, signUp);

		box.setAlignment(Pos.CENTER);
		box.getChildren().addAll(userNameField);

		userNameField.setPrefSize(350, 10);

		box2.setAlignment(Pos.CENTER);
		box2.getChildren().addAll(passWordField);

		passWordField.setPrefSize(350, 10);

		VBox root1 = new VBox(20);
	//	root1.setStyle("-fx-background-color: #283544");
		root1.setAlignment(Pos.CENTER);
		root1.setPadding(new Insets(100));
		root1.getChildren().addAll(box, box2, btnBox, userIndicator);
		root = new BorderPane();
		//root.setPadding(new Insets(100));
		root.setCenter(root1);
	}

	public static BorderPane getRoot() {
		return root;
	}

	public static String getUserName() {
		return userName2;
	}

}
