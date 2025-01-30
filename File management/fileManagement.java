import java.io.File; 
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class fileManagement {

	public static void main(String[] args){
		
		String data = "This is the data in the output file\n";
		try {
      		// Creates a FileWriter
      		// FileWriter file = new FileWriter("output.txt");
      		// Creates a BufferedWriter
      		BufferedWriter output = new BufferedWriter(new FileWriter("output.txt"));

			// Writes the string to the file
      		output.write(data);
      		output.write("BufferedWriter работает!");
      		output.newLine();
      		// Closes the writer
      		output.close();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

	public void fileTest () {
		try {
			File file = new File("testfile.txt");
			// Create file at filesystem
			if (file.createNewFile()) { 
				System.out.println("File created: " + file.getName()); 
			} else { 
				System.out.println("File already exists."); 
			}
			// Check file properties 
			System.out.println("Absolute Path: " + file.getAbsolutePath()); 
			System.out.println("Is File: " + file.isFile()); 
			System.out.println("Is Directory: " + file.isDirectory());

			// Delete the file 
			if (file.delete()) { 
				System.out.println("File deleted successfully."); 
			} else { 
				System.out.println("Failed to delete the file."); 
			} 
		} catch (IOException e) { 
			e.printStackTrace(); 
		}
	}
	
}