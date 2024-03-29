package practiceProject17;
import java.util.*;
import java.io.*;

public class Practice_Project17 {
    public static void main(String[] args) {
        String fileName = "data.txt";

        createFile(fileName);
        writeToFile(fileName, "Hello, World!");
        String content = readFromFile(fileName);
        System.out.println("File content: " + content);
        updateFile(fileName, "Updated content");
        content = readFromFile(fileName);
        System.out.println("Updated file content: " + content);
        deleteFile(fileName);
    }

    public static void createFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void writeToFile(String fileName, String data) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(data);
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static String readFromFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try {
            FileReader reader = new FileReader(fileName);
            int character;
            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return content.toString();
    }

    public static void updateFile(String fileName, String newData) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(newData);
            writer.close();
            System.out.println("Successfully updated the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.delete()) {
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
