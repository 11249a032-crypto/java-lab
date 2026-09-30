import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) {
        try {
            File file = new File("sample.txt");

            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }

            FileWriter writer = new FileWriter(file);
            writer.write("Hello, this is a Java file operation program.\n");
            writer.write("This is the second line.");
            writer.close();

            FileReader reader = new FileReader(file);
            int ch;

            System.out.println("File contents:");

            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            reader.close();

            System.out.println("\nFile name: " + file.getName());
            System.out.println("File size: " + file.length() + " bytes");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}