package serialization.serializ.deserialization;

import serialization.serializ.UserInfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String[] args) {
        UserInfo userInfo = null;

        try {
            FileInputStream fileInputStream = new FileInputStream("userInfo.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            // Read
            userInfo = (UserInfo) objectInputStream.readObject();

            // Close readers
            fileInputStream.close();
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (userInfo != null) {
            System.out.println(userInfo);
        }
    }
}
