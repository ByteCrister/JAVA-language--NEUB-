import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderExample {
    public static void main(String[] args) {
        // Specify the path to the file on the desktop
        String desktopPath = System.getProperty("user.home") + "\\OneDrive\\Desktop";
        String filePath = desktopPath + "\\New Text Document (3).txt"; // Replace "yourFileName.txt" with the actual file name

        // Create a File object
        File file = new File(filePath);

        try {
            // Create a Scanner object and pass the File as an argument
            Scanner scanner = new Scanner(file);

            // Use the hasNext() method to check if there is more input
            while (scanner.hasNext()) {
                // Use the next() method to read the next token (word, line, etc.)
                String data = scanner.next();

                // Process the data as needed (e.g., print it)
                System.out.print(data+" ");
            }

            // Close the Scanner to release resources
            scanner.close();
        } catch (FileNotFoundException e) {
            // Handle the exception if the file is not found
            System.err.println("File not found: " + filePath);
            e.printStackTrace();
        }
    }
}
