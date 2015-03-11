package SATWords.VocabList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		File file = new File("url.txt");

		FileReader fr = null;
		try {
			fr = new FileReader(file);

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}

		BufferedReader br = new BufferedReader(fr);
		String url = br.readLine();
		System.out.println(url);
		try {
			fr.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	String readLine(BufferedReader br) throws IOException {

		return br.readLine();
	}

}
