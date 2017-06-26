package com.techelevator.ssg.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.ssg.model.calculator.AgeCalculator;
import com.techelevator.ssg.model.calculator.Planet;

@Controller
public class AgeCalculatorController {
	
	@RequestMapping(value="/alienAgeCalculatorInput", method=RequestMethod.GET)
	public String displayAgeCalculatorInputPage(Model modelHolder) {
		modelHolder.addAttribute("planets", getPlanets());
		return "alienAgeCalculatorInput";
	}
	
	@RequestMapping(value="/alienAgeCalculatorResult", method=RequestMethod.GET)
	public String displayWeightCalculatorResultPage(Model modelHolder, @RequestParam String planetName, @RequestParam int earthAge) {
		AgeCalculator calculator = new AgeCalculator(planetName, earthAge, getPlanets());
		modelHolder.addAttribute("calculator", calculator);
		return "alienAgeCalculatorResult";
	}
	
	private Map<String, Planet> getPlanets() {
		Map<String, Planet> planets = new LinkedHashMap<>();
		planets.put("Mercury", new Planet().setPlanetName("Mercury").setWeightMultiplier(0.37).setYearLength(87.96).setDistanceFromEarthInMiles(56974146).setImageName("mercury.jpg"));
		planets.put("Venus", new Planet().setPlanetName("Venus").setWeightMultiplier(0.90).setYearLength(224.68).setDistanceFromEarthInMiles(25724767).setImageName("venus.jpg"));
		planets.put("Earth", new Planet().setPlanetName("Earth").setWeightMultiplier(1).setYearLength(365).setDistanceFromEarthInMiles(0).setImageName("earth.jpg"));
		planets.put("Mars", new Planet().setPlanetName("Mars").setWeightMultiplier(0.38).setYearLength(686.98).setDistanceFromEarthInMiles(48678219).setImageName("mars.jpg"));
		planets.put("Jupiter", new Planet().setPlanetName("Jupiter").setWeightMultiplier(2.65).setYearLength(11.862 * 365).setDistanceFromEarthInMiles(390674710).setImageName("jupiter.jpg"));
		planets.put("Saturn", new Planet().setPlanetName("Saturn").setWeightMultiplier(1.13).setYearLength(829.456 * 365).setDistanceFromEarthInMiles(792248270).setImageName("saturn.jpg"));
		planets.put("Uranus", new Planet().setPlanetName("Uranus").setWeightMultiplier(1.09).setYearLength(84.07 * 365).setDistanceFromEarthInMiles(1692662530).setImageName("uranus.jpg"));
		planets.put("Neptune", new Planet().setPlanetName("Neptune").setWeightMultiplier(1.43).setYearLength(164.81 * 365).setDistanceFromEarthInMiles(2703959960L).setImageName("neptune.jpg"));
        return planets;
	}
}