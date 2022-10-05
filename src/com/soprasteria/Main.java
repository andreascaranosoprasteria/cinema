package com.soprasteria;

import java.util.Scanner;

public class Main {
	/*
	 * Scrivere un programma che calcola il costo di un biglietto del cinema, sapendo che il costo del biglietto dipende dall'età dell'utente:
		- se l'utente ha meno di 7 anni il biglietto è gratis
		- se l'utente ha da 7 anni e meno di 15 il biglietto costa 6 euro
		- se l'utente ha almeno 15 anni il biglietto costa 10 euro
		Una volta finito, provate a fare questa modifica:
		Il proprietario del cinema decide che ogni mercoledì il biglietto verrà scontato di 2 euro. Modificare il programma in modo da gestire tale sconto (chiedere all'utente che giorno è)
	 */
	
	static Scanner input = new Scanner(System.in);
	final String PROMO = "Mer";
	final static byte UNDER_7 = 0;
	final static byte OVER_6 = 6;
	final static byte OVER_14 = 10;
	public static void main(String[] args) {
		String giorno;
		int eta;
		System.out.println(">>GIORNO DELL'EVENTO: [Lun,Mar,Mer,Gio,Ven,Sab,Dom]");
		giorno = input.nextLine();
		System.out.println(">>INSERISCI ETA'");
		eta = input.nextInt();
		if(eta <7)System.out.println("Pagherai -->"+UNDER_7);
		else if(eta >= 7 && eta<15) {
			if(giorno.toLowerCase().equals("mer"))System.out.println("Pagherai -->"+(OVER_6 - 2));
			else System.out.println("Pagherai -->"+OVER_6);
		}else if(eta >= 15) {
			if(giorno.toLowerCase().equals("mer"))System.out.println("Pagherai -->"+(OVER_14 - 2));
			else System.out.println("Pagherai -->"+OVER_14);
		}
		
	}

}
