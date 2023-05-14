package View;

import java.io.Serializable;

import Launch.Main;
import Model.User;
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

public class signUpView implements Serializable{

	static BorderPane root;
	
	
public signUpView (Stage primaryStage) {
	
	
		HBox box2 = new HBox();
		HBox box4 = new HBox();
		
		TextField userNameField = new TextField();
		PasswordField passWordField = new PasswordField();
		
		userNameField.setPromptText("UserName");
		passWordField.setPromptText("Password");
		
		userNameField.setPrefSize(350, 10);
		passWordField.setPrefSize(350, 10);
		
		box2.setAlignment(Pos.CENTER);
		box2.getChildren().addAll(userNameField);
		
		
		box4.setAlignment(Pos.CENTER);
		box4.getChildren().addAll(passWordField);
		
		
		Button next = new Button("Next");
		Button back = new Button("Back");

		HBox btnBox = new HBox(30);
		btnBox.setAlignment(Pos.CENTER);
		btnBox.getChildren().addAll(next, back);
		
		Label label = new Label();
		
		next.setOnAction( e -> {
			User user = new User (userNameField.getText(), passWordField.getText(), 0, 0, false);
			user.getFollowMap().insert(user.getUserName(), user);
			Main.userMap.insert(userNameField.getText(), user);
			Launch.Main.userMap.display();
			Main.userMap.display();
			System.out.println("this is the list displayed");
			label.setText("signed up");
			userNameField.clear();
			passWordField.clear();
			
		
		});
		
		back.setOnAction( e -> {
			this.root = new loginView(primaryStage).getRoot();
			primaryStage.getScene().setRoot(this.root);
		});

		
		VBox root1 = new VBox(20);
		root1.setStyle("-fx-background-color: #283544");
		root1.setAlignment(Pos.CENTER);
		root1.setPadding(new Insets(100));
		root1.getChildren().addAll(box2, box4, label, btnBox);
		root = new BorderPane();
		root.setCenter(root1);
	
}
	
	public static BorderPane getRoot() {
		return root;
	}
}
