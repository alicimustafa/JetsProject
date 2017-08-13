package com.mustafa.jets;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.xml.ws.Response;

public class JetsApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		startAirport(keyboard);

	}
	
	public static void startAirport(Scanner keyboard) {
		PilotLounge myPilots = initilizePilotLounge();
		JetHanger myAirPort = initilzeJetHanger(myPilots);
		int response;
		do {
			displayManue();
			response = getUserInput(keyboard);
			if(response > 0 && response < 5) {
				handleUserInput(response , myAirPort, keyboard);
			}
		} while(response != 5);
	}
	
	public static PilotLounge initilizePilotLounge() {
		Pilot[] pilotList = {
				new Pilot("James", 36, 360),
				new Pilot("Robert", 27, 200),
				new Pilot("Stacy", 39, 400),
				new Pilot("Pam", 25, 120),
				new Pilot("Kirk", 47, 600),
				new Pilot("Lisa", 56, 700),
				new Pilot("Hammil", 45, 460),
				new Pilot("Kerry", 38, 357),
				new Pilot("Samantha", 30, 290),
				new Pilot("Will", 57, 1000)
			};
		return new PilotLounge(pilotList); 
	}
	
	public static JetHanger initilzeJetHanger(PilotLounge pl) {
		Jet[] jetList = {
				new Jet("Airbuss 330", 300_000, 541, 8357, pl.getFreePilot()),
				new Jet("Boeing 777", 700_000, 590, 7800, pl.getFreePilot()),
				new Jet("Boeing 747", 500_000, 614, 6087, pl.getFreePilot()),
				new Jet("L-1011", 500_000, 605, 4404, pl.getFreePilot()),
				new Jet("Boeing 747", 500_000, 614, 6087, pl.getFreePilot())
		};
		return new JetHanger(jetList);
	}
	
	public static void displayManue() {
		System.out.println("(1) List Fleet");
		System.out.println("(2) View Fastest Jet");
		System.out.println("(3) View Jet with longest Range");
		System.out.println("(4) Add a Jet to Fleet");
		System.out.println("(5) Q");
		System.out.print("Enter Choice: ");
		
	}
	
	public static int getUserInput(Scanner keyboard) {
		int input = 0;
		try {
			input = keyboard.nextInt();
		} catch(InputMismatchException p) {
			System.out.println("You need to enter a number");
		}
		return input;
	}
	public static void handleUserInput(int input, JetHanger myAirport, Scanner keyboard) {
		switch(input) {
		case 1:
			printFleet(myAirport.getJetList(), keyboard);
			break;
		case 2:
			printJet(myAirport.getFastest());
			break;
		case 3:
			printJet(myAirport.getLongesRange());
			break;
		case 4:
			break;
		}
	}
	public static void printFleet(Jet[] planes, Scanner keyboard) {
		for (Jet jet : planes) {
			printJet(jet);
		}
		System.out.print("Continue(y): ");
		keyboard.next();
		System.out.println();
		
	}
	public static void printJet(Jet jet) {
		System.out.printf("Model: %s Speed: %.2f Range: %d Price: %.2f %n", 
				jet.getModel(), jet.convertToMach(), jet.getRange(), jet.getPrice());
	}

}
