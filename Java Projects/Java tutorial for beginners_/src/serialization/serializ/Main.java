package serialization.serializ;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInfo userInfo = new UserInfo();

        System.out.print("Enter the user name: ");
        userInfo.setName(scanner.nextLine());
        System.out.print("Enter the user age: ");
        userInfo.setAge(scanner.nextByte());
        System.out.print("Enter the user ID: ");
        userInfo.setId(scanner.next());

        // Save the ser file
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("userInfo.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(userInfo);

            // Close
            objectOutputStream.close();
            fileOutputStream.close();

            System.out.println("Save done :D");
        } catch (IOException e) {
            e.printStackTrace();
        }

        long sealId = ObjectStreamClass.lookup(userInfo.getClass()).getSerialVersionUID();
        System.out.println("sealId: " + sealId);
    }
}
