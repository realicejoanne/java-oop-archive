/* //Setelah diperbaiki (throw)
import java.io.*;

public class ReadFile {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		File file = new File("Data.txt");
		BufferedReader fileReader;
		fileReader = new BufferedReader(new FileReader(file));
		
		while(true){
			String line = fileReader.readLine();
			if(line == null) break;
			System.out.println(line);
		}
	}
}
*/
/*
public class ReadFile {
	public static void main(String[] args){
		File file = new File("Data.txt");
		BufferedReader fileReader;
		fileReader = new BufferedReader(new FileReader(file));
		
		while(true){
			String line = fileReader.readLine();
			if (line == null)
				break;
			System.out.println(line);
		}
	}
}
*/
import java.io.*;

public class ReadFile {
	public static void method1() throws FileNotFoundException, IOException {
		File file = new File("Data.txt");
		BufferedReader fileReader;
		fileReader = new BufferedReader(new FileReader(file));
		
		while(true){
			String line = fileReader.readLine();
			if (line == null)
				break;
			System.out.println(line);
		}
	}
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try {
			method1();
		}
		catch (FileNotFoundException ex){
			System.out.println(ex.getMessage());
		}
	}
}