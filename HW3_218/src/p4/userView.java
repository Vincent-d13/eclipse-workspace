package p4;

import java.time.Clock;
import java.util.Arrays;

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
		TextField GPAField = new TextField();

		firstNameField.setPromptText("First Name");
		lastNameField.setPromptText("Last Name");
		GPAField.setPromptText("GPA");

		firstNameField.setPrefSize(350, 10);
		lastNameField.setPrefSize(350, 10);
		GPAField.setPrefSize(350, 10);

		box.setAlignment(Pos.CENTER);
		box.getChildren().addAll(firstNameField);

		box2.setAlignment(Pos.CENTER);
		box2.getChildren().addAll(lastNameField);

		box3.setAlignment(Pos.CENTER);
		box3.getChildren().addAll(GPAField);

		Label label = new Label();

//		label.setText("Queue Full");

		enroll.setOnAction(e -> {
			
			
			String firstName = firstNameField.getText();
			String lastName = lastNameField.getText();
			double GPA = Double.parseDouble(GPAField.getText());
			Student app = new Student(firstName, lastName, GPA);
			Student s;
			if (!Demo.apps.isFull()) {
				Demo.apps.insert(app);
			}
			if (Demo.apps.isFull()) {
				while (!Demo.waitList.isFull()) {
					s = Demo.apps.pol();
					Demo.waitList.insert(s);
					t2.appendText(s.toString() + System.lineSeparator());

				} while (!Demo.apps.isFull()) {
					s = Demo.apps.pol();
					t1.appendText(s.toString() + System.lineSeparator());
				}

			} 
			firstNameField.clear();
			lastNameField.clear();
			GPAField.clear();

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
