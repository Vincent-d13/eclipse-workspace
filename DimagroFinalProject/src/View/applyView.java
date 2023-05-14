package View;

import Boot.Main;
import Model.Applicant;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class applyView {

	static VBox root;

	public applyView(Stage primaryStage) {

		TextField userNameField = new TextField();
		PasswordField passwordField = new PasswordField();
		TextField firstName = new TextField();
		TextField lastName = new TextField();
		TextField phoneNumber = new TextField();
		TextField Address = new TextField();
		TextField GPA = new TextField();
		TextField SAT = new TextField();
		TextField familyIncome = new TextField();
		TextArea essay = new TextArea();

		userNameField.setPromptText("Username/Email");
		passwordField.setPromptText("Password");
		firstName.setPromptText("First Name");
		lastName.setPromptText("Last Name");
		phoneNumber.setPromptText("Phone Number");
		Address.setPromptText("Street, City, State, Zip Code");
		GPA.setPromptText("GPA");
		SAT.setPromptText("SAT");
		familyIncome.setPromptText("Family Income");
		essay.setPromptText("PASTE ESSAY");

		essay.setPrefSize(300, 600);

		Label label = new Label();

		Button signUpBtn = new Button("Apply");
		Label label3 = new Label();

		signUpBtn.setOnAction(e -> {

			boolean password = passWordChecker(passwordField.getText().toString());
			if (password == true) {
				Applicant app = new Applicant(firstName.getText(), lastName.getText(), userNameField.getText(),
						passwordField.getText(), phoneNumber.getText(), Address.getText(),
						Double.parseDouble(GPA.getText()), Integer.parseInt(SAT.getText()),
						Double.parseDouble(familyIncome.getText()), essay.getText(), 0.0);
				Main.appMap.insert(userNameField.getText(), app);
				label.setText("Thank you for applying");
				userNameField.clear();
				firstName.clear();
				lastName.clear();
				passwordField.clear();
				phoneNumber.clear();
				Address.clear();
				GPA.clear();
				SAT.clear();
				familyIncome.clear();
				essay.clear();
			} else {
				label3.setText("Password must be 7 characters long and contain 1 lower case and 1 upper case");
				passwordField.clear();
			}
		});

		Label label2 = new Label();
		label2.setText("Apply to register than Login");
		Button login = new Button("Login");
		login.setOnAction(e -> {
			this.root = new loginView(primaryStage).getRoot();
			primaryStage.getScene().setRoot(this.root);
		});

		HBox btnBox = new HBox(30);
		btnBox.setAlignment(Pos.CENTER);
		btnBox.getChildren().addAll(signUpBtn, login);

		root = new VBox(20);
		root.setAlignment(Pos.CENTER);
		root.setPadding(new Insets(100));
		root.getChildren().addAll(userNameField, passwordField, firstName, lastName, phoneNumber, Address, GPA, SAT,
				familyIncome, essay, btnBox, label, label2, label3);
	}

	public static VBox getRoot() {
		return root;
	}

	public boolean passWordChecker(String passWord) {
		char ch;
		boolean capitalFlag = false;
		boolean lowerCaseFlag = false;
		boolean numberFlag = false;
		for (int i = 0; i < passWord.length(); i++) {
			ch = passWord.charAt(i);
			if (Character.isDigit(ch)) {
				numberFlag = true;
			} else if (Character.isUpperCase(ch)) {
				capitalFlag = true;
			} else if (Character.isLowerCase(ch)) {
				lowerCaseFlag = true;
			}
			if (numberFlag && capitalFlag && lowerCaseFlag && i >= 7)
				return true;
		}
		return false;
	}
}
