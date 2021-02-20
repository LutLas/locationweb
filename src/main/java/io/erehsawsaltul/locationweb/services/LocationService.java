package io.erehsawsaltul.locationweb.services;

import java.util.List;

import io.erehsawsaltul.locationweb.entities.Location;

public interface LocationService {
	
	Location saveLocation(Location location);

	Location updateLocation(Location location);

	void deleteLocation(Location location);

	Location getLocationById(int id);

	List<Location> getAllLocations();
}
