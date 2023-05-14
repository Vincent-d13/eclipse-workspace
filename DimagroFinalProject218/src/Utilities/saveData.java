package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Launch.Main;
import Model.userLinkList;
import Model.userStorage;


public class saveData {
	
	
	public static void backUpList() {

		try {
			FileOutputStream fos = new FileOutputStream("data/listData.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(Main.theList);
			System.out.println("saved");
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static userLinkList restoreList() {
		File file = new File("data/listData.dat");
		if (file.exists()) {
			try {
				FileInputStream fis = new FileInputStream("data/listData.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);
				Main.theList = (userLinkList) ois.readObject();
				ois.close();
				System.out.println("restored");
				return Main.theList;
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}
		}
		return Main.theList;
	}
	
	public static void backUpStorage() {
		try {
			FileOutputStream fos = new FileOutputStream("data/mapData.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(Main.userMap);
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static userStorage restoreStorage() {
		File file = new File("data/mapData.dat");
		if (file.exists()) {
			try {
				FileInputStream fis = new FileInputStream("data/mapData.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);
				Main.userMap = (userStorage) ois.readObject();
				ois.close();
				return Main.userMap;
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}
		}
		return Main.userMap;
	}
	
	public static void backUpnameList() {
		try {
			FileOutputStream fos = new FileOutputStream("data/treeData.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(Main.theUserName);
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static userLinkList restoreNameList() {
		File file = new File("data/treeData.dat");
		if (file.exists()) {
			try {
				FileInputStream fis = new FileInputStream("data/treeData.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);
				Main.theUserName = (userLinkList) ois.readObject();
				ois.close();
				return Main.theUserName;
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}
		}
		return Main.theUserName;
	}
	
	public static void backUpDic() {
		try {
			FileOutputStream fos = new FileOutputStream("data/dictionary.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(Main.theUserName);
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static dictionaryHashSet restoreDic() {
		File file = new File("data/dictionary.dat");
		if (file.exists()) {
			try {
				FileInputStream fis = new FileInputStream("data/dictionary.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);
				Main.theUserName = (userLinkList) ois.readObject();
				ois.close();
				return Main.dictionary;
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}
		}
		return Main.dictionary;
	}
	
	}


