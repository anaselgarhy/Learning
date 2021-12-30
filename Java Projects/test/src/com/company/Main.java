package com.company;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		while(true) {
			System.out.println("كم الساعة؟ ");
			int time = read.nextInt();
			           // Conditional  obretor
			String w = (time <= 12) ? "صباح الخير" : "مساء الخير ";
			System.out.println(w);
		}
	}
	}