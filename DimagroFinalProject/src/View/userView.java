package View;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Boot.Main;
import Model.Applicant;
import Utilities.spellCheck;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class userView {

	static VBox root;

	public userView(Stage primaryStage) {

		Applicant app = Main.appMap.getValue(loginView.getUserName());
		Label label = new Label();
	//	label.setText(Double.toString(spellCheck.fleschScore(app.getEssay())));
		Label label2 = new Label();
		label2.setText("Hello " + app.getFirstName());
		Main.ai.returnDecision(app);

		TextArea appTa = new TextArea();
		try {
			Scanner s = new Scanner(
					new File("decisions/" + app.getFirstName() + "." + app.getLastName() + ".decision" + ".txt"))
							.useDelimiter("\\s+");
			while (s.hasNextLine()) {
				if (s.hasNextInt()) {
					appTa.appendText(s.nextInt() + " ");
				} else {
					String line = s.nextLine() + System.lineSeparator();
					appTa.appendText(line + " ");
				}
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		}

		Main.ai.decider(app);

		Button logOut = new Button("Logout");
		logOut.setOnAction(e -> {
			this.root = new applyView(primaryStage).getRoot();
			primaryStage.getScene().setRoot(this.root);
		});

		HBox btnBox = new HBox(30);
		btnBox.setAlignment(Pos.CENTER);
		btnBox.getChildren().addAll(logOut);

		root = new VBox(20);
		root.setAlignment(Pos.CENTER);
		root.setPadding(new Insets(100));
		root.getChildren().addAll(label2, label, appTa, btnBox);
	}

	public static VBox getRoot() {
		return root;
	}

}
