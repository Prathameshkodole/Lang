import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Exp7 {

    public static void main(String[] args) {
        String filename = "my_text_file.txt";

        // Write some data to the file
        writeDataToFile(filename, List.of("This is the first line.",
                                          "This is the second line.",
                                          "And this is the third line."));

        // Read data from the file
        List<String> lines = readDataFromFile(filename);
        if (lines != null) {
            System.out.println("\nContents of the file:");
            for (String line : lines) {
                System.out.println(line);
            }
        }

        // Append more data to the file
        appendDataToFile(filename, List.of("This line is appended.",
                                           "Another appended line."));

        // Read data again to see the appended content
        List<String> updatedLines = readDataFromFile(filename);
        if (updatedLines != null) {
            System.out.println("\nContents of the file after appending:");
            for (String line : updatedLines) {
                System.out.println(line);
            }
        }
    }

    // Method to write data to a text file
    public static void writeDataToFile(String filename, List<String> data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (String line : data) {
                writer.write(line);
                writer.newLine(); // Add a newline character after each line
            }
            System.out.println("Data successfully written to: " + filename);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    // Method to read data from a text file
    public static List<String> readDataFromFile(String filename) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            return lines;
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
            return null;
        }
    }

    // Method to append data to a text file
    public static void appendDataToFile(String filename, List<String> data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) { // The 'true' argument enables append mode
            for (String line : data) {
                writer.write(line);
                writer.newLine(); // Add a newline character after each line
            }
            System.out.println("Data successfully appended to: " + filename);
        } catch (IOException e) {
            System.err.println("Error appending to file: " + e.getMessage());
        }
    }
}
