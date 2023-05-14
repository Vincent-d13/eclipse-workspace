package View;

import java.io.Serializable;

import Launch.Main;
import Model.Post;
import Model.User;
import Model.userLinkList;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class commentView implements Serializable{
	
	static BorderPane root;
	static VBox box = new VBox(20);
	private Text textHolder = new Text();
	private double oldHeight = 0;
	User u1 = homeHubView.getUser();
	static Label label;
	static Button comment;
	static userLinkList list;
	static Button profileView2;
	static Label l1;
	static Separator sep;
	static String userName;
	static Stage prim;
	Post p1;
	public static int count;
	static Button nameButton;
	
	
	public commentView(Stage primaryStage, Post post1) {
	//	System.out.println(homeHubView.obj.getReplyList() + "top of constructor");
		this.p1 = post1;
		this.prim = primaryStage;
		//top
		HBox v2 = new HBox(20);
		Button back = new Button("back");
		v2.setPadding(new Insets(50));
		Button post = new Button("post");
		TextArea textArea = new TextArea();
		textArea.setPromptText("Tell twitta what up");
		textArea.setPrefWidth(350);
		textArea.setPrefHeight(10);
		textArea.setWrapText(true);
		
		post.setOnAction(e -> {
			String s1 = textArea.getText();
	//		homeHubView.getTheReplyList().insert(s1);
			homeHubView.obj.getReplyList().insert(s1);
			test();
			homeHubView.obj.getReplyList().printList();
			System.out.println(homeHubView.obj.getReplyList().getSize() + " obj size");
			textArea.clear();
		});
		
		back.setOnAction(e -> {
		//	homeHubView.box.getChildren().clear();
			box.getChildren().clear();
			profileView.b1 = false;
			count++;
			this.root = new homeHubView(primaryStage).getRoot();
			primaryStage.getScene().setRoot(this.root);
		});
		
		

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

	
		v2.setAlignment(Pos.CENTER);
		v2.getChildren().addAll(textArea, post, back);
		
		//center
		box.setPadding(new Insets(50, 50, 50, 50));
	
		box.setAlignment(Pos.CENTER);
	//	System.out.println(homeHubView.getTheReplyList().getSize());
		for (int i = 0; i < homeHubView.obj.getReplyList().getSize(); i++) {
			nameButton = new Button(homeHubView.obj.getName().getText());
		    l1 = new Label();
		    sep = new Separator();
		    sep.setOrientation(Orientation.HORIZONTAL);
			l1.setAlignment(Pos.CENTER);
			l1.setText(homeHubView.obj.getReplyList().getLink(i));
		    homeHubView.obj.getReplyList().printList() ;
			
		  //  box.getChildren().add(nameButton);
			box.getChildren().add(l1);
			box.getChildren().add(sep);
			}
		ScrollPane scroll = new ScrollPane();
		scroll.setContent(box);
		scroll.setPannable(true);
		scroll.setFitToWidth(true);
		scroll.setPrefSize(10, 10);
		
		
		
		//left 
		HBox box4 = new HBox(20);
		ScrollPane scorll2 = new ScrollPane();
		Label l2 = new Label();
		Label l3 = new Label();
		box4.setPrefSize(300, 300);
		l3.setText("Replying to" + ": " + homeHubView.getPostComment());
		box4.setAlignment(Pos.CENTER);
		box4.getChildren().addAll(l3, l2);
		scorll2.setContent(box4);
		
		root = new BorderPane();
		root.setTop(v2);
		root.setCenter(scroll);
		root.setLeft(scorll2);
		
		
	}
	
	public static BorderPane getRoot() {
		return root;
	}
	
	public void test() {
	HBox btnBox = new HBox(20);
	Post attempt = new Post(profileView2 = new Button(loginView.getUserName()), comment = new Button("comment"), label = new Label(), null);
	attempt.getName().setStyle("-fx-background-color: transparent");
	attempt.getName().hoverProperty().addListener(e -> {
		attempt.getName().setStyle("-fx-background-color: #939393");

	});

	homeHubView.obj.getReplyList().getList().getLast();
	attempt.getName().onMouseExitedProperty().set(e -> {
		attempt.getName().setStyle("-fx-background-color: transparent");
	});
	attempt.getName().setOnAction(e -> {
		userName = ((Button) e.getSource()).getText();
		homeHubView.setUserClicked(userName);
		this.root = new profileView(prim).getRoot();
		prim.getScene().setRoot(this.root);
	});
	Separator sep3 = new Separator();
	sep3.setOrientation(Orientation.HORIZONTAL);
	attempt.getText().setAlignment(Pos.CENTER);
	attempt.setLabelText(homeHubView.obj.getReplyList().getList().getLast());
	box.getChildren().add(profileView2);
	box.getChildren().add(attempt.getText());
	btnBox.getChildren().addAll(attempt.getComment());
	box.getChildren().add(btnBox);
	box.getChildren().addAll(sep3);
	}
	
	
	
	

}
