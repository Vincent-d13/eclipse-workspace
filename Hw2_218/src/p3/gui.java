package p3;


import java.util.Stack;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class gui {
	
	static VBox root;
	
	public gui (Stage primaryStage) {
		
		HBox box = new HBox(20);
		HBox btnBox = new HBox(30);
		checkBalance b1 = new checkBalance();
		
		TextArea ta = new TextArea();
		
		Button btn = new Button("Check");
		
		Stack myStack = new Stack();
		Label label = new Label();
		
		btn.setOnAction( e -> {
			for (String line : ta.getText().split("A-Za-z")) {
		//		System.out.println(line);
			if (b1.areBracketsBalanced(line)) {
				label.setText("TRUE");
			} else 
				label.setText("FALSE");
				
			}
			
		});
		
		
//		label.setText("work");
		
		
		btnBox.setAlignment(Pos.CENTER);
		btnBox.getChildren().addAll(btn);
		
		box.setAlignment(Pos.CENTER);
		box.getChildren().addAll(ta);
		
		root = new VBox(10);
		root.setAlignment(Pos.CENTER);
		root.setPadding(new Insets(100));
		root.getChildren().addAll(box, btnBox, label );
	}
	
	public static VBox getRoot() {
		return root;
	}

}
