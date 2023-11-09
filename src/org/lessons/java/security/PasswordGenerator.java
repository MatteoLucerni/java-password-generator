package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String name = in.nextLine();
		System.out.print("Cognome: ");
		String surname = in.nextLine();
		System.out.print("Colore preferito: ");
		String color = in.nextLine();
		System.out.print("Giorno di nascita (numerico): ");
		if(!in.hasNextInt()) {
			System.out.println("Devi inserire un valore numerico. Riparti");
			return;
		}
		int day = Integer.valueOf(in.nextLine());
		System.out.print("Mese di nascita (numerico): ");
		if(!in.hasNextInt()) {
			System.out.println("Devi inserire un valore numerico. Riparti");
			return;
		}
		int month = Integer.valueOf(in.nextLine());
		System.out.print("Anno di nascita (numerico): ");
		if(!in.hasNextInt()) {
			System.out.println("Devi inserire un valore numerico. Riparti");
			return;
		}
		int year = Integer.valueOf(in.nextLine());
		
		in.close();
		
		int birthDate = day+month+year;
		
		System.out.println(name + "-" + surname + "-" + color + "-" + birthDate);
	}
}
