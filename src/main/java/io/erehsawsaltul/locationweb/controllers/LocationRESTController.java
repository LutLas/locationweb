package io.erehsawsaltul.locationweb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.erehsawsaltul.locationweb.entities.Location;
import io.erehsawsaltul.locationweb.services.LocationService;

@RestController
@RequestMapping("/locations")
public class LocationRESTController {

	@Autowired
	LocationService locationService;

	@GetMapping
	public List<Location> getLocation() {
		return locationService.getAllLocations();
	}

	@PostMapping
	public Location getLocation(@RequestBody Location location) {
		return locationService.saveLocation(location);
	}

	@PutMapping
	public Location updateLocation(@RequestBody Location location) {
		return locationService.saveLocation(location);

	}

	@DeleteMapping("/{id}")
	public void deleteLocation(@PathVariable("id") int id) {
		Location location = locationService.getLocationById(id);
		locationService.deleteLocation(location);
	}

	@GetMapping("/{id}")
	public Location getLocation(@PathVariable("id") int id) {
		return locationService.getLocationById(id);
	}
}
