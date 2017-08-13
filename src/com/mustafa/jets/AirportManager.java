package com.mustafa.jets;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AirportManager {
	private Scanner keyboard = new Scanner(System.in);
	private Airport myAirport;

	public AirportManager(Airport myAirport) {
		super();
		this.myAirport = myAirport;
	}

	public Airport getMyAirport() {
		return myAirport;
	}

	public void start() {
		int response;
		do {
			displayMenu();
			response = getUserInput();
			if (response > 0 && response < 8) {
				handleUserInput(response);
			}
		} while (response != 8);
	}

	private void displayMenu() {
		System.out.println("+------------------------------------+");
		System.out.println("| (1) List Fleet                     |");
		System.out.println("| (2) View Fastest Jet               |");
		System.out.println("| (3) View Jet with longest Range    |");
		System.out.println("| (4) Add a Jet to Fleet             |");
		System.out.println("| (5) List all Pilots                |");
		System.out.println("| (6) List Available Pilots          |");
		System.out.println("| (7) Hire a Pilot                   |");
		System.out.println("| (8) Quit                           |");
		System.out.println("+------------------------------------+");
		System.out.print("Enter Choice: ");

	}

	private int getUserInput() {
		int input = 0;
		try {
			input = keyboard.nextInt();
		} catch (InputMismatchException p) {
			System.out.println("You need to enter a number");
			keyboard.nextLine();
		}
		return input;
	}

	private void handleUserInput(int response) {
		switch (response) {
		case 1:
			printFleet(myAirport.getMyHanger().getJetList());
			break;
		case 2:
			printJet(myAirport.getMyHanger().getFastest());
			break;
		case 3:
			printJet(myAirport.getMyHanger().getLongesRange());
			break;
		case 4:
			if (myAirport.getMylounge().getFreePilots().length > 0) {
				try {
					myAirport.getMyHanger().addJet(generateNewJet());
				} catch (InputMismatchException p) {
					keyboard.nextLine();
					System.out.println("Invalid input");
				}
			} else {
				System.out.println("You need to hire more Pilots before you can add a plane");
			}
			break;
		case 5:
			printPilotList(myAirport.getMylounge().getPilotList());
			break;
		case 6:
			if (myAirport.getMylounge().getFreePilots().length > 0) {
				printPilotList(myAirport.getMylounge().getFreePilots());
			} else {
				System.out.println("You don't have Avalable Pilots you need to hire more");
			}
			break;
		case 7:
			try {
				myAirport.getMylounge().addPilot(generateNewPilot());
			} catch (InputMismatchException p) {
				keyboard.nextLine();
				System.out.println("Invalid input");
			}
			break;
		}
	}

	public void printFleet(Jet[] planes) {
		for (Jet jet : planes) {
			printJet(jet);
		}
	}

	private void printJet(Jet jet) {
		System.out.println("+------------------------------------------------------------+");
		System.out.printf("Model: %s Speed: %.2f Range: %d Price: %.2f %n", jet.getModel(), jet.convertToMach(),
				jet.getRange(), jet.getPrice());
		
		printPilot(jet.getCurrentPilot());
	}

	private void printPilotList(Pilot[] pl) {
		for (Pilot pilot : pl) {
			printPilot(pilot);
		}
	}

	private void printPilot(Pilot p) {
		System.out.printf("Pilot name: %s Age: %d Hours of Flight: %d%n", p.getName(), p.getAge(),
				p.getFligthExperiance());
	}

	private Jet generateNewJet() {
		String model;
		int range;
		double price, speed;
		keyboard.nextLine();
		System.out.println("Enter new jet information");
		System.out.print("Model: ");
		model = keyboard.nextLine();
		System.out.print("Speed: ");
		speed = keyboard.nextDouble();
		System.out.print("Range: ");
		range = keyboard.nextInt();
		System.out.print("Price: ");
		price = keyboard.nextDouble();
		return new Jet(model, price, speed, range, myAirport.getMylounge().getFreePilot());
	}

	private Pilot generateNewPilot() {
		String name;
		int age, experiance;
		keyboard.nextLine();
		System.out.println("Enter Pilot information");
		System.out.print("Name: ");
		name = keyboard.nextLine();
		System.out.print("Age: ");
		age = keyboard.nextInt();
		System.out.print("Experiance: ");
		experiance = keyboard.nextInt();
		return new Pilot(name, age, experiance);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AirportManager [myAirport=");
		builder.append(myAirport);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((myAirport == null) ? 0 : myAirport.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AirportManager other = (AirportManager) obj;
		if (myAirport == null) {
			if (other.myAirport != null)
				return false;
		} else if (!myAirport.equals(other.myAirport))
			return false;
		return true;
	}

}
