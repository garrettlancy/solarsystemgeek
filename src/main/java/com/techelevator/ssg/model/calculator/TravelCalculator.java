package com.techelevator.ssg.model.calculator;

import java.util.Map;

public class TravelCalculator {

	String planetName;
	String transportation;
	int earthAge;
	double alienDistanceYears;
	int alienDistanceAge;
	Map<String, Planet> planets;

	public TravelCalculator(String planetName, String transportation, int earthAge, Map<String, Planet> planets) {
		this.planetName = planetName;
		this.transportation = transportation;
		this.earthAge = earthAge;
		this.planets = planets;
	}


	public double getAlienDistanceYears() {
		double speed = 0;
		if(transportation.equals("Boeing 747")) {
			speed = 570;
		} else if (transportation.equals("Walking")) {
			speed = 3;
		} else if (transportation.equals("Car")) {
			speed = 100;
		} else if (transportation.equals("Bullet Train")) {
			speed = 200;
		} else if (transportation.equals("Concorde")) {
			speed = 1350;
		}

		speed = speed * 24 * 365;
		alienDistanceYears = Math.pow(speed / planets.get(planetName).getDistanceFromEarthInMiles(), -1);
		return alienDistanceYears;
	}
	
	public double getAlienDistanceAge() {
		return (earthAge + alienDistanceYears);
	}


	public String getPlanetName() {
		return planetName;
	}


	public String getTransportation() {
		return transportation;
	}


	public int getEarthAge() {
		return earthAge;
	}


	public Map<String, Planet> getPlanets() {
		return planets;
	}

}
