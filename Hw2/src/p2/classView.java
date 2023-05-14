package p2;

import java.util.Arrays;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class classView {
	
	private static Pane classBox;
	
	public classView () {
		
		classBox = new VBox(30);
		((VBox) classBox).setAlignment(Pos.CENTER);
		
		HBox infoBox = new HBox(30);
		infoBox.setAlignment(Pos.CENTER);
		TextArea infoField = new TextArea();
		TextArea infoField2 = new TextArea();
		infoField.setPrefSize(200, 500);
		infoField2.setPrefSize(200, 500);
		infoBox.getChildren().addAll(infoField2, infoField);
		

		HBox btnBox = new HBox(30);
		btnBox.setAlignment(Pos.CENTER);
		Button insertBtn = new Button("Insert");
		insertBtn.setPrefSize(80, 10);
		
		insertBtn.setOnAction(e -> {
			Student s1 = new Student ("Joe", "1234567", "cse");
			Student s2 = new Student ("Oej", "1234745", "bio");
			Student s3 = new Student ("Eoj", "1236567", "mat");
			Student s4 = new Student ("Ejo", "1534567", "phy");
			Student s5 = new Student ("Oje", "5934567", "che");
			Student s6 = new Student ("D", "1", "Bath");
			QueueStu arr = new QueueStu();
			if (!arr.isFull()) {
				Student [] waitList = new Student[5];
				
			}
			
			
		
		});
		
		btnBox.getChildren().addAll(insertBtn);
		classBox.getChildren().addAll(infoBox, btnBox);
	}
	
	public static Pane getInstructorPane() {
		if (classBox == null) {
			new classView();
		}
		return classBox;
	}

}
