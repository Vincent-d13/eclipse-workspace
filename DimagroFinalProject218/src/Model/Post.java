package Model;

import java.io.Serializable;
import java.util.ArrayList;

import Launch.Main;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Post implements Serializable{
	
	private Button comment ;
	private Label text ;
	private userLinkList replyList;
	private Button name;
    private String userUp;
    private userLinkList nameList;
	
	public Post (Button name, Button comment, Label text, String userUp) {
		this.name = name;
		this.comment = comment;
		this.text = text;
		this.userUp = userUp;
		this.replyList = new userLinkList();
		this.nameList = new userLinkList();
	}


	public userLinkList getNameList() {
		return nameList;
	}


	public void setNameList(userLinkList nameList) {
		this.nameList = nameList;
	}


	public String getUserUp() {
		return userUp;
	}




	public void setUserUp(String userUp) {
		this.userUp = userUp;
	}




	public Button getName() {
		return name;
	}



	public void setName(Button name) {
		this.name = name;
	}

	public userLinkList getReplyList() {
		return replyList ;
	}



	public void setReplyList(userLinkList replyList) {
		this.replyList = replyList;
	}

	public Button getComment() {
		return comment;
	}

	public void setComment(Button comment) {
		this.comment = comment;
		
	}

	public Label getText() {
		return text;
	}

	public void setText(Label string) {
		this.text = string;
	}
	
	public void setLabelText(String words) {
		text.setText(words);
	}
	
	
	
	
	

}
