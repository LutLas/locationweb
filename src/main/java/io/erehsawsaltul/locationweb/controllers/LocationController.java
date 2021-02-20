package io.erehsawsaltul.locationweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import io.erehsawsaltul.locationweb.entities.Location;
import io.erehsawsaltul.locationweb.services.LocationService;

@Controller
public class LocationController {
	
	@Autowired
	private LocationService locationService;
	
	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createLocation";
	}
	
	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
		Location locationSaved = locationService.saveLocation(location);
		String msg = "Location ID: "+locationSaved.getId()+" Saved Successfully";
		modelMap.addAttribute("msg", msg);
		return "createLocation";
	}

	public LocationService getLocationService() {
		return locationService;
	}

	public void setLocationService(LocationService locationService) {
		this.locationService = locationService;
	}
}
