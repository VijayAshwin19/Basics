package filehandling;

import java.io.FileReader;
import java.io.IOException;

public class ReadJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("//home//vijay//Documents//Java//Override.java");
			int i = 0;
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			System.out.println("Wrong code" + e);
		}

	}

}
