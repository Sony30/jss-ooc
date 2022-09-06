import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.File;
import java.util.ArrayList;

public class Contest2 {

	public static void removeSpam(String folder) {

		// Your logic goes here

		ArrayList<String> spamWords = new ArrayList<>();
		spamWords.add("Null");
		spamWords.add("Email");
		spamWords.add("No");
		spamWords.add("Reply");

		String content = "";
		File files[] = (new File(folder)).listFiles();

		for(File currentFile: files) {
			try {
				content = Files.readString(Paths.get(currentFile.getAbsolutePath()));
			
				for(String temp: spamWords)
					content = content.replace(temp, "");
				
				FileWriter fW = new FileWriter(currentFile);
				fW.write(content);
				fW.close();
			} catch(IOException ie) {
				ie.printStackTrace();
			}
		}

	}

	public static void main(String[] args) throws Exception {
		String folder = "C:/notes";

		removeSpam(folder);
	}

}
