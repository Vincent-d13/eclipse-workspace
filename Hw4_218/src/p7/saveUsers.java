package p7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//import Boot.Main;
//import Model.applicantMap;

public class saveUsers {

//	public static void backUpMap() {
//
//		try {
//			FileOutputStream fos = new FileOutputStream("data/mapData.dat");
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			oos.writeObject(Main.appMap);
//			System.out.println("saved");
//			oos.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public static applicantMap restoreMap() {
//		File file = new File("data/mapData.dat");
//		if (file.exists()) {
//			try {
//				FileInputStream fis = new FileInputStream("data/mapData.dat");
//				ObjectInputStream ois = new ObjectInputStream(fis);
//				Main.appMap = (applicantMap) ois.readObject();
//				ois.close();
//				System.out.println("restored");
//				return Main.appMap;
//			} catch (ClassNotFoundException | IOException e) {
//				e.printStackTrace();
//			}
//		}
//		return Main.appMap;
//	}
}
