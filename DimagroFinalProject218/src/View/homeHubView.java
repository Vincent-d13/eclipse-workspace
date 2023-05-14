package View;

import java.io.Serializable;
import java.util.LinkedList;

import Launch.Main;
import Model.Post;
import Model.User;
import Model.userLinkList;
import Utilities.dictionaryHashSet;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.Event;
import javafx.geometry.Bounds;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class homeHubView implements Serializable{

	static User user1 = Main.userMap.getValue(loginView.getUserName());

	static VBox box = new VBox(20);
	static Button comment;
	static BorderPane root;
	private Text textHolder = new Text();
	private double oldHeight = 0;
	static Label label;
	static Stage prim;
	static String s1;
	static userLinkList list1;
	static Button profileView1;
	static String userName;
	static userLinkList list3;
	public static Post obj;
	public static String userUploaded;
	public static Button post;
	static Separator sep3;
	public static Post obj2;
	static boolean b2;
	public static String spellCheck;
	public static int numOfType;
	public static Label l;
	
	

	public homeHubView(Stage primaryStage) {
		this.prim = primaryStage;
		User user1 = Main.userMap.getValue(loginView.getUserName());
	//	box.getChildren().clear();
		
		Separator sep = new Separator();
		sep.setOrientation(Orientation.VERTICAL);

		// Buttons right side
		VBox v1 = new VBox(20);
		v1.setPrefSize(200, 200);

		Button test1 = new Button("Home");
		Button test2 = new Button("Discover");
		Button test = new Button("Sign out");

		Font font = new Font(20);
		Font fontLabel = new Font(17);

		test1.setPrefSize(130, 10);
		test2.setPrefSize(130, 10);
		test1.setFont(font);
		test2.setFont(font);
		test.setPrefSize(130, 10);
		test.setFont(font);

		test1.setStyle("-fx-background-color: transparent");
		test2.setStyle("-fx-background-color: transparent");

		test1.hoverProperty().addListener(e -> {
			test1.setStyle("-fx-background-color: #939393");

		});

		test1.onMouseExitedProperty().set(e -> {
			test1.setStyle("-fx-background-color: transparent");
		});

		test2.hoverProperty().addListener(e -> {
			test2.setStyle("-fx-background-color: #939393");

		});

		test2.onMouseExitedProperty().set(e -> {
			test2.setStyle("-fx-background-color: transparent");
		});
		
		test2.setOnAction(e -> {
			this.root = new discoverView(prim).getRoot();
			prim.getScene().setRoot(this.root);
		});

		
		test.setStyle("-fx-background-color: transparent");

		test.hoverProperty().addListener(e -> {
			test.setStyle("-fx-background-color: #939393");

		});

		test.onMouseExitedProperty().set(e -> {
			test.setStyle("-fx-background-color: transparent");
		});

		
		test.setOnAction(e -> {
			box.getChildren().clear();
		//	box.setDisable(true);
			profileView.b1 = false;
			this.root = new loginView(primaryStage).getRoot();
			primaryStage.getScene().setRoot(this.root);
		});
		v1.setAlignment(Pos.TOP_RIGHT);
		v1.getChildren().add(sep);
		v1.getChildren().addAll(test1, test2, test);

		// TextArea top

		HBox v2 = new HBox(20);
		v2.setPadding(new Insets(50));
	   post = new Button("post");
		TextArea textArea = new TextArea();
		textArea.setPromptText("Tell twitta what up");
		textArea.setPrefWidth(350);
		textArea.setPrefHeight(10);
		textArea.setWrapText(true);

		textHolder.textProperty().bind(textArea.textProperty());
		textHolder.layoutBoundsProperty().addListener(new ChangeListener<Bounds>() {
			@Override
			public void changed(ObservableValue<? extends Bounds> observable, Bounds oldValue, Bounds newValue) {
				if (oldHeight != newValue.getHeight()) {
					oldHeight = newValue.getHeight();
					textArea.setPrefHeight(textHolder.getLayoutBounds().getHeight() + 20);
				}
			}
		});

		VBox xob = new VBox(20);
	xob.setAlignment(Pos.CENTER);
			
		
		xob.setPrefSize(200, 200);

	

		xob.setAlignment(Pos.CENTER);
		post.setOnAction(e -> {
			
			String s1 = textArea.getText();
			spellCheck = s1;
			Main.theList.insert(s1);
			user1.getMessageList().insert(s1);
			user1.getFollowingMessages().insert(s1);
			user1.getFollowUsername().insert(loginView.getUserName());
//			user1.getMessageList().printList();
			Main.theUserName.insert(loginView.getUserName());
			testPost();
			getUserposts();
			System.out.println(user1.getFollowingMessages().getSize() + " size from psot");
//			Main.theList.printList();
//			Main.dictionary.numOfTypos();
			 l = new Label();
			
			l.setText(String.valueOf(Main.dictionary.numOfTypos()) + " number of typos");
			
			xob.getChildren().add(l);
		
			textArea.clear();
		});
		
	//	if (commentView.count < 0 && discoverView.count2 < 0) {
			
		if (profileView.b1 == true) {
		for (int i = 0; i  < user1.getFollowingMessages().getSize(); i++) {
		//	user1.getFollowingMessages().removeFirst();;
			   Label l1 = new Label();
			   Button b1 = new Button(user1.getFollowUsername().getLink(i));
			   Button b2 = new Button("comment");
			   HBox btnBox3 = new HBox(20);
			   b2.setOnAction(e -> {
				   this.root = new commentView(prim, null).getRoot();
					prim.getScene().setRoot(this.root);
			   });
			   b1.setStyle("-fx-background-color: transparent");
				b1.hoverProperty().addListener(e -> {
					b1.setStyle("-fx-background-color: #939393");

				});

			b1.onMouseExitedProperty().set(e -> {
					b1.setStyle("-fx-background-color: transparent");
				});
				b1.setOnAction(e -> {
					userName = ((Button) e.getSource()).getText();
					homeHubView.setUserClicked(userName);
					this.root = new profileView(prim).getRoot();
					prim.getScene().setRoot(this.root);
				});
				btnBox3.getChildren().add(b2);
			    sep = new Separator();
			    sep.setOrientation(Orientation.HORIZONTAL);
				l1.setAlignment(Pos.CENTER);
				l1.setText(user1.getFollowingMessages().getLink(i));
				user1.getMessageList().printList();
				
				box.getChildren().add(b1);
				box.getChildren().add(l1);
				box.getChildren().add(btnBox3);
				
				box.getChildren().add(sep);
		}
		}
	//	}

		v2.setAlignment(Pos.TOP_CENTER);
		v2.getChildren().addAll(textArea, post);

		// center

		box.setPadding(new Insets(50));

		ScrollPane scroll = new ScrollPane();
		scroll.setContent(box);
		scroll.setPannable(true);
		scroll.setFitToWidth(true);
		scroll.setPrefSize(10, 10);

		box.setAlignment(Pos.CENTER);

		// something to set left

	
	

		
		
		// somethingo on bottom test

		root = new BorderPane();
		root.setRight(v1);
		root.setTop(v2);
		root.setCenter(scroll);
		root.setLeft(xob);

	}

	public static BorderPane getRoot() {
		return root;
	}

	public void testPost() {
		HBox btnBox = new HBox(20);
		Post attempt = new Post(profileView1 = new Button(loginView.getUserName()),comment = new Button("comment"), label = new Label(), userUploaded);
		attempt.getName().setStyle("-fx-background-color: transparent");
		attempt.getName().hoverProperty().addListener(e -> {
			attempt.getName().setStyle("-fx-background-color: #939393");

		});

		attempt.getName().onMouseExitedProperty().set(e -> {
			attempt.getName().setStyle("-fx-background-color: transparent");
		});
	//	obj = attempt;
		attempt.getName().setOnAction(e -> {
			userName = ((Button) e.getSource()).getText();
			this.root = new profileView(prim).getRoot();
			prim.getScene().setRoot(this.root);
		});
		Separator sep3 = new Separator();
		sep3.setOrientation(Orientation.HORIZONTAL);
		attempt.getText().setAlignment(Pos.CENTER);
	
		
		
		attempt.setLabelText(Main.theList.getList().getLast());
		
	//	attempt.setLabelText(user1.getFollowingMessages().getList().getLast());
		box.getChildren().add(profileView1);
		box.getChildren().add(attempt.getText());
		btnBox.getChildren().addAll(attempt.getComment());
		box.getChildren().add(btnBox);
		box.getChildren().addAll(sep3);
		attempt.getComment().setOnAction(e -> {
			label = attempt.getText();
//			list1 = attempt.getReplyList();
			obj = attempt;
		//	obj2 = attempt;
			
			System.out.println(attempt.getReplyList().getSize() + " attemot button");
			this.root = new commentView(prim, attempt).getRoot();
			prim.getScene().setRoot(this.root);
		});

		//obj.getReplyList().insert("n");
		//System.out.println(obj.getReplyList() + "testpost method");
		
//		attempt.getReplyList().insert("n");
	//	System.out.println(attempt.getReplyList().getSize());
	//	System.out.println(attempt.toString());
		System.out.println("spaghetti");
	}
	
	

	public static String getPostComment() {

		return label.getText();
	}
	

	public static userLinkList getTheReplyList() {
		return list1;
	}

	public static User getUser() {
		return user1;
	}

	public static String getUserClicked() {
		return userName;
	}
	
	public int getUserposts() {
		User u1 = Main.userMap.getValue(loginView.getUserName());
		return u1.addPosts();
	}
	
	public static void  setUserClicked(String s1) {
		userName = s1;
	}
	
	
	
	public static Post getThePost() {
		return obj;
	}
	
	

}
