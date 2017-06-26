package com.techelevator.ssg.model.calculator;

import java.util.Map;

public class AgeCalculator {
	
	Map<String, Planet> planets;
	String planetName;
	int earthAge;
	double alienAge;
	
	public AgeCalculator(String planetName, int earthAge, Map<String, Planet> planets) {
		this.planetName = planetName;
		this.earthAge = earthAge;
		this.planets = planets;
	}

	public double getAlienAge() {
		alienAge = ((earthAge * 365) / planets.get(planetName).getYearLength() / 365);
		return alienAge;
	}
	
	public Map<String, Planet> getPlanets() {
		return planets;
	}
	
	public String getPlanetName() {
		return planetName;
	}

	public int getEarthAge() {
		return earthAge;
	}

}
