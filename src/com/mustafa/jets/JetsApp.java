package com.mustafa.jets;

import java.util.Scanner;

public class JetsApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		startAirport(keyboard);

	}
	
	public static void startAirport(Scanner keyboard) {
		Airport myAirport = new Airport();
		myAirport.initilizePilotLounge();
		myAirport.initilizeJetHanger();
		AirportManager myManager = new AirportManager(myAirport);
		myManager.start();
	}	

}
