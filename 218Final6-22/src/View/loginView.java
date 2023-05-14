package View;

import Boot.Main;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class loginView {
	
	static VBox root;
	
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
			boolean login = Main.appMap.searchByUserNameAndPassword(userNameField.getText(), passWordField.getText());
			if (login == true) {
				this.root = new userView(primaryStage).getRoot();
				primaryStage.getScene().setRoot(this.root);
			} else {
				userIndicator.setText("Wrong Username or Password");
			}
			
		});
		
		signUp.setOnAction(e ->{
			this.root = new signUpView(primaryStage).getRoot();
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
		
		root = new VBox(10);
		root.setAlignment(Pos.CENTER);
		root.setPadding(new Insets(100));
		root.getChildren().addAll(box, box2, btnBox, userIndicator);
	}
	
	public static VBox getRoot() {
		return root;
	}

}
