import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {

		launch(args);
		
		String line2 = Utilities.fileToString("data/blowingInTheWind.txt");
		ParentLinkList parentlink = new ParentLinkList();
		String[] arr = line2.split("\\s+");
		parentlink.connectList(arr);
	}
	
	@Override
	public void start (Stage primaryStage) throws Exception {
		String line2 = Utilities.fileToString("data/blowingInTheWind.txt");
		ParentLinkList parentlink = new ParentLinkList();
		String[] arr = line2.split("\\s+");
		parentlink.connectList(arr);
		Pane root = new Pane();
		Scene scene = new Scene(root, 1000, 500);
		Button enterButton = new Button("enter");
		Button chooseFile = new Button("Choose file");
		TextField wordChosen = new TextField();
		wordChosen.setPromptText("Enter Word");
		TextField numberChoosen = new TextField();
		numberChoosen.setPromptText("Enter Number");
		FileChooser fc = new FileChooser();
		HBox hb1 = new HBox(wordChosen, numberChoosen, enterButton);
		hb1.setAlignment(Pos.CENTER);
		TextArea t1 = new TextArea();
		HBox hb2 = new HBox(t1);
		hb2.setAlignment(Pos.CENTER);
		VBox vb1 = new VBox(hb1, hb2);
		vb1.setAlignment(Pos.CENTER);
		root.getChildren().addAll(vb1);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		enterButton.setOnAction(e -> {
			String word = wordChosen.getText();
			int num = Integer.valueOf(numberChoosen.getText());
			String temp = parentlink.wordGenerator(word, num);
			t1.setText(temp);
			Utilities.writeToFile(fc.showOpenDialog(primaryStage).getPath(),t1.getText());
		});
		
	}

}
