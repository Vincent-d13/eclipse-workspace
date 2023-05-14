package p5;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class signUpView {
	
	static VBox root;
	
	private static String userName2;
	private static String passWord2;
	private static String firstName2;
	private static String lastName2;
	private static Applicant app2;
	
	public signUpView (Stage primaryStage) {
		
		HBox box = new HBox();
		HBox box2 = new HBox();
		HBox box3 = new HBox();
		HBox box4 = new HBox();
		
		TextField emailField = new TextField();
		TextField firstNameField = new TextField();
		TextField lastNameField = new TextField();
		PasswordField passWordField = new PasswordField();
		
		emailField.setPromptText("Email");
		firstNameField.setPromptText("First Name");
		lastNameField.setPromptText("Last Name");
		passWordField.setPromptText("Password");
		
		emailField.setPrefSize(350, 10);
		firstNameField.setPrefSize(350, 10);
		lastNameField.setPrefSize(350, 10);
		passWordField.setPrefSize(350, 10);
		
		
		box.setAlignment(Pos.CENTER);
		box.getChildren().addAll(emailField);
		
		box2.setAlignment(Pos.CENTER);
		box2.getChildren().addAll(firstNameField);
		
		box3.setAlignment(Pos.CENTER);
		box3.getChildren().addAll(lastNameField);
		
		box4.setAlignment(Pos.CENTER);
		box4.getChildren().addAll(passWordField);
		
		HBox btnBox = new HBox(30);
		btnBox.setAlignment(Pos.CENTER);
		
		Button next = new Button("Next");
		Button back = new Button("Back");
		
		next.setOnAction( e -> {
			userName2 = emailField.getText();
			firstName2 = firstNameField.getText();
			lastName2 = lastNameField.getText();
			passWord2 = passWordField.getText();
			app2 = new Applicant(firstName2, lastName2, userName2, passWord2);
			Main.appMap.insert(userName2, app2);
			this.root = new loginView(primaryStage).getRoot();
			primaryStage.getScene().setRoot(this.root);
		});
		back.setOnAction( e -> {
			this.root = new loginView(primaryStage).getRoot();
			primaryStage.getScene().setRoot(this.root);
		});
		
		btnBox.getChildren().addAll(next, back);
		
		root = new VBox(10);
		root.setAlignment(Pos.CENTER);
		root.setPadding(new Insets(100));
		root.getChildren().addAll(box, box4, box2, box3, btnBox);
		
		
	}

	public static VBox getRoot() {
		return root;
	}
	
	public static String userName() {
		return userName2;
	}
	
	public static String firstName() {
		return firstName2;
	}
	
	public static String lastName() {
		return lastName2;
	}
	
	public static String passWord() {
		return passWord2;
	}
	
	public static Applicant app() {
		return app2;
	}
}
