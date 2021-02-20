package io.erehsawsaltul.locationweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.erehsawsaltul.locationweb.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
