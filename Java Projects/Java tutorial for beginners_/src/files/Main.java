package files;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        // Open the file
        File file = new File("secret_message.txt");

        if (file.exists()) {
            System.out.println("File exists :)");
            // Get the file path
            String filePath = file.getPath();
            System.out.println("File path: " + filePath);
            // Get the file absolute path
            String absolutePath = file.getAbsolutePath();
            System.out.println("File absolute path: " + absolutePath);
            // Get the file size
            long fileSize = file.length();
            System.out.println("File size: " + fileSize + " bytes");
            // If the file is hidden
            boolean isHidden = file.isHidden();
            System.out.println("Is hidden: " + isHidden);
            // If the file is a directory
            boolean isDirectory = file.isDirectory();
            System.out.println("Is directory: " + isDirectory);
            // If the file is a file
            boolean isFile = file.isFile();
            System.out.println("Is file: " + isFile);

            // Delete the file
            boolean deleted = file.delete();
            System.out.println("Deleted: " + deleted);
        } else {
            System.out.println("File does not exist :(");
        }
    }
}
