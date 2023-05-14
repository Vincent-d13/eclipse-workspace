package View;

import java.io.Serializable;

import Launch.Main;
import Model.Post;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class discoverView implements Serializable{
	
	static BorderPane root;
	static Button profileView3;
	static String userName;
	VBox box = new VBox(20);
	Stage prim;
	static Label l1;
	static Separator sep;
	static Button comment;
	static Label label;
	static Button profileName3;
	public static int count2;
	
	static Post p1;
	public discoverView(Stage primaryStage) {
		this.prim = primaryStage;
		HBox btnBox2 = new HBox(20);
		Button back = new Button("Back");
		btnBox2.getChildren().add(back);
		
		Font font = new Font(20);
		back.setPrefSize(130, 10);
		back.setFont(font);

		back.setStyle("-fx-background-color: transparent");

		back.hoverProperty().addListener(e -> {
			back.setStyle("-fx-background-color: #939393");

		});

		back.onMouseExitedProperty().set(e -> {
			back.setStyle("-fx-background-color: transparent");
		});

	
		
		back.setOnAction(e -> {;
		homeHubView.box.getChildren().clear();
		count2++;
		profileView.b1 = false;
		box.getChildren().clear();
		this.root = new homeHubView(prim).getRoot();
		prim.getScene().setRoot(this.root);
		});
		
		box.setAlignment(Pos.CENTER);
		//	System.out.println(homeHubView.getTheReplyList().getSize());
			
		Button viewAll = new Button("view");
		

		
		for (int i = 0; i< Main.theList.getSize(); i++) {
			HBox btnBox = new HBox(20);
			Post attempt2 = new Post(profileView3 = new Button(Main.theUserName.getLink(i)), comment = new Button("comment"), label = new Label(), null);
			attempt2.getName().setStyle("-fx-background-color: transparent");
			attempt2.getName().hoverProperty().addListener(e -> {
				attempt2.getName().setStyle("-fx-background-color: #939393");

			});

		//	homeHubView.obj.getReplyList().getList().getLast();
			attempt2.getName().onMouseExitedProperty().set(e -> {
				attempt2.getName().setStyle("-fx-background-color: transparent");
			});
			attempt2.getName().setOnAction(e -> {
				userName = ((Button) e.getSource()).getText();
				homeHubView.setUserClicked(userName);
				this.root = new profileView(prim).getRoot();
				prim.getScene().setRoot(this.root);
			});
			attempt2.getComment().setOnAction(e -> {
				label = attempt2.getText();
			//	homeHubView.setPost(attempt2);
			//	System.out.println(homeHubView.getThePost().getReplyList() + " discover list");
				this.root = new commentView(prim, attempt2).getRoot();
				prim.getScene().setRoot(this.root);
			});
			Separator sep3 = new Separator();
			sep3.setOrientation(Orientation.HORIZONTAL);
			attempt2.getText().setAlignment(Pos.CENTER);
			attempt2.setLabelText(Main.theList.getList().get(i));
			box.getChildren().add(profileView3);
			box.getChildren().add(attempt2.getText());
			btnBox.getChildren().addAll(attempt2.getComment());
			
		
			box.getChildren().add(btnBox);
			box.getChildren().addAll(sep3);
		}
		
			ScrollPane scroll = new ScrollPane();
			scroll.setContent(box);
			scroll.setPannable(true);
			scroll.setFitToWidth(true);
			scroll.setPrefSize(10, 10);
			
			//left
			VBox box2 = new VBox(20);
			box2.setPrefSize(200, 200);
			
			//right
			VBox box3 = new VBox(20);
			box3.setPrefSize(200, 200);
			
			
			
			root = new BorderPane();
			root.setCenter(scroll);
			root.setLeft(btnBox2);
			root.setRight(box3);
	}
	
	
	public static BorderPane getRoot() {
		return root;
	}
	


}
