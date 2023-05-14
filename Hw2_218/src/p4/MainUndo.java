package p4;

import java.util.Stack;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainUndo extends Application{

	public static void main(String[] args) {

		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		final int COL_SIZE = 3;
		final int ROW_SIZE = 3;
		Button[][] a = new Button[COL_SIZE][ROW_SIZE];
		
		Stack<Button> myStack = new Stack<>();
		Label msg = new Label();
		
		HBox undoBtnBox = new HBox();
		Button undoBtn = new Button("Undo");
		undoBtnBox.setAlignment(Pos.CENTER);
		undoBtnBox.getChildren().add(undoBtn);
		undoBtn.setOnAction(e -> {
			if (myStack.isEmpty()) {
				msg.setText("the stack is empty");
			} else {
				Button b = myStack.pop();
				b.setStyle("-fx-background-color: #000");
				msg.setText("");
			}
		});
		
		
		GridPane gridPane = new GridPane();
		for (int i = 0; i < ROW_SIZE; i++) {
			for (int j = 0; j < COL_SIZE; j++) {
				Button b = new Button();
				a[i][j] = b;
				b.setStyle("-fx-background-color: #000");
				b.setPrefSize(100, 100);
				gridPane.add(b, j, i);
				b.setOnAction(e -> {
					b.setStyle("-fx-background-color: #F00");
					myStack.push(b);
					msg.setText("");
					
				});
			}
		}
		gridPane.setAlignment(Pos.CENTER);
		
		
		HBox labelBox = new HBox();
		
		labelBox.getChildren().add(msg);
		labelBox.setAlignment(Pos.CENTER);
		
		VBox root = new VBox(20);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(undoBtnBox, gridPane, labelBox);
		Scene scene = new Scene(root, 1000, 600);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
