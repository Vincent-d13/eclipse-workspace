package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Boot.Main;
import Model.applicantMap;
import Model.applicantTree;

public class saveData {

	public static void backUpMap() {

		try {
			FileOutputStream fos = new FileOutputStream("data/mapData.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(Main.appMap);
			System.out.println("saved");
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static applicantMap restoreMap() {
		File file = new File("data/mapData.dat");
		if (file.exists()) {
			try {
				FileInputStream fis = new FileInputStream("data/mapData.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);
				Main.appMap = (applicantMap) ois.readObject();
				ois.close();
				System.out.println("restored");
				return Main.appMap;
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}
		}
		return Main.appMap;
	}

	public static void backUpTree() {
		try {
			FileOutputStream fos = new FileOutputStream("data/treeData.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(Main.appTree);
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static applicantTree restoreTree() {
		File file = new File("data/treeData.dat");
		if (file.exists()) {
			try {
				FileInputStream fis = new FileInputStream("data/treeData.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);
				Main.appTree = (applicantTree) ois.readObject();
				ois.close();
				return Main.appTree;
			} catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}
		}
		return Main.appTree;
	}
	
	public static void saveDictionary() {
		try {
		FileOutputStream fos = new FileOutputStream("data/dictionary.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(Main.dic);
		oos.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static dictionaryHashSet restoreDictionary() {
		File file = new File("data/dictionary.dat");
		if (file.exists()) {
			try {
				FileInputStream fis = new FileInputStream("data/dictionary.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);
				Main.dic = (dictionaryHashSet) ois.readObject();
				ois.close();
				return Main.dic;
			}catch (ClassNotFoundException | IOException e) {
				e.printStackTrace();
			}
		}
		return Main.dic;
	}

}
