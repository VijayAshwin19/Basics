package filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreatefileInFolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String folderPath = "//home//vijay//Documents//Test//";

        // Create the folder if it doesn't exist
        File folder = new File(folderPath);
        if (!folder.exists()) {
            folder.mkdirs();
        }

        // Array of names to write into the files
        String[] names = {
            "VijayAshwin",
            "TonyStark",
            "Mistake's learn from me",
            "Moving Forward",
            "ironman",
            "hulk",
            "thor",
            "chris",
            "java",
            "naga"
        };

        // Create 10 files in the folder and write names into them
        for (int i = 1; i <= 10; i++) {
            String fileName = "file" + i + ".txt";
            File file = new File(folderPath + fileName);

            try (FileWriter writer = new FileWriter(file)) {
                writer.write(names[i - 1]);
                System.out.println("File created with name: " + fileName + " and content: " + names[i - 1]);
            } catch (IOException e) {
                System.err.println("Error creating/writing to file: " + fileName);
                e.printStackTrace();
            }
        }

	}

}
