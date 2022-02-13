package javaAudio;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Open the audio file that we want to play (wav only)
        File audioFile = new File("mu/01. Vexento - Sad Robot.wav");
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            // Create clip
            Clip clip = AudioSystem.getClip();
            // Open the audio clip
            clip.open(audioStream);

            char input = '\0';
            boolean isLooping = false;
            while (true) {
                // Print the menu
                printMenu();
                // Get the user's input
                input = (char) System.in.read();
                input = Character.toLowerCase(input);
                // Clear the buffer
                System.in.skip(System.in.available());
                // Check the input
                switch (input) {
                    case 'p' -> clip.start(); // Play the audio clip
                    case 's' -> clip.stop(); // Stop the audio clip
                    case 'l' -> isLooping = loop(clip, isLooping); // Loop the audio clip
                    case 'r' -> clip.setFramePosition(0); // Restart the audio clip
                    case 'g' -> gotoSecond(clip); // Go to a specific second
                    case 'q' -> exit(clip);
                    default -> System.out.println("Invalid input");
                }
            }
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }

    private static boolean loop(Clip clip, boolean isLooping) {
        if (isLooping) {
            clip.loop(0);  // Stop looping
        } else {
            clip.loop(Clip.LOOP_CONTINUOUSLY); // Loop the audio clip
        }
        return !isLooping;
    }

    private static void gotoSecond(Clip clip) {
        // Go to a specific time
        System.out.print("Enter the second number: ");
        int seconds = new java.util.Scanner(System.in).nextInt();
        // Convert the seconds to microseconds
        long microseconds = seconds * 1000000L;
        // Check if the time is valid
        if (microseconds < clip.getMicrosecondLength()) {
            clip.setMicrosecondPosition(microseconds);
        } else {
            System.out.println("Invalid time");
        }

    }

    private static void exit(Clip clip) {
        System.out.println("Exiting...");
        clip.stop();
        clip.close();
        System.exit(0);
    }

    private static void printMenu() {
        System.out.print("(p)lay, (s)top, (l)oop,(r)est, (g)oto, (q)uit\n> ");
    }
}
