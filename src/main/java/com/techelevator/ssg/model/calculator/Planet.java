package com.techelevator.ssg.model.calculator;

public class Planet {

	String planetName;
	double weightMultiplier;
	String imageName;
	double yearLength;
	long milesFromEarth;
	
	public double getYearLength() {
		return yearLength;
	}
	public Planet setYearLength(double yearLength) {
		this.yearLength = yearLength;
		return this;
	}
	public long getDistanceFromEarthInMiles() {
		return milesFromEarth;
	}
	public Planet setDistanceFromEarthInMiles(long distanceFromEarthInMiles) {
		this.milesFromEarth = distanceFromEarthInMiles;
		return this;
	}
	public String getPlanetName() {
		return planetName;
	}
	public Planet setPlanetName(String planetName) {
		this.planetName = planetName;
		return this;
	}
	public double getWeightMultiplier() {
		return weightMultiplier;
	}
	public Planet setWeightMultiplier(double weightMultiplier) {
		this.weightMultiplier = weightMultiplier;
		return this;
	}
	public String getImageName() {
		return imageName;
	}
	public Planet setImageName(String imageName) {
		this.imageName = imageName;
		return this;
	}
	
}
