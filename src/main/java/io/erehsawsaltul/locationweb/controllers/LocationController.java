package io.erehsawsaltul.locationweb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import io.erehsawsaltul.locationweb.entities.Location;
import io.erehsawsaltul.locationweb.services.LocationService;
import io.erehsawsaltul.locationweb.utils.EmailUtil;

@Controller
public class LocationController {
	
	@Autowired
	private LocationService locationService;
	
	@Autowired
	private EmailUtil emailUtil;
	
	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createLocation";
	}
	
	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
		Location locationSaved = locationService.saveLocation(location);
		String msg = "Location ID: "+locationSaved.getId()+" Saved Successfully";
		modelMap.addAttribute("msg", msg);
		//emailUtil.sendEmail("ziwanibozyangbo@gmail.com", "Location Saved", "Location Saved Successfully");
		return "createLocation";
	}
	
	@RequestMapping("/displayLocations")
	public String displayLocations(ModelMap modelMap) {
		List<Location> allLocations = locationService.getAllLocations();
		modelMap.addAttribute("allLocations",allLocations);
		return "displayLocations";
	}
	
	@RequestMapping("/deleteLocation")
	public String deleteLocation(@RequestParam("id") int id,ModelMap modelMap) {
		Location locationById = locationService.getLocationById(id);
		locationService.deleteLocation(locationById);
		List<Location> allLocations = locationService.getAllLocations();
		modelMap.addAttribute("allLocations",allLocations);
		return "displayLocations";
	}
	
	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id") int id,ModelMap modelMap) {
		Location locationById = locationService.getLocationById(id);
		Location location = locationService.updateLocation(locationById);
		modelMap.addAttribute("location",location);
		return "editLocation";
	}
	
	@RequestMapping("/updateLoc")
	public String updateLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
		locationService.updateLocation(location);
		List<Location> allLocations = locationService.getAllLocations();
		modelMap.addAttribute("allLocations",allLocations);
		return "displayLocations";
	}

	public LocationService getLocationService() {
		return locationService;
	}

	public void setLocationService(LocationService locationService) {
		this.locationService = locationService;
	}

	public EmailUtil getEmailUtil() {
		return emailUtil;
	}

	public void setEmailUtil(EmailUtil emailUtil) {
		this.emailUtil = emailUtil;
	}
}
