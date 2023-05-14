package p3;

import java.time.Clock;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class userView {

	static VBox root;

	public userView(Stage primaryStage) {

		HBox box = new HBox();
		HBox box2 = new HBox();
		HBox box3 = new HBox();

		TextArea t1 = new TextArea();
		TextArea t2 = new TextArea();

		HBox btnBox = new HBox(30);
		Button enroll = new Button("Enroll");
		btnBox.setAlignment(Pos.CENTER);

		TextField firstNameField = new TextField();
		TextField lastNameField = new TextField();
		TextField phoneNumberField = new TextField();

		firstNameField.setPromptText("First Name");
		lastNameField.setPromptText("Last Name");
		phoneNumberField.setPromptText("Phone Number");

		firstNameField.setPrefSize(350, 10);
		lastNameField.setPrefSize(350, 10);
		phoneNumberField.setPrefSize(350, 10);

		box.setAlignment(Pos.CENTER);
		box.getChildren().addAll(firstNameField);

		box2.setAlignment(Pos.CENTER);
		box2.getChildren().addAll(lastNameField);

		box3.setAlignment(Pos.CENTER);
		box3.getChildren().addAll(phoneNumberField);

		Label label = new Label();

//		label.setText("Queue Full");

		enroll.setOnAction(e -> {

			String firstName = firstNameField.getText();
			String lastName = lastNameField.getText();
			String phoneNumber = phoneNumberField.getText();
			Applicant app = new Applicant(firstName, lastName, phoneNumber);
			if (!Demo.apps.isFull()) {
				Demo.apps.insert(app);
				t1.appendText(app.toString() + " " + Clock.systemUTC().instant() + System.lineSeparator());
			} else {
				Demo.waitList.insert(app);
				// label.setText("Full");
				t2.appendText(app.toString() + " " + Clock.systemUTC().instant() + System.lineSeparator());
			}

			firstNameField.clear();
			lastNameField.clear();
			phoneNumberField.clear();
		});

		btnBox.getChildren().add(enroll);
		HBox taBox = new HBox();
		taBox.getChildren().add(t1);

		root = new VBox(10);
		root.setAlignment(Pos.CENTER);
		root.setPadding(new Insets(100));
		root.getChildren().addAll(box, box2, box3, btnBox, t1, t2, label);
	}

	public static VBox getRoot() {
		return root;
	}

}
