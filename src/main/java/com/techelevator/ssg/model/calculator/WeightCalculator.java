package com.techelevator.ssg.model.calculator;

import java.util.Map;

public class WeightCalculator {
	
	Map<String, Planet> planets;
	String planetName;
	double earthWeight;
	double alienWeight;
	
	public WeightCalculator(String planetName, int earthWeight, Map<String, Planet> planets) {
		this.planetName = planetName;
		this.earthWeight = earthWeight;
		this.planets = planets;
	}

	public double getAlienWeight() {
		alienWeight = earthWeight * planets.get(planetName).getWeightMultiplier();
		return alienWeight;
	}
	
	public Map<String, Planet> getPlanets() {
		return planets;
	}
	
	public String getPlanetName() {
		return planetName;
	}

	public double getEarthWeight() {
		return earthWeight;
	}

	public WeightCalculator setAlienWeight(double alienWeight) {
		this.alienWeight = alienWeight;
		return this;
	}

}
