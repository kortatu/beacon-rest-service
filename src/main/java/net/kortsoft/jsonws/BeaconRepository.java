package net.kortsoft.jsonws;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface BeaconRepository extends JpaRepository<Beacon, Long> {
	public Beacon findByBeaconId(@Param("beaconId") String beaconId);
	public Beacon findByUrl(@Param("url") String url);
}
