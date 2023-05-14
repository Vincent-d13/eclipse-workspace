package View;

import java.io.Serializable;

import Launch.Main;
import Model.User;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class profileView implements Serializable{

	static BorderPane root;
	static VBox box2 = new VBox(20);
	static Label l1;
	static Separator sep;
	public static String testString;
	static boolean b1 = false;

	public profileView(Stage primaryStage) {

		User u1 = Main.userMap.getValue(homeHubView.getUserClicked());
		User u2 = Main.userMap.getValue(loginView.getUserName());

		HBox box = new HBox(20);
		Label posts = new Label();
		Label followers = new Label();
		Button follow = new Button("follow");
		followers.setText(String.valueOf(u1.getFollowers()) + "\n" + "Followers");
		if (u2.getFollowMap().checkIfItContains(u1.getUserName())) {
			follow.setText("Following");
			follow.setDisable(true);
		} else {
			follow.setOnAction(e -> {
				b1 = true;
				followers.setText(String.valueOf(u1.addFollowers()) + "\n" + "Followers");
				u1.setFollowPressed(true);
				follow.setText("Following");
				u2.getFollowMap().insert(u1.getUserName(), u1);
			//	u2.getFollowMessages().insert(u1.getMessageList());
				for (int i = 0; i < u1.getMessageList().getSize(); i++) {
					u2.getFollowingMessages().insert(u1.getMessageList().getList().get(i));
					u2.getFollowUsername().insert(u1.getUserName());
					
				}
				System.out.println(u2.getMessageList().getSize() + " message list size");
			});
		}
		
		posts.setText(String.valueOf(u1.getPosts()) + "\n" + "Posts");
		System.out.println(u1.getPosts());
		Button back = new Button("back");

		back.setOnAction(e -> {
			homeHubView.box.getChildren().clear();
			box2.getChildren().clear();
			this.root = new homeHubView(primaryStage).getRoot();
			primaryStage.getScene().setRoot(this.root);
		});
		

		box.setAlignment(Pos.CENTER);
		box.getChildren().addAll(posts, followers, follow, back);
		
		//center
		
		box2.setPadding(new Insets(50, 50, 50, 50));

		box2.setAlignment(Pos.CENTER);    
		
		for (int i = 0; i < u1.getMessageList().getSize(); i++) {
	    l1 = new Label();
	    sep = new Separator();
	    sep.setOrientation(Orientation.HORIZONTAL);
		l1.setAlignment(Pos.CENTER);
		l1.setText(u1.getMessageList().getLink(i));
		u1.getMessageList().printList();
		
		box2.getChildren().add(l1);
		box2.getChildren().add(sep);
		}
		ScrollPane scroll = new ScrollPane();
		scroll.setContent(box2);
		scroll.setPannable(true);
		scroll.setFitToWidth(true);
		scroll.setPrefSize(10, 10);
		
		//left
		VBox box3 = new VBox(20);
		box3.setPrefSize(150, 150);
		
		//right
		VBox box4 = new VBox(20);
		box4.setPrefSize(150, 150);

		root = new BorderPane();
		root.setTop(box);
		root.setCenter(scroll);
		root.setLeft(box3);
		root.setRight(box4);

	}

	public static BorderPane getRoot() {
		return root;
	}

}
