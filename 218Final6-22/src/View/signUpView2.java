package View;

import Boot.Main;
import Model.Utilities;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class signUpView2 {

	static VBox root;

	private static double gpa2;
	private static double income2;
	private static String essay2;

	public signUpView2(Stage primaryStage) {

		HBox boxGpa = new HBox();
		HBox boxIncome = new HBox();
		HBox buttonBox = new HBox(30);
		HBox buttonBox2 = new HBox(30);

		TextField gpa = new TextField();
		TextField income = new TextField();

		Label label = new Label();
		
		gpa.setPromptText("GPA");
		income.setPromptText("Family Income");

		gpa.setPrefSize(350, 10);
		income.setPrefSize(350, 10);

		Button demo = new Button("Upload Essay");
		Button finish = new Button("Finish");
		Button finishLater = new Button("Finish Later");

		
		finish.setOnAction(e -> {
			signUpView.app().setGpa(Double.parseDouble(gpa.getText()));
			signUpView.app().setIncome(Double.parseDouble(income.getText()));
			signUpView.app().setEssay(essay2);
			Main.appMap.display();
			this.root = new loginView(primaryStage).getRoot();
			primaryStage.getScene().setRoot(this.root);

		});

		FileChooser fileChooser = new FileChooser();

		demo.setOnAction(e -> {
			fileChooser.setTitle("Open Resource File");
			fileChooser.getExtensionFilters().addAll(new ExtensionFilter("Text Files", "*.txt"),
					new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"),
					new ExtensionFilter("Audio Files", "*.wav", "*.mp3", "*.aac"),
					new ExtensionFilter("All Files", "*.*"));
			String filePathName = fileChooser.showOpenDialog(primaryStage).getPath();
			essay2 = Utilities.fileToString(filePathName);
			label.setText(filePathName);
		});
		
		finishLater.setOnAction(e -> {
			
			this.root = new loginView(primaryStage).getRoot();
			primaryStage.getScene().setRoot(this.root);
		});

		boxGpa.setAlignment(Pos.CENTER);
		boxGpa.getChildren().addAll(gpa);

		boxIncome.setAlignment(Pos.CENTER);
		boxIncome.getChildren().addAll(income);

		buttonBox.setAlignment(Pos.CENTER);
		buttonBox.getChildren().addAll(demo, label);
		
		buttonBox2.setAlignment(Pos.CENTER);
		buttonBox2.getChildren().addAll(finish, finishLater);

		root = new VBox(10);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(boxGpa, boxIncome, buttonBox, buttonBox2);
	}

	public static VBox getRoot() {
		return root;
	}

	public static double gpa() {
		return gpa2;
	}

	public static double income() {
		return income2;
	}

	public static String essay() {
		return essay2;
	}

}
