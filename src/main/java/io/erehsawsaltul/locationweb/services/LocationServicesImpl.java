package io.erehsawsaltul.locationweb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.erehsawsaltul.locationweb.entities.Location;
import io.erehsawsaltul.locationweb.repositories.LocationRepository;

@Service
public class LocationServicesImpl implements LocationService {
	
	@Autowired
	private LocationRepository locationRepository;

	@Override
	public Location saveLocation(Location location) {
		return locationRepository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		return locationRepository.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		locationRepository.delete(location);
	}

	@Override
	public Location getLocationById(int id) {
		return locationRepository.findById(id).orElseThrow();
	}

	@Override
	public List<Location> getAllLocations() {
		return locationRepository.findAll();
	}

	public LocationRepository getLocationRepository() {
		return locationRepository;
	}

	public void setLocationRepository(LocationRepository locationRepository) {
		this.locationRepository = locationRepository;
	}
}
